//IMPLEMENTADO

public class OrderListLinked<T extends Comparable<T>> extends ListLinked<T> {
	
	public OrderListLinked() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int search(T x) {
		Node<T> aux = this.first;
		while(aux != null && aux.getData().compareTo(x) < 0) {
			aux = aux.getNext();
		}
		for(int i = 0;aux != null; aux = aux.getNext(), i++) {
			if(aux.getData().equals(x)) {
				return i;
			}
		}
		return -1;
	}
	
	public void insert(T x) {
		Node<T> aux = new Node<T>(x);
		Node<T> aux2;
		Node<T> aux3;
		if(this.first == null) {
			this.first = aux;
		} else {
			if(x.compareTo(this.first.getData()) < 0) {
				aux.setNext(this.first);
				this.first = aux;
			} else {
				aux2 = this.first;
				aux3 = this.first;
				while(x.compareTo(aux2.getData()) >= 0 && aux2.getNext() != null) {
					aux3 = aux2;
					aux2 = aux2.getNext();
				}
				if(x.compareTo(aux2.getData()) >= 0) {
					aux2.setNext(aux);
				} else {
					aux.setNext(aux2);
					aux3.setNext(aux);
				}
			}
		}
		this.count++;
	}
	
	@Override
	public void remove(T x) {
		Node<T> aux = this.first;
		Node<T> aux2 = null;
		
		while(aux != null) {
			if(aux.getData().equals(x)) {
				if(aux == this.first) {
					this.first = this.first.getNext();
				} else {
					aux2.setNext(aux.getNext());
				}
				this.count--;
			} 
			aux2 = aux;
			aux = aux.getNext();
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		Node<T> aux = this.first;
		for(int i = 0; aux != null; aux = aux.getNext(), i++) {
			str += i + ": " + aux.getData() + "\n";
			//str += "[" + i + "] =  " + aux.getData() + "\n";
		}
		return str;
	}
	
}
