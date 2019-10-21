import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,10,89,1000,1234};
		
	
	}
         //二分查找算法
	public static int binarySearch(int arr[],int left,int right,int findVal) {
		//当left>right时说明递归完数组没找到
		if(left>right)
			return -1;
	int mid=(left+right)/2;
	int midVal=arr[mid];
	if(findVal>midVal) {
		//向右递归
		return binarySearch(arr,mid+1,right,findVal);
	}else if(findVal<midVal) {
		//向左递归
		return binarySearch(arr,left,mid-1,findVal);
	}else {
		return mid;
		
	}
	}
	//完成一个课后思考
	//如果有多个相同数值 时，如何将所有数之都查找到
	//思路分析：
	//1、再找到mid索引值，不要马上返回
	//2、向mid索引值的左边扫描，将所有满足这个值的元素下标加入到集合ArrayList
	//3、向mid索引值的右边扫描，将所有满足这个值的元素下标加入到集合ArrayList
	//将ArrayList返回
	/*public static ArrayList<Integer> binarySearch(int arr[],int left,int right,int findVal) {
		//当left>right时说明递归完数组没找到
		if(left>right)
			return -1;
	int mid=(left+right)/2;
	int midVal=arr[mid];
	if(findVal>midVal) {
		//向右递归
		return binarySearch(arr,mid+1,right,findVal);
	}else if(findVal<midVal) {
		//向左递归
		return binarySearch(arr,left,mid-1,findVal);
	}else {
		List<Integer> resIndexlist=new ArrayList<Integer>();
		int temp=mid-1;
		while(true) {
			if(temp<0||arr[temp]!=findVal) {
				break;//退出
			}
			//否则，就temp放入resIndexlist
			resIndexlist.add(mid);
			temp-=1;//temp左移
		}
		resIndexlist.add(mid);
		temp=mid+1;
		while(true) {
			if(temp>arr.length-!||arr[temp]!=findVal) {
				break;//退出
			}
			//否则，就temp放入resIndexlist
			resIndexlist.add(mid);
			temp+=1;//temp右移
		}
		return resIndexlist;
		
	}*/
	}

	
	
