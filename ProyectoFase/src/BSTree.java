import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BSTree<E extends Comparable<E>> {
	///////////////////////////////////////////////////
	class Node{
		protected E data;
		protected Node left, right;
		
		public Node(E data) {
			this (data,null,null);
		}
		public Node(E data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	//////////////////////////////////////////////
	private Node root;
	private int count;
	private int area;
	private int path;
	public BSTree() {
		this.root = null;
		this.count = 0;
		this.path = 0;
		}
	public void clear() {
		this.root = null;
	}
	public boolean isEmpty() {
		return this.root == null;
		}
	public Node getRoot() {
		return this.root;
	}
	public int CountNoHojas(Node root) {
		if(root == null || (root.left == null && root.right == null))
			return 0;
		return 1 + CountNoHojas(root.left) + CountNoHojas(root.right);
	}
	public void CountHojas(){
		this.count = CountHojasRec(this.root);
	}
	public int CountHojasRec(Node node) {
		if (node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 1;
		else
			return CountHojasRec(node.left) + CountHojasRec(node.right);
	}
	public int getAltura(E root) throws ItemNoFound {
		search(root);
		Node height = toNode(root);
		return getAlturaRec(height);
	}
	public int getAlturaRec(Node node) {
		if(node.left== null && node.right == null)
			return 0;
		int altIzq=-1, altDer=-1;
		if(node.left != null)
			altIzq = getAlturaRec(node.left);
		if(node.right != null)
			altDer = getAlturaRec(node.right);
		if(altIzq>altDer)
			return altIzq+1;
		else 
			return altDer+1;
	}
	public Node toNode(E x) {
		Node busqueda = this.root;
		while(busqueda.data.equals(x) == false) {
			if(x.compareTo(busqueda.data)<0)
				busqueda = busqueda.left;
			else
				busqueda = busqueda.right;
		}
		return busqueda;
	}
	public int AreaBSTree() {
		this.count = 0;
		CountHojas();
		int a = getAlturaRec(getRoot());
		this.area =  a * this.count;
		System.out.println("Area del Arbol: "+ this.count+ " * "+ a + " = "+this.area);
		return this.area;
	}
	public int obtenerArea() {
		return this.area;
	}
	public void preOrderSinRecursividad() throws ItemNoFound{
		Node root = this.root;
		if (isEmpty())
			throw new ItemNoFound("El BSTree esta vacio");
		Stack<Node> s1 = new Stack<Node>();
		s1.push(root);
		
		while(s1.size() > 0) {
			Node temp = s1.pop();
			System.out.print(temp.data + ", ");
			if(temp.right != null)
				s1.push(temp.right);
			if(temp.left != null)
				s1.push(temp.left);
		}
	}
	public void insert(E x) throws ItemDuplicated{
		this.root = insertRec(x,this.root);
		}
	protected Node insertRec(E x, Node actual) throws ItemDuplicated{
		Node res = actual;
		if(actual == null)
			res = new Node(x);
		else {
			int resC = actual.data.compareTo(x);
			if (resC == 0) 
				throw new ItemDuplicated("El elemento "+x+" Ya existe en el arbol");
			if (resC < 0) 
				res.right = insertRec(x, actual.right);
			else
				res.left = insertRec(x,actual.left);			
		}
		return res;
	}
	public E search(E x) throws ItemNoFound{
		if (isEmpty() == true)
			throw new ItemNoFound("El Arbol esta Vacio... Imposible buscar: "+ x);
		Node busqueda = this.root;
		while(busqueda.data.equals(x) != true) {
			if(x.compareTo(busqueda.data)<0)
				busqueda = busqueda.left;
			else
				busqueda = busqueda.right;
			if (busqueda == null) 
				throw new ItemNoFound("El elemento: "+x+" No existe en el arbol");
		}
		return busqueda.data;
	}
	
	public void remove(E x) throws ItemNoFound{
		if (x == null)
			throw new ItemNoFound("Imposible remover: "+ x);
		else 
			search(x);
			remove(this.root, x);
	}
	public Node remove(Node root, E x) {
		if(root == null)
			return null;
		if(x.compareTo(root.data)<0)
			root.left = remove(root.left, x);
		else 
			if(x.compareTo(root.data)>0)
				root.right = remove(root.right, x);
			else {	
				if(root.left == null || root.right == null) {
					Node temp = null;
					temp = root.left == null ? root.right : root.left;
					//? : son	Condicional
					if (temp == null) {
						return null;
					}
					else {

						return root;
					}
				}
				else {
					Node sucesor = getSucesor(root);
					root.data = sucesor.data;
					root.right = remove(root.right, sucesor.data);
				}
			}
		return root;
	}
	public void updateNode(E x,E y) throws ItemNoFound, ItemDuplicated {
		search(x);
		Node busqueda = this.root;
		while(busqueda.data.equals(x) == false) {
			if(x.compareTo(busqueda.data)<0)
				busqueda = busqueda.left;
			else
				busqueda = busqueda.right;
		}
		E temp = busqueda.data;
		busqueda.data = y;
		insert(temp);
	}
	public Stack longerPath() throws ItemNoFound{
		Stack<Node> s1 = new Stack<Node>();
		if(isEmpty()) {
			throw new ItemNoFound("Arbol Vacio...");
		}
		longerPathRec(this.root);
		return s1;
	}
	public int longerPathRec(Node node) {
		Stack<Node> s1 = new Stack<Node>();
		s1.push(node);
		if (node == null) {
			return 0;
		}
		if(node.left == null && node.right == null)
			return 1;
		int lh = longerPathRec(node.left);
		int rh = longerPathRec(node.right);
		this.path = Math.max(this.path, lh + rh + 1);
		return Math.max(lh, rh) + 1;
	}
	public Node getSucesor(Node node) {
		if (node == null)
			return null;
		Node temp = node.right;
		while(temp != null)
			temp = temp.left;
		return temp;
	}
	
	
	public String toString() {
		String str = "";
		inOrden(this.root);
		/*for ( int i = 0; i<a.size();i++) {
			str += a.get(i).toString();
		}*/
		return  a.toString();
	}
	/*
	public void inOrden() {
		inOrden(this.root);
		//System.out.println();
	}
	*/
	public void inOrden(Node actual) {
		if(actual.left != null)	
			inOrden(actual.left);
		//System.out.print(actual.data.toString()+", ");
		a.add(actual.data);
		if(actual.right != null)
			inOrden(actual.right);	
	}	
	private Set<E> a = new HashSet<E>();
}
