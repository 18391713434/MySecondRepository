import java.util.Queue;

public class BST<Key extends Comparable<Key>,Value>
{
	private Node root;
	private static boolean RED=true;
	private static boolean BLACK=false;
		private class Node
		{
			private Key key;
			private Value val;
			private Node left,right;
			private boolean color;
			private int N;
			public Node(Key key,Value val,int N) {
				this.key=key;
				this.val=val;
				this.N=N;
			}
		}
		public int size() {
			return size(root);
		}
		private int size(Node x) {
			if(x==null)
				return 0;
			else return x.N;
		}
		public Value get(Key key) {
			return get(root,key);
		}
	
		private Value get(Node x,Key key) {
			//以x为根结点的子树中查找并返回key所对应的值
			//如果找不到则返回null
			if(x==null) return null;
			int cmp=key.compareTo(x.key);
			if(cmp<0) return get(x.left,key);
			else if(cmp>0) return get(x.right,key);
			else return x.val;
			
		}
		public void put(Key key,Value val) {
			//查找key如果找到则更新它的值，如果找不到则创建一个新的结点
			root=put(root,key,val);
			
		}
		private Node put(Node x,Key key,Value val)
		{
			//key如果找到则更新它的值
			//否则将以key和val为键值对的新结点插入到该子树中
			if(x==null) return new Node(key,val,1);
			int cmp=key.compareTo(x.key);
			if(cmp<0) x.left=put(x.left,key,val);
			else if(cmp>0) x.right=put(x.right,key,val);
			else x.val=val;
			x.N=size(x.left)+size(x.right)+1;
			return x;
			}
		public Key min() {
	
			return min(root).key;
	
		}
		public Node min(Node x) {
			if(x.left==null) return x;
			return min(x.left);
		}
		public Key max() {
			return max(root).key;
			
		}
		private Node max(Node x) {
			if(x.right==null);
			return x;
			
				
		}
		public Key floor(Key key) {
			Node x=floor(root,key);
			if(x==null) return null;
			return x.key;
		}
		public Node floor(Node x,Key key) {//小于等于key的最大键floor(key);
			if(x==null) return null;
			int cmp=key.compareTo(x.key);
			if(cmp==0) return x;
		    if(cmp<0) return floor(x.left,key);
			Node t=floor(x.right,key);
			if(t!=null) return t;
			else return x;
			
			
		}
		public Key select (int k) {
			return select(root,k).key;
			
		}
		private Node select(Node x,int k) {
			//返回排名为k的结点         
			if(x==null) return null;
			int t=size(x.left);
			if(t>k) return select(x.left,k);
			else if(t<k) return select(x.right,k-t-1);
			else  return x;
		}
		public void deleteMin() {
			root=deleteMin(root);
		}
		private Node deleteMin(Node x) {
			if(x.left==null) return x.right;
			x.left=deleteMin(x.left);
			x.N=size(x.left)+size(x.right)+1;
			return x;
		}
		public void delete(Key key) {
			root=delete(root,key);
			
		}
		public Node delete(Node x,Key key) {
			if(x==null) return null;
			int cmp=key.compareTo(x.key);
			if(cmp<0) x.left=delete(x.left,key);
			else if(cmp>0) x.right=delete(x.right,key);
			else {
				if(x.right==null)
					return x.left;
				if(x.left==null)
					return x.right;
				Node t=x;
				x=min(x.right);
				x.right=deleteMin(t.right);
				x.left=t.left;
				
				
			}
			x.N=size(x.left)+size(x.right)+1;
			return x;
			
		}
		private void print(Node x) {
			if(x==null) return;
			print(x.left);
			System.out.print(x.key);
			print(x.right);
			
		}
		public Iterable<Key> keys(){  
			return keys(min(),max());
		}
		private Iterable<Key> keys(Key lo,Key hi){
			Queue<Key> queue = null;
			keys(root,queue,lo,hi);
			return queue;
		}
		private void keys(Node x,Queue<Key> queue,Key lo,Key hi) {
			if(x==null) return;
			int cmplo=lo.compareTo(x.key);
			int cmphi=hi.compareTo(x.key);
			if(cmplo<0)   keys(x.left,queue,lo,hi);
			if(cmplo<=0&&cmphi>=0) queue.add(x.key);
			if(cmphi>0)   keys(x.right,queue,lo,hi);
			
		}
		Node rotateLeft(Node h) {
			Node x=h.right;
			h.right=x.left;
			x.left=h;
			x.color=h.color;
			h.color=RED;
			x.N=h.N;
			h.N=size(h.left)+size(h.right)+1;
			return x;
			
		}
		Node rotateRight(Node h) {
			Node x=h.left;
			h.left=x.right; 
			x.right=h;
			x.color=h.color;
			h.color=RED;
			x.N=h.N;
			h.N=size(h.left)+size(h.right)+1;
			return x;
					
		}
		void flipColors(Node h) {
			h.color=RED;
			h.left.color=BLACK;
			h.right.color=BLACK;
			
		}
		
}