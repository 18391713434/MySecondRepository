import java.util.Scanner;

class ArrayStack{
	
	private int maxSize;
	private int[] stack;
	private int top=-1;
	public ArrayStack(int maxSize) {
	stack=new int[this.maxSize];
	
	}
	public boolean isFull() {
		return top==maxSize-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void push(int value) {
		if(isFull()) {
			return;//栈满
		}
		top++;
		stack[top]=value;
	}
	public int pop() {
		if(isEmpty())
		{
			throw new RuntimeException("栈空");
		}
		int value=stack[top];
		top--;
		return value;
	}
	public void list() {
		//遍历需要从栈顶开始
		if(isEmpty())
			return;
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]);
		}
	}
}
public class ArrayStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack stack=new ArrayStack(4);
		String key="";
		boolean loop=true;
		Scanner scan=new Scanner(System.in);
		while(loop) {
			///菜单
			System.out.println("show");
			System.out.println("exit");
			System.out.println("push");
			System.out.println("pop");
			System.out.println("please choose an item");
			key=scan.nextLine();
			switch(key) {
			case "show":
				stack.list();
				break;
			case "push":
			System.out.println("请放入数据");
			int value=scan.nextInt();
			stack.push(value);
				break;
			case "pop":
				try{
					int rea=stack.pop();
					System.out.print(rea);
				}catch(Exception e) {
					System.out.print(e.getMessage());
				}
				break;
			case "exit":
				scan.close();
				loop=false;
				break;
				default:
					break;
				
			}
		}
	}

}
