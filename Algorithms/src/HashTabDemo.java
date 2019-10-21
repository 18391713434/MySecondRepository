import java.util.Scanner;

public class HashTabDemo {
	public static void main(String[] args) {
		//����һ����ϣ��
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
			//������Ա
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
//������ϣ��
class HashTab{
	public int size;//��������
	private EmpLinkedList[] empLinkedListArray;
	public HashTab(int size) {
		
		empLinkedListArray=new EmpLinkedList[size];
		for(int i=0;i<empLinkedListArray.length;i++)
				empLinkedListArray[i]=new EmpLinkedList();
	}
	public void add(Emp emp) {
		//���ݹ�Ա��id���жϸù�ԱӦ����ӵ�����������
		int empLinkedListNO=hashFun(emp.id);
		empLinkedListArray[empLinkedListNO].add(emp);
		
		}
	//������ϣ��
	public void list() {
		for(int i=0;i<size;i++)
			empLinkedListArray[i].list();
	}
	//��дɢ�к���
	public int hashFun(int id) {
	
		return id%size;
	}
	public void findEmpById(int id) {
		int empLinkedListNO=hashFun(id);
		Emp emp=empLinkedListArray[empLinkedListNO].finEmpById(id);
		if(emp!=null) {
			System.out.format("�ڵ�%d�������ҵ�",empLinkedListNO+1);
		}else {
			System.out.print("�Ҳ���");
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
	//ͷָ��ָ���һ��Emp�����������������head��ָ���һ����Ա
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
	//�˳�ʱ����
	curemp.next=emp;
	}
	public void list() {
		if(head==null) {
			System.out.println("��ǰ����Ϊ��");
			return;
			
		}
		System.out.print("��ǰ�����ֵΪ��");
		Emp curemp=head;
		while(true) {
			System.out.format("=>id=%d name=%s|t",curemp.id,curemp.name);
			if(curemp.next==null)
				break;
			
		}
		curemp=curemp.next;//����
	}
	public Emp finEmpById(int id) {
		if(head==null) {
			System.out.print("�����");
			
			return null;
		}
		Emp curemp=head;
		while(true) {
			if(curemp.id==id) {
			
				break;//�ҵ�
				
			}
			if(curemp.next==null) {
				//�Ҳ���
				curemp=null;
			}	
		
			curemp=curemp.next;
		
		}	return curemp;
		
	}
}