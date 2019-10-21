
public class Whitelist {
	public static void main(String[] args) {
		int [] w= {23,43,23,24,2,3,2,4,21,4,21,4,321,4,32,432,};
			StaticSETofInts set=new StaticSETofInts(w);
			int key=675;
			if(!set.contains(key))
				System.out.print(key);
	}

}
