import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,10,89,1000,1234};
		
	
	}
         //���ֲ����㷨
	public static int binarySearch(int arr[],int left,int right,int findVal) {
		//��left>rightʱ˵���ݹ�������û�ҵ�
		if(left>right)
			return -1;
	int mid=(left+right)/2;
	int midVal=arr[mid];
	if(findVal>midVal) {
		//���ҵݹ�
		return binarySearch(arr,mid+1,right,findVal);
	}else if(findVal<midVal) {
		//����ݹ�
		return binarySearch(arr,left,mid-1,findVal);
	}else {
		return mid;
		
	}
	}
	//���һ���κ�˼��
	//����ж����ͬ��ֵ ʱ����ν�������֮�����ҵ�
	//˼·������
	//1�����ҵ�mid����ֵ����Ҫ���Ϸ���
	//2����mid����ֵ�����ɨ�裬�������������ֵ��Ԫ���±���뵽����ArrayList
	//3����mid����ֵ���ұ�ɨ�裬�������������ֵ��Ԫ���±���뵽����ArrayList
	//��ArrayList����
	/*public static ArrayList<Integer> binarySearch(int arr[],int left,int right,int findVal) {
		//��left>rightʱ˵���ݹ�������û�ҵ�
		if(left>right)
			return -1;
	int mid=(left+right)/2;
	int midVal=arr[mid];
	if(findVal>midVal) {
		//���ҵݹ�
		return binarySearch(arr,mid+1,right,findVal);
	}else if(findVal<midVal) {
		//����ݹ�
		return binarySearch(arr,left,mid-1,findVal);
	}else {
		List<Integer> resIndexlist=new ArrayList<Integer>();
		int temp=mid-1;
		while(true) {
			if(temp<0||arr[temp]!=findVal) {
				break;//�˳�
			}
			//���򣬾�temp����resIndexlist
			resIndexlist.add(mid);
			temp-=1;//temp����
		}
		resIndexlist.add(mid);
		temp=mid+1;
		while(true) {
			if(temp>arr.length-!||arr[temp]!=findVal) {
				break;//�˳�
			}
			//���򣬾�temp����resIndexlist
			resIndexlist.add(mid);
			temp+=1;//temp����
		}
		return resIndexlist;
		
	}*/
	}

	
	
