

class HeroNode{
	public int Num;
	public String Name;
	public HeroNode pre;
	public HeroNode next;
	public HeroNode(int num,String name) {
		this.Num=num;
		this.Name=name;
				}
	}

public class DoubleLinkedList {
	HeroNode head=new HeroNode(0,"");
	public HeroNode getHead() {
		return head;
	}
public void list() {
	if(head.next==null)
	{
		return;//±íÎª¿Õ
	}
	HeroNode temp=head.next;
	while(temp!=null) {
		System.out.print(temp);
		temp=temp.next;
	}
}
public void add(HeroNode newNode) {
	HeroNode temp=head.next;
	while(true) {
		if(temp.next==null)
			break;
	}
	temp.next=newNode;
	newNode.pre=temp;
	temp=temp.next;

}
public void update(HeroNode heronode) {
	 if(head.next==null)  return;
	 HeroNode temp=head.next;
	 boolean flag=false;
	 while(true) {
		 if(temp==null)
			 break;
		 if(temp.Num==heronode.Num)
		 { flag=true;
			 break;}
		 
	 }
	 if(flag==true) {
		 temp.Name=heronode.Name;
	 }
	 temp=temp.next;
	 
}
public void delete(int delNum) {
	if(head.next==null) return;
	HeroNode temp=head.next;
	while(true) {
		if(temp==null)
			break;
		if(temp.Num==delNum)
			temp.pre.next=temp.next;
	        temp.next.pre=temp.pre;
			break;
	}
	temp=temp.next;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
