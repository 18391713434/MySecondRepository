
public class QuickSort {
	
	public static void main(String[] args) {
		int arr[]= {-9,78,0,23,-567,70};
		quickSort(arr,0,arr.length);
	}
	public static void quickSort(int[] arr,int left,int right) {
		int l=left;//左下标
		int r=right;//右下标
		//pivot中轴值
		int pivot=arr[(left+right)/2];
		//while循环的目的是让比pivot值小放到左边
		//比pivot值大放到右边
		int temp=0;//临时变量
		while(l<r) {
			while(arr[l]<pivot) {
				l+=1;
			}
			while(arr[r]>pivot) {
				r-=1;
			}
			//如果l>=r说明pivot左右的值已按照左边都是小于pivot右边都是大于pivot排列
			if(l>r) {
				break;
			}
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			//交换完成后发现arr[l]等于pivot，则前移
			if(arr[l]==pivot)
				r-=1;
			if(r==pivot)
				l+=1;
		}
		if(l==r)
		{
			l+=1;
			r-=1;
		}
		//向左递归
		if(left<r) {
			quickSort(arr, left, r);
		}
		if(right>l) {
			quickSort(arr, l, right);
			
		}
		
	}

}
