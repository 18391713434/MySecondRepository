import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int arr[]= {8,9,1,7,2,3,5,4,6,0};
	}
	//ʹ�����Ƶ�дϣ������
	public static void shellSort(int[]arr) {
		int temp=0;
		//ϣ�������һ��
		//��Ϊ��һ�������ǽ�10�����ݷֳ�5��
		for(int i=5;i<arr.length;i++) {
			//��������������Ԫ�أ���5�飬ÿ��2��Ԫ�أ�
			for(int j=i-5;j>=0;j-=5) {
				//�����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ�����
				if(arr[j]>arr[j+5]) {
					temp=arr[j];
					arr[j]=arr[j+5];
					arr[j+5]=temp;
				}
			}
		}
		System.out.println("ϣ������һ�ֺ�"+Arrays.toString(arr));
		
		//ϣ�������2������
		//��Ϊ��2�������ǽ�10��Ԫ�طֳ���5/2=2��
		for(int i=2;i<arr.length;i++)
			for(int j=i-2;j>=0;j-=2) {
				if(arr[j]>arr[j+2]) {
					temp=arr[j];
					arr[j]=arr[j+2];
					arr[j]=temp;
				}
			}
		System.out.println("ϣ������2�ֺ�"+Arrays.toString(arr));
		//ϣ�������3������
		//��Ϊ��3�������ǽ�10��Ԫ�طֳ���2/2=1��
		for(int i=1;i<arr.length;i++)
			for(int j=i-1;j>=0;j-=1) {     
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j]=temp;
				}
			}
		//�㷨�Ľ�
		//gap:����
		int count=0;
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i++) {
				for(int j=i-gap;j>=0;j-=gap) {
					if(arr[j]>arr[j+gap]) {
						temp=arr[j];
						arr[j]=arr[j+gap];
						arr[j]=temp;
					}
				}
				}
			count++;
			System.out.println("ϣ������"+count+"�ֺ�"+Arrays.toString(arr));
			
		}
		
		
		//��λ��
		
	/*	int count=0;
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i++) {
				int j=i;
				int temp=arr[j];
				if(arr[j]<arr[j-gap]) {
					while(j-gap>=0&&temp<arr[j-gap]) {
						arr[j]=arr[j-gap];
					    j-=gap;
				}
					arr[j]=temp;
				}
			count++;
			System.out.println("ϣ������"+count+"�ֺ�"+Arrays.toString(arr));
			
		}*/
		
	
		
	}
	
 
}
