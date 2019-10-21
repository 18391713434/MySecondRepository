import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void selectSort(int [] arr) {
		//第一轮
		//原始数组：101，34，119，1
		//第一轮排序：1，34，119，101
		//算法-----》》简单   复杂算法拆分简单问题  逐步解决
		int minindex=0;
		int min=arr[0];
		
		for(int j=0+1;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
				minindex=j;
			}
		}
		System.out.println("第一轮排序后："+Arrays.toString(arr));
		//将最小值放在arr[0],即交换
		if(minindex!=0) {arr[minindex]=arr[0];
		arr[0]=min;}
		//第二轮
				//原始数组：101，34，119，1
				//第一轮排序：1，34，119，101
				//第二轮排序：1，34，119，101
				//算法-----》》简单   复杂算法拆分简单问题  逐步解决
				int minindex2=1;
				int min2=arr[0];
				for(int j=0+1;j<arr.length;j++) {
					if(min2>arr[j]) {
						min2=arr[j];
						minindex2=j;
					}
				}
				//将最小值放在arr[0],即交换
				if(minindex2!=1)
					{arr[minindex2]=arr[0];
				arr[0]=min2;}
				System.out.println("第二轮排序后："+Arrays.toString(arr));	
				
		//	算法改进：
			for(int i=0;i<arr.length-1;i++) {
				int minindex3=i;
				int min3=arr[i];
				
				for(int j=i+1;j<arr.length;j++) {
					if(min>arr[j]) {
						min=arr[j];
						minindex=j;
					}
				}
				System.out.println("第"+(i+1)+"轮排序后："+Arrays.toString(arr));
				//时间复杂度O(n^2)
				//从大到小排序  只需改min后的符号
			}
			
	}

}
