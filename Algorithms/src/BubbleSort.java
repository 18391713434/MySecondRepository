import java.text.SimpleDateFormat;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,9,-1,10,20};
		//��һ��������ǽ��������������
		int temp=0;//��ʱ����
		for(int j=0;j<arr.length;j++) {
			//������������ǰ�������ͽ���
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
		}
		System.out.println("��һ������֮�������"+arr.toString());
		//�ڶ���������ǰѵڶ��������ڵ����ڶ�λ
		for(int j=0;j<arr.length-1;j++) {
			//������������ǰ�������ͽ���
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
		}
		System.out.println("�ڶ�������֮�������"+arr.toString());
		//������������ǰѵ����������ڵ�������λ
		for(int j=0;j<arr.length-1-1;j++) {
			//������������ǰ�������ͽ���
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
		}
		System.out.println("����������֮�������"+arr.toString());
		//������������ǰѵ����������ڵ�������λ
				for(int j=0;j<arr.length-1-1-1;j++) {
					//������������ǰ�������ͽ���
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j+1]=arr[j];
						arr[j]=temp;
						}
				}
				System.out.println("����������֮�������"+arr.toString());
				
				
				
		//�����㷨��
				for(int i=0;i<arr.length-1;i++) {
					for(int j=0;j<arr.length-1-i;j++) {
						//������������ǰ�������ͽ���
						if(arr[j]>arr[j+1]) {
							temp=arr[j];
							arr[j+1]=arr[j];
							arr[j]=temp;
							}
					}
					
				}
				
				
				//�㷨�Ľ�
			//ð������ʱ�临�Ӷ�O(n^2)
				
				boolean flag=false;
			for(int i=0;i<arr.length-1;i++) {
					for(int j=0;j<arr.length-1-i;j++) {
						//������������ǰ�������ͽ���
						if(arr[j]>arr[j+1]) {
							flag=true;
							temp=arr[j];
							arr[j+1]=arr[j];
							arr[j]=temp;
							}
					
					}
					System.out.println("��"+(i+1)+"������������");
					System.out.println(Arrays.toString(arr));
					if(!flag) {
						break;
					}
					else
						flag=false;
					
				}
			
			//����ð�������ʱ�䣬��80000������
			//�����������
			int[] arr2=new int[80000];
			for(int i=0;i<80000;i++) {
				arr2[i]=(int)(Math.random()*80000);
			}
			System.out.println(arr2.toString());
			Date date1=new Date();
			SimpleDateFormat simpledateformate=	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String str1=simpledateformate.format(date1);
			System.out.println("����ǰ��ʱ��ʽ="+str1);
			
			boolean flag2=false;
		for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					//������������ǰ�������ͽ���
					if(arr[j]>arr[j+1]) {
						flag2=true;
						temp=arr[j];
						arr[j+1]=arr[j];
						arr[j]=temp;
						}
				
				}
				System.out.println("��"+(i+1)+"������������");
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
		System.out.println("����ǰ��ʱ��ʽ="+str2);
		
		
	}
	
	
	
	
	
	
	

}


