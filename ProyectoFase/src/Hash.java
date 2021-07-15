import java.util.ArrayList;

public class Hash<E extends Comparable<E>> {
	protected class Element {
		int mark;
		Register<E> reg;
		public Element(int mark, Register<E> reg) {
			this.mark = mark;
			this.reg = reg;
		}
	}
	
	protected ArrayList<Element> table;
	protected int m;
		
	public Hash(int n) {
		this.m = n;			//calcular el primo cercano a n y asignarlo a m
		this.table = new ArrayList<Element>(m);
		for(int i = 0; i < m; i++) {
			this.table.add(new Element(0,null));
		}
	}
	
	
	public boolean numPrimo(int n) {
		int cont = 2;
		boolean rest = true;
		while((rest) && (cont != n)) {
			if(n % cont == 0) {
				rest = false;
			}
			cont++;
		}
		return rest;
	}
	
	public int numprimoCercano(int n) {
		n++;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				n++;
				i = 2;
			} else {
				continue;
			}
		}
		return n;
	}
	
	private int functionHash(int key) {
		return key % m;
	}
	
	private int linearProbing(int dressHash, int key, int tp) {
		int posInit = dressHash;
		do {
			if(tp == 1) {
				if(table.get(dressHash).mark == 0) {
					return dressHash;		//se encontro posicion vacia
				}
				if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key) {
					return -2;				//ya insertado
				}
			}
			if(tp == 2) {
				if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key) {
					return -3;				//ya insertado
				}
			}
			/*
			if(table.get(dressHash).mark == 0) {
				return dressHash;		//se encontro posicion vacia
			}
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key) {
				return -2;				//ya insertado
			}
			*/
			dressHash = (dressHash + 1) % m;
		} while(dressHash != posInit);
		return -1;
	}
	
	public void insert(int key, E reg) {
		int dressHash = functionHash(key);
		dressHash = linearProbing(dressHash, key, 1);
		if(dressHash == -1) {
			System.out.println("Key table hash is full... ");
			return;
		} else if(dressHash == -2) {
			System.out.println("Key is duplicated");
			return;
		} else {
			Element aux = new Element(1, new Register<E>(key, reg));
			table.set(dressHash, aux);
		}
	}
	//Metodo de insercion para la prueba Cuadratica
	public void insertC(int key, E reg) {
		int dressHash = functionHash(key);
		int dressHash2 = cuadraticProbing(dressHash, key);
		if(dressHash == -1) {
			System.out.println("Key table hash is full... ");
			return;
		} else if(dressHash == -2) {
			System.out.println("Key is duplicated");
			return;
		} else if(dressHash != dressHash2) {
			Element aux2 = new Element(1, new Register<E>(key, reg));
			table.set(dressHash2, aux2);
		} else {
			Element aux = new Element(1, new Register<E>(key, reg));
			table.set(dressHash, aux);
		}
	}
	
	public E search(int key) {
		int dressHash = functionHash(key);
		int posInit = dressHash;
		int tempo = linearProbing(dressHash, key, 2);
		do {
			/*
			if(tempo == -3) {
				if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key) {
					return table.get(dressHash).reg.value;
				} else {
					dressHash = (dressHash + 1) % m;
				}
			}
			*/
			
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key && tempo == -3) {
				System.out.print("Se encontro el elemento: ");
				return table.get(dressHash).reg.value;
			} else {
				dressHash = (dressHash + 1) % m;
			}
			
		} while(dressHash != posInit);
		System.out.print("No se encontro el elemento ");
		return null;
	}
	//Metodo remove hecho por Joshua Rosas
	public E remove(int key) {
		int dressHash = functionHash(key);
		int posInit = dressHash;
		int tempo = linearProbing(dressHash, key, 2);
		do {
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key && tempo == -3) {
				System.out.print("Se elimino el elemento: ");
				E ob = table.get(dressHash).reg.value;
				table.set(dressHash, new Element(0,null));
				return ob;
			} else {
				dressHash = (dressHash + 1) % m;
			}
		} while(dressHash != posInit);
		return null;
	}
	//Metodo por pliegue hecho por Joshua Rosas
	public int metPliegue(int key) {
		//char ch[];
		//ch = String.valueOf(key).toCharArray();
		//ch = Integer.toChar(key);
		//int kl = ch.length;
		String cad = String.valueOf(key);
		char ch[] = String.valueOf(cad).toCharArray();
		int sum = 0;
		for(int i = 0; i < ch.length; i++) {
			sum += ch[i];
		}
		return sum % m;
	}
	
	private int cuadraticProbing(int dressHash, int key) {
		int posInit = dressHash;
		int i = 1;
		do {
			
			if(table.get(dressHash).mark == 0) {
				return dressHash;		//se encontro posicion vacia
			}
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key) {
				return -2;				//ya insertado
			}
			while(table.get(dressHash).reg.getKey() == key) {
				//i++;
				//i = i + 1;
				//int p = functionHash(key);
				dressHash = dressHash + (i*i);
				dressHash = dressHash % m;
				i++;
				return dressHash;
			}
			dressHash = (dressHash + 1) % m;
		} while(dressHash != posInit);
		return -1;
	}
	
	@Override
	public String toString() {
		String s = "D.Real\tD.Hash\tRegister\n";
		int i = 0;
		for(Element item : table) {
			s += (i++) + " -->\t";
			if(item.mark == 1) {
				s += functionHash(item.reg.key) + "\t" + item.reg + "\n";
			} else {
				s += "empty\n";
			}
		}
		return s;
	}
}
