class Boy{
	private int no;
	private Boy next;
	public Boy(int no) {
		this.no=no;
	}
	public int getNo() {
		return no;
	}
	public void setNo() {
		this.no=no;
	}
	public void setNext(Boy boy) {
		// TODO Auto-generated method stub
		this.next=next;
	}
	public Boy getNext() {
		// TODO Auto-generated method stub
		return next;
	}
}
class CircleSingleLinkedList{
	Boy first=new Boy(-1);
	
	public void addBoy(int nums) {
		if(nums<1)
			return;
		Boy curBoy=null;
		for(int i=1;i<=nums;i++) {
		Boy boy=new Boy(i);
		if(i==1)
		{	first=boy;
		first.setNext(first);
		curBoy=first;
		}
		else {
			curBoy.setNext(boy);
			boy.setNext(first);
			curBoy=boy;
		}
		}
       }
	
	//������ǰ��������
	public void showBoy() {
		if(first==null)
			return;//�����
		Boy curBoy=first;
		while(true) {
			if(curBoy.getNext()==first)
				break;//��������
			System.out.print(curBoy);
			
		}
		curBoy=curBoy.getNext();
		
	}
	public void countBoy(int startno,int counNum,int nums) {
		if(first==null||startno<1||startno>nums)
			return;//��������
		Boy helper=first;
		while(true) {
			if(helper.getNext()==null)
				break;
			helper=helper.getNext();
		}
		for(int i=0;i<startno-1;i++) {
			first=first.getNext();
			helper=helper.getNext();
		}
		//firstָ��Ľ����Ҫ��Ȧ��С��
		first=first.getNext();
		helper.setNext(first);
		 
	}
}
public class Josepfu {
public static void main(String[] args) {
	
	
}

}