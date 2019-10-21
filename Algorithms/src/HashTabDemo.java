import java.util.Scanner;

public class HashTabDemo {
	public static void main(String[] args) {
		//创建一个哈希表
		HashTab hashtab=new HashTab(7);
			String key="";
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("add");
			System.out.println("list");
			System.out.println("find");
			System.out.println("exit");
		key=scanner.next();
		switch(key) {
		case "add":
			int id=scanner.nextInt();
			String name=scanner.next();
			//创建雇员
			Emp emp=new Emp(id,name);
			hashtab.add(emp);
			break;
			default :
				break;
			case "list":
			hashtab.list();
			break;
			case "find":
				
				id=scanner.nextInt();
				hashtab.findEmpById(id);
			
			case "exit":
				scanner.close();
				System.exit(0);
				break;
				
			
		}}
	
		
		
	}
}
//创建哈希表
class HashTab{
	public int size;//几条链表
	private EmpLinkedList[] empLinkedListArray;
	public HashTab(int size) {
		
		empLinkedListArray=new EmpLinkedList[size];
		for(int i=0;i<empLinkedListArray.length;i++)
				empLinkedListArray[i]=new EmpLinkedList();
	}
	public void add(Emp emp) {
		//根据雇员的id来判断该雇员应该添加到哪条链表中
		int empLinkedListNO=hashFun(emp.id);
		empLinkedListArray[empLinkedListNO].add(emp);
		
		}
	//遍历哈希表
	public void list() {
		for(int i=0;i<size;i++)
			empLinkedListArray[i].list();
	}
	//编写散列函数
	public int hashFun(int id) {
	
		return id%size;
	}
	public void findEmpById(int id) {
		int empLinkedListNO=hashFun(id);
		Emp emp=empLinkedListArray[empLinkedListNO].finEmpById(id);
		if(emp!=null) {
			System.out.format("在第%d链表中找到",empLinkedListNO+1);
		}else {
			System.out.print("找不到");
		}
	}
}
class Emp{
	 public int id;
	 public String name;
	 Emp next;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}
	 
}
class EmpLinkedList{
	//头指针指向第一个Emp，因此我们这个链表的head是指向第一个雇员
	private Emp head;
	public void add(Emp emp) {
		if(head==null) {
			head=emp;
		return;}
	Emp curemp=head;
	while(true) {
		if(curemp.next==null) {
			break;
		}
		curemp=curemp.next;
		
	}
	//退出时后退
	curemp.next=emp;
	}
	public void list() {
		if(head==null) {
			System.out.println("当前链表为空");
			return;
			
		}
		System.out.print("当前链表的值为：");
		Emp curemp=head;
		while(true) {
			System.out.format("=>id=%d name=%s|t",curemp.id,curemp.name);
			if(curemp.next==null)
				break;
			
		}
		curemp=curemp.next;//遍历
	}
	public Emp finEmpById(int id) {
		if(head==null) {
			System.out.print("链表空");
			
			return null;
		}
		Emp curemp=head;
		while(true) {
			if(curemp.id==id) {
			
				break;//找到
				
			}
			if(curemp.next==null) {
				//找不到
				curemp=null;
			}	
		
			curemp=curemp.next;
		
		}	return curemp;
		
	}
}