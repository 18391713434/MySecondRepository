

public class RedBlackBST<Key extends Comparable<Key>,Value>{
	private Node node;
	private Node root;
	private static final boolean RED=true;
	private static final boolean BLACK=false;
	private boolean isRed(Node h) {
		if(h==null) return false;
		return h.color==RED;
				
	}
	public int size() {
	
		return size(root);
	}
	private int size(Node x) {
		if(x==null)
			return 0;
		else return x.N;
	}
	private Node rotateLeft(Node h) {
		Node x=h.right;
		h.right=x;
		x.left=h;
		x.color=h.color;
		h.color=RED;
		x.N=h.N;
		h.N=size(h.left)+size(h.right)+1;
		return x;
		
		
	}
	private Node rotateRight(Node h) {
		Node x=h.left;
		h.left=x.right;
		x.right=h;
		x.color=h.color;
		h.color=RED;
		x.N=h.N;
		h.N=size(h.left)+size(h.right)+1;
		return x;
	}
	private void flipColors(Node h) {
		h.color=RED;
		h.left.color=BLACK;
		h.right.color=BLACK;
		
	}
	public void put(Key key,Value val) {
		root=put(root,key,val);
		root.color=BLACK;
	}
	private Node put(Node h, Key key, Value val) {
		// TODO Auto-generated method stub
		if(h==null)
			return new Node(key,val,1,RED);
		int cmp=key.compareTo((Key) h.key);
		if(cmp<0)  h.left=put(h.left,key,val);
		else if (cmp>0)  h.right=put(h.right,key,val);
		else h.val=val; 
		if(isRed(h.right)&&!isRed(h.left))	h=rotateLeft(h);
		if(isRed(h.left)&&!isRed(h.left.left))	h=rotateRight(h);
		if(isRed(h.left)&&isRed(h.right)) flipColors(h);
		h.N=size(h.left)+size(h.right)+1;
		return h;
	
		
	}
	

}