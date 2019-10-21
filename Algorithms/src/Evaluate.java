import java.util.*;
public class Evaluate {
	public static void mian(String[] args) {
		Stack<String> ops=new Stack<String> ();
		Stack<Double> vals=new Stack<Double> ();
		while(!StdIn.isEmpty1())
		{
			
			String s=readString();
			if(s.equals("("))        ;
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("-")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals("/")) ops.push(s);
			else if(s.equals("sqrt"))  ops.push(s);
			else if(s.equals(")")) {
				String op=ops.pop();
				double v=vals.pop();
				if(op.equals("+"))        v=vals.pop()+v;
				else if(op.equals("-"))   v=vals.pop()-v;
				else if(op.equals("*"))   v=vals.pop()*v;
				else if(op.equals("/"))	  v=vals.pop()/v;
				vals.push(v);
				
			}
			else
				vals.push(Double.parseDouble(s));  
			
			
		}
		System.out.print(vals.pop());
	}

	private static String readString() {
		// TODO Auto-generated method stub
		return null;
	}
}
