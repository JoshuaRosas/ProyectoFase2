//IMPLEMENTADO

public class ListLinked<T> implements TDAList<T> {
	protected Node<T> first;
	protected int count;
	
	public ListLinked() {
		this.first = null;
		this.count = 0;
	}
	
	public boolean isEmptyList() {
		return this.first == null;
	}
	
	public int length() {
		return this.count;
	}
	
	public void destroyList() {
		while(this.first != null) {
			this.first = this.first.getNext();
		}
		this.count = 0;
	}
	
	public int search(T x) {
		Node<T> aux = this.first;
		for(int i = 0;aux != null; aux = aux.getNext(), i++) {
			if(aux.getData().equals(x)) {
				return 1;
			}
		}
		return -1;
	}
	public T searchint (int i) {
		Node<T> aux = this.first;
		int j = 0;
		do {
			if(i==j) {
				return aux.getData();
			}
			aux = aux.getNext();
			j++;
		}while(aux!=null);
		return null;
	}
	public void insertLast(T x) {
		if(this.isEmptyList()) {
			this.insertFirst(x);
		} else {
			Node<T> lastNode = getLastNode();
			lastNode.setNext(new Node<T>(x));
			this.count++;
		}
	}
	
	private Node<T> getLastNode(){
		Node<T> aux = this.first;
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		return aux;
	}
	
	public void insertFirst(T x) {
		this.first = new Node<T>(x, this.first);
		this.count++;
	}
	
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
		String str="";
		Node<T> aux = this.first;
		for (int i=0; aux != null; aux = aux.getNext(), i++)
			str += "  ["+i+"] = "+aux.getData()+"";
		return str;
	}
}
