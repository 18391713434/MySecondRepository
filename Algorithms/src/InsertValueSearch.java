import java.util.Arrays;

public class InsertValueSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<100;i++) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int insertValueSearch(int[]arr,int left,int right,int findValue)
	{
		
		if(left>right||findValue<arr[0]||findValue>arr[arr.length-1]) {
			
			return -1;
		}
		int mid=left+(right-left)*(findValue-arr[left])/(arr[right]-arr[left]);
		int midVal=arr[mid];
		if(findValue>midVal) {
			return insertValueSearch(arr, left, mid+1, findValue);
		}else if(findValue<midVal){
			return insertValueSearch(arr, mid-1,right, findValue);
			
		}else {
			return mid;
		}
	}
}
