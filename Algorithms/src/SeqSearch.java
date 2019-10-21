
public class SeqSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,9,11,-1,34,89};
		seqSearch(arr,-11);
		
	}
	public static int seqSearch(int[] arr,int value) {
		//线性查找是逐一比对，发现相同值，返回下标	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value)
				return i;
		}
		return -1;
	}
}
