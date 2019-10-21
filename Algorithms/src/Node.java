
public class Node<Key extends Comparable<Key>,Value > {

	Key key;
	Value val;
	Node left;
	Node right;
	boolean color ;
	 int N;

	public Node(Key key,Value val,int N) {
		this.key=key;
		this.val=val;
		this.N=N;
}
	public Node(Key key,Value val,int N,boolean color) {
		this.key=key;
		this.val=val;
		this.N=N;
		this.color=color;
}
	}