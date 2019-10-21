
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sl;
	}
class Node{
	public int Num;
	public String Name;
	public Node next;
	public Node(int num,String name) {
		this.Num=num;
		this.Name=name;
				}
	}
  class SingleLinkedList{
	Node head=null;
	//添加结点到单向链表
	public void add(Node node) {
		Node temp=head;
		while(true) {
			if(temp.next==null)
				break;
		}
		temp.next=node;
	}
	public void addByOrder(Node node) {
		Node temp=head;
		boolean flag=false;
		while(true) {
			if(temp.next==null) {
				break;
			}
			if(temp.next.Num>node.Num) {	
				break;
			}
			else if(temp.next.Num==node.Num) {
				flag=true;
				break;
			}
			temp=temp.next;
		}
		if(flag==true) {
			System.out.print("已存在");
		}
		else {
		node.next=temp.next;
		temp.next=node;}
		
	}
	//根据编号来修改信息
	public void update(Node newNode) {
		if(head.next==null)
		{
			System.out.print("空表");
			return;
		}
		Node temp=head.next;
		boolean flag=false;// 是否找到
		while(true) {
			if(temp.next==null) {
			break;
			}
			else if(temp.Num==newNode.Num)
				break;
			}
		if(flag==true) {
			temp.Name=newNode.Name;
		}
		else {
			System.out.print("找不到");
		}
			
	temp=temp.next;
		
	}
	public void list() {
		if(head.next==null) {
			System.out.print("链表为空");
			return;
		}
		Node temp=head.next;
		while(true) {
			if(temp==null)
				break;
		}
		System.out.print(temp);
		temp=temp.next;
		
	}
	public void delete(Node node) {
		Node temp=head;
		boolean flag=false;
		while(true) {
			if(temp.next==null)
				break;
			else if(temp.next.Num==node.Num)
			{
				flag=true;
				break;
			}
		}
		if(flag) {
			temp.next=temp.next.next;
		}
		else
		{
			//找不到
		}
		temp=temp.next;
		
	}//
	
	
	//
	//新浪面试题   获取链表有效结点数
	public int getLength(Node head) {
		if(head.next==null)
			return 0;
		int length=0;
		Node curnode=head.next;
		while(curnode!=null) {
			length++;
			curnode=curnode.next;
		}return length;
	}
	//
	//查询单链表倒数第K个结点
	//先把链表从头到尾遍历一下     得到结点个数      用总结点个数减去倒数第K个结点
   public Node findLastNode(SingleLinkedList sl,Node head,int index) {
	   if(head.next==null) {
		   return null;
		   
	   }
	   int size=sl.getLength(head);
	   if(size<=0||size>size)
		   return null; 
	   Node cur=head.next;
	   for(int i=0;i<size-index;i++) {
		  cur=cur.next;
		   
	   }
	   return cur;
	 
   }//
   //单链表的反转  腾讯 面试
   public void reverseList(Node head) {
	   
	     Node pre=null;
	    Node next=null;
	    Node temp=head.next;
	   
	    while(temp!=null) {
	    	
	    	next=temp.next;
	    	temp.next=pre;
	    	pre=temp;
	    	temp=next;
	    	
	    	
	    }
	    head.next=pre.next;
   }
   


}
}