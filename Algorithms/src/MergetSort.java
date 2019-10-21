
public class MergetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,5,7,1,3,6,2};
		int temp[]=new int [arr.length];
		}
		
		
		
		//分  + 和方法
	public static void mergeSort(int arr[],int left,int right,int[] temp) {
		if(left<right) {
			int mid=(left+right)/2;
			//向左递归进行分解
			mergeSort(arr, left, mid, temp);
			//向右递归进行分解
			mergeSort(arr, mid+1, right, temp);
			//到合并
			//每分解一次后直接合并
			mergeSort(arr, left, mid, right, temp);
			
		}
	}
	
	
	
	//合并方法
	
	//arr 原始数组
	//left 左边有序序列初始索引
	//mid  中间索引
	//right 右边有序序列初始索引
	//temp  中转数组
	
	public static void mergeSort(int arr[],int left,int mid,int right,int[] temp) {
		int i=left;
		int j=mid+1;
		int t=0;//指向temp数组的当前索引
		//（一）
		//先把左右两边的数据按照规则填充到temp数组
		//直到两边的有序序列有一边处理完毕为止
		while(i<=mid&&j<=right) {
			//如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
			
			if(arr[i]<=arr[j]) {
				temp[t]=arr[i];
				t+=1;
				i+=1;
			}else {
				//反之右边的有序序列元素小于左边有序序列当前元素
				//将右边有序序列当前元素拷贝到temp数组
				temp[t]=arr[j];
				t+=1;
				j+=1;
			}
		}
		
		
		//（二）
		//把剩余数据一边的数据依次全部填充到temp
		while (i<=mid) {
			//说明左边有序序列还有剩余元素，把剩下的元素填充到temp
			temp[t]=arr[i];
			t+=1;
			i+=1;
			
		}
		while(j<=right) {
			temp[t]=arr[j];
			t+=1;
			j+=1;
		}
		
		//（三）
		//将temp数据复制到arr数组
		//并不是都拷贝所有
		t=0;
		int tempLeft=left;
		while(tempLeft<=right) {
			//第一次合并tempLeft=0  right=1
			//第二次合并tempLeft=2  right=3
			//第三次合并tempLeft=0  right=3
			//最后一次 0和7
			t+=1;
			arr[tempLeft]=temp[t];
			t+=1;
			tempLeft+=1;
			}
	}
}
