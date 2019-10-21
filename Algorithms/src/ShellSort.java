import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int arr[]= {8,9,1,7,2,3,5,4,6,0};
	}
	//使用逐步推导写希尔排序
	public static void shellSort(int[]arr) {
		int temp=0;
		//希尔排序第一轮
		//因为第一轮排序，是将10个数据分成5组
		for(int i=5;i<arr.length;i++) {
			//遍历各组中所有元素（共5组，每组2个元素）
			for(int j=i-5;j>=0;j-=5) {
				//如果当前元素大于加上步长后的那个元素，交换
				if(arr[j]>arr[j+5]) {
					temp=arr[j];
					arr[j]=arr[j+5];
					arr[j+5]=temp;
				}
			}
		}
		System.out.println("希尔排序一轮后"+Arrays.toString(arr));
		
		//希尔排序第2轮排序
		//因为第2轮排序，是将10个元素分成了5/2=2组
		for(int i=2;i<arr.length;i++)
			for(int j=i-2;j>=0;j-=2) {
				if(arr[j]>arr[j+2]) {
					temp=arr[j];
					arr[j]=arr[j+2];
					arr[j]=temp;
				}
			}
		System.out.println("希尔排序2轮后"+Arrays.toString(arr));
		//希尔排序第3轮排序
		//因为第3轮排序，是将10个元素分成了2/2=1组
		for(int i=1;i<arr.length;i++)
			for(int j=i-1;j>=0;j-=1) {     
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j]=temp;
				}
			}
		//算法改进
		//gap:步长
		int count=0;
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i++) {
				for(int j=i-gap;j>=0;j-=gap) {
					if(arr[j]>arr[j+gap]) {
						temp=arr[j];
						arr[j]=arr[j+gap];
						arr[j]=temp;
					}
				}
				}
			count++;
			System.out.println("希尔排序"+count+"轮后"+Arrays.toString(arr));
			
		}
		
		
		//移位法
		
	/*	int count=0;
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i++) {
				int j=i;
				int temp=arr[j];
				if(arr[j]<arr[j-gap]) {
					while(j-gap>=0&&temp<arr[j-gap]) {
						arr[j]=arr[j-gap];
					    j-=gap;
				}
					arr[j]=temp;
				}
			count++;
			System.out.println("希尔排序"+count+"轮后"+Arrays.toString(arr));
			
		}*/
		
	
		
	}
	
 
}
