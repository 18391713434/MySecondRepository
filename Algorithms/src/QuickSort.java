
public class QuickSort {
	
	public static void main(String[] args) {
		int arr[]= {-9,78,0,23,-567,70};
		quickSort(arr,0,arr.length);
	}
	public static void quickSort(int[] arr,int left,int right) {
		int l=left;//���±�
		int r=right;//���±�
		//pivot����ֵ
		int pivot=arr[(left+right)/2];
		//whileѭ����Ŀ�����ñ�pivotֵС�ŵ����
		//��pivotֵ��ŵ��ұ�
		int temp=0;//��ʱ����
		while(l<r) {
			while(arr[l]<pivot) {
				l+=1;
			}
			while(arr[r]>pivot) {
				r-=1;
			}
			//���l>=r˵��pivot���ҵ�ֵ�Ѱ�����߶���С��pivot�ұ߶��Ǵ���pivot����
			if(l>r) {
				break;
			}
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			//������ɺ���arr[l]����pivot����ǰ��
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
		//����ݹ�
		if(left<r) {
			quickSort(arr, left, r);
		}
		if(right>l) {
			quickSort(arr, l, right);
			
		}
		
	}

}
