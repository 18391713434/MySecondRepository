

public abstract class Queue2<Item> implements Iterable<Item>{
	private Node first;
	private Node last;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public int size() {
		return N;
	}
	public void dequeue(Item item) {
		Node oldlast=last;
		last.item=item;
		last.next=null;
		if(isEmpty())
			first=last;
		else
			oldlast.next=last;
		N++;
	}
	public Item dequeue() {
		Item item=first.item;
		first=first.next;
		if(isEmpty())
			last=null;
		N--;
		return item;
	}


/*public static void main(String[] args) {
	Queue<String> q=new Queue<String> ();
	while(!StdIn.isEmpty()) {
		String item=StdIn.readString();
		if(!item.equals("-"))
			q.enqueue(item);
		else if(!q.isEmpty())
		System.out.println(q.dequeue()+"");
		
	}
	System.out.println("("+q.size()+"left on queue");
	
}*/
}

