
public class MergetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,5,7,1,3,6,2};
		int temp[]=new int [arr.length];
		}
		
		
		
		//��  + �ͷ���
	public static void mergeSort(int arr[],int left,int right,int[] temp) {
		if(left<right) {
			int mid=(left+right)/2;
			//����ݹ���зֽ�
			mergeSort(arr, left, mid, temp);
			//���ҵݹ���зֽ�
			mergeSort(arr, mid+1, right, temp);
			//���ϲ�
			//ÿ�ֽ�һ�κ�ֱ�Ӻϲ�
			mergeSort(arr, left, mid, right, temp);
			
		}
	}
	
	
	
	//�ϲ�����
	
	//arr ԭʼ����
	//left ����������г�ʼ����
	//mid  �м�����
	//right �ұ��������г�ʼ����
	//temp  ��ת����
	
	public static void mergeSort(int arr[],int left,int mid,int right,int[] temp) {
		int i=left;
		int j=mid+1;
		int t=0;//ָ��temp����ĵ�ǰ����
		//��һ��
		//�Ȱ��������ߵ����ݰ��չ�����䵽temp����
		//ֱ�����ߵ�����������һ�ߴ������Ϊֹ
		while(i<=mid&&j<=right) {
			//�����ߵ��������еĵ�ǰԪ�أ�С�ڵ����ұ��������еĵ�ǰԪ��
			
			if(arr[i]<=arr[j]) {
				temp[t]=arr[i];
				t+=1;
				i+=1;
			}else {
				//��֮�ұߵ���������Ԫ��С������������е�ǰԪ��
				//���ұ��������е�ǰԪ�ؿ�����temp����
				temp[t]=arr[j];
				t+=1;
				j+=1;
			}
		}
		
		
		//������
		//��ʣ������һ�ߵ���������ȫ����䵽temp
		while (i<=mid) {
			//˵������������л���ʣ��Ԫ�أ���ʣ�µ�Ԫ����䵽temp
			temp[t]=arr[i];
			t+=1;
			i+=1;
			
		}
		while(j<=right) {
			temp[t]=arr[j];
			t+=1;
			j+=1;
		}
		
		//������
		//��temp���ݸ��Ƶ�arr����
		//�����Ƕ���������
		t=0;
		int tempLeft=left;
		while(tempLeft<=right) {
			//��һ�κϲ�tempLeft=0  right=1
			//�ڶ��κϲ�tempLeft=2  right=3
			//�����κϲ�tempLeft=0  right=3
			//���һ�� 0��7
			t+=1;
			arr[tempLeft]=temp[t];
			t+=1;
			tempLeft+=1;
			}
	}
}
