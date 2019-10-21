import java.text.SimpleDateFormat;
import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2=new int[80000];
		for(int i=0;i<80000;i++) {
			arr2[i]=(int)(Math.random()*80000);
		}
		System.out.println(arr2.toString());
		Date date1=new Date();
		SimpleDateFormat simpledateformate=	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str1=simpledateformate.format(date1);
		System.out.println("排序前的时间式="+str1);
		 insertSort( arr2);
		
		
		String str2=simpledateformate.format(date1);
		System.out.println("排序前的时间式="+str2);
	}
	public static void insertSort(int arr[]) {
		//使用逐步推导方法便于理解
		//第一轮：{101,34,119,1}---》{34，101，119，1}
		//定义待插入数组
		int insertVal=arr[1];
		int insertIndex=1-1;//arr[1]前面这个数的下标
		//给insertVal找到插入的位置
		//保证insertVal 插入位置不越界
		//insertVal<arr[inertindex] 说明还没有找到合适的插入位置
		while(insertIndex>=0&&insertVal<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}//当退出while循环时 说明位置找到：insertIndex+1
		
			arr[insertIndex+1]=insertVal;
		 
		System.out.println("第一轮排序后"+Arrays.toString(arr));
		
		//第二轮
		insertVal=arr[2];
		insertIndex=2-1;
		while(insertIndex>=0&&insertVal<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertVal;
		 
		System.out.println("第二轮排序后"+Arrays.toString(arr));
		//第三轮
		insertVal=arr[3];
		insertIndex=3-1;
		while(insertIndex>=0&&insertVal<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertVal;
		 
		System.out.println("第三轮排序后"+Arrays.toString(arr));
		
		
		
		//代码改进  ：：：使用for循环
		for(int i=1;i<arr.length;i++) {
			insertVal=arr[i];
			insertIndex=i-1;
			while(insertIndex>=0&&insertVal<arr[insertIndex]) {
				arr[insertIndex+1]=arr[insertIndex];
				insertIndex--;
			}
			if((insertIndex+1)!=i)
			arr[insertIndex+1]=insertVal;
			 
			System.out.println("第"+i+"轮排序后"+Arrays.toString(arr));
			
		}
	}

}
