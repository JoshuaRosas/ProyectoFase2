import java.util.ArrayList;

public class HashC<E extends Comparable<E>> {
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
		
	public HashC(int n) {
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
	private int functionHash(long key) {
		return (int) (key % m);
	}
	private int linearProbing(int dressHash, int key) {
		int posInit = dressHash;								//Posicion inicial para recorrer es POSINIT = DRESSHASH
		do {																				//////////		Inicio de Bucle
			if (table.get(dressHash).mark == 0)												// Si la direccion hash DRESSHASH esta vacia
				return dressHash;															//  se retorna la posicion
			if (table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key)	// Si la direccion hash DRESSHASH esta ocupada y KEY de la posicion es igual a KEY enviada
				return -1;																	//  se retorna -1
			dressHash = (dressHash + 1) % m;												// La direccion hash DRESSHASH ahora es = (DRESSHASH + 1) MODULO Tamaño de la tabla
		} while (dressHash != posInit);														/////////		El Bucle seguira  siempre y cuando DRESSHASH sea diferente a la posicion inicial POSINIT 
		return -1;												//Se retorna -1 si se sale del bucle
	}
	
	public void insert(int key, E reg) {
		int dressHash = functionHash(key);						
		dressHash = linearProbing(dressHash, key);				
		if (dressHash == -1) {										
			System.out.println("Key table hash is full or key is duplicated....");	
		}
		else {														
			Element aux = new Element(1,new Register<E>(key,reg));					
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
	
	public E search(long key) {
		int dressHash = functionHash(key);
		int posInit = dressHash;
		do {
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey() == key) 
				return table.get(dressHash).reg.value;
			dressHash = (dressHash + 1) % m;
		}while(dressHash != posInit);
		return null;
	}

	//Metodo remove
	public int delete (int key) {					
		int direc = functionHash(key);										//DIREC toma el valor del = MODULO (KEY % M)
		int posInit = direc;												//POSINIT es = DIREC
		do {					
			if(table.get(direc).reg != null){																		//////		Inicio de Bucle		
				if(table.get(direc).mark == 1 && table.get(direc).reg.getKey() == key) {							// Si la direccion hash DIREC esta ocupada y KEY de la posicion es igual a KEY enviada
					table.get(direc).mark = 0;																		//  se crea ELEMENT con MARK 0 y NULL																	
					System.out.println("¡Llave :"+key+" eliminada | D.Real: "+ posInit +" | D.Hash "+direc+"!\n");	//  se envia mensaje de eliminacion
					return direc;																					//  se retorna la direccion hash DIREC
				}
			}//  
			direc = functionHash(direc + 1);																	// La direccion hash DIREC ahora es = (DIREC + 1) MODULO Tamaño de la tabla
		}while (direc != posInit);																				/////		Bucle Finaliza si DIREC y POSINIT son iguales
		System.out.println("La llave: "+ key +" no existe...\n");			// Se da mensaje que llave no existe
		return -1;															// Se retorna -1 dado que no existe
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
		String s= "D.Real\tD.Hash\tRegister\n";
		int i = 0;
		for (Element item : table) {
			s+= (i++) + " -->\t";
			if(item.mark == 1 && item.reg == null)
				s += "NoUsable\n";
			if (item.mark == 1 && item.reg != null)
			{
				s += functionHash(item.reg.key) + "\t" + item.reg+"\n";
			}else
				if (item.mark != 1)
					s += "empty\n";
		}
		return s;
	}
}