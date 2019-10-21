import java.text.SimpleDateFormat;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,9,-1,10,20};
		//第一趟排序就是将最大的数排在最后
		int temp=0;//临时变量
		for(int j=0;j<arr.length;j++) {
			//如果后面的数比前面的数大就交换
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
		}
		System.out.println("第一趟排序之后的数组"+arr.toString());
		//第二趟排序就是把第二大数排在倒数第二位
		for(int j=0;j<arr.length-1;j++) {
			//如果后面的数比前面的数大就交换
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
		}
		System.out.println("第二趟排序之后的数组"+arr.toString());
		//第三趟排序就是把第三大数排在倒数第三位
		for(int j=0;j<arr.length-1-1;j++) {
			//如果后面的数比前面的数大就交换
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
		}
		System.out.println("第三趟排序之后的数组"+arr.toString());
		//第四趟排序就是把第三大数排在倒数第三位
				for(int j=0;j<arr.length-1-1-1;j++) {
					//如果后面的数比前面的数大就交换
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j+1]=arr[j];
						arr[j]=temp;
						}
				}
				System.out.println("第四趟排序之后的数组"+arr.toString());
				
				
				
		//最终算法：
				for(int i=0;i<arr.length-1;i++) {
					for(int j=0;j<arr.length-1-i;j++) {
						//如果后面的数比前面的数大就交换
						if(arr[j]>arr[j+1]) {
							temp=arr[j];
							arr[j+1]=arr[j];
							arr[j]=temp;
							}
					}
					
				}
				
				
				//算法改进
			//冒泡排序时间复杂度O(n^2)
				
				boolean flag=false;
			for(int i=0;i<arr.length-1;i++) {
					for(int j=0;j<arr.length-1-i;j++) {
						//如果后面的数比前面的数大就交换
						if(arr[j]>arr[j+1]) {
							flag=true;
							temp=arr[j];
							arr[j+1]=arr[j];
							arr[j]=temp;
							}
					
					}
					System.out.println("第"+(i+1)+"趟排序后的数组");
					System.out.println(Arrays.toString(arr));
					if(!flag) {
						break;
					}
					else
						flag=false;
					
				}
			
			//测试冒泡排序的时间，给80000个数据
			//创建随机数组
			int[] arr2=new int[80000];
			for(int i=0;i<80000;i++) {
				arr2[i]=(int)(Math.random()*80000);
			}
			System.out.println(arr2.toString());
			Date date1=new Date();
			SimpleDateFormat simpledateformate=	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String str1=simpledateformate.format(date1);
			System.out.println("排序前的时间式="+str1);
			
			boolean flag2=false;
		for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					//如果后面的数比前面的数大就交换
					if(arr[j]>arr[j+1]) {
						flag2=true;
						temp=arr[j];
						arr[j+1]=arr[j];
						arr[j]=temp;
						}
				
				}
				System.out.println("第"+(i+1)+"趟排序后的数组");
				System.out.println(Arrays.toString(arr));
				if(!flag2) {
					break;
				}
				else
					flag2=false;
				
			}
		Date date2=new Date();
		SimpleDateFormat simpledateformate2=	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str2=simpledateformate.format(date2);
		System.out.println("排序前的时间式="+str2);
		
		
	}
	
	
	
	
	
	
	

}


