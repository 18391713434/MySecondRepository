import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void selectSort(int [] arr) {
		//��һ��
		//ԭʼ���飺101��34��119��1
		//��һ������1��34��119��101
		//�㷨-----������   �����㷨��ּ�����  �𲽽��
		int minindex=0;
		int min=arr[0];
		
		for(int j=0+1;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
				minindex=j;
			}
		}
		System.out.println("��һ�������"+Arrays.toString(arr));
		//����Сֵ����arr[0],������
		if(minindex!=0) {arr[minindex]=arr[0];
		arr[0]=min;}
		//�ڶ���
				//ԭʼ���飺101��34��119��1
				//��һ������1��34��119��101
				//�ڶ�������1��34��119��101
				//�㷨-----������   �����㷨��ּ�����  �𲽽��
				int minindex2=1;
				int min2=arr[0];
				for(int j=0+1;j<arr.length;j++) {
					if(min2>arr[j]) {
						min2=arr[j];
						minindex2=j;
					}
				}
				//����Сֵ����arr[0],������
				if(minindex2!=1)
					{arr[minindex2]=arr[0];
				arr[0]=min2;}
				System.out.println("�ڶ��������"+Arrays.toString(arr));	
				
		//	�㷨�Ľ���
			for(int i=0;i<arr.length-1;i++) {
				int minindex3=i;
				int min3=arr[i];
				
				for(int j=i+1;j<arr.length;j++) {
					if(min>arr[j]) {
						min=arr[j];
						minindex=j;
					}
				}
				System.out.println("��"+(i+1)+"�������"+Arrays.toString(arr));
				//ʱ�临�Ӷ�O(n^2)
				//�Ӵ�С����  ֻ���min��ķ���
			}
			
	}

}
