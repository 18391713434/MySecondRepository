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
		System.out.println("����ǰ��ʱ��ʽ="+str1);
		 insertSort( arr2);
		
		
		String str2=simpledateformate.format(date1);
		System.out.println("����ǰ��ʱ��ʽ="+str2);
	}
	public static void insertSort(int arr[]) {
		//ʹ�����Ƶ������������
		//��һ�֣�{101,34,119,1}---��{34��101��119��1}
		//�������������
		int insertVal=arr[1];
		int insertIndex=1-1;//arr[1]ǰ����������±�
		//��insertVal�ҵ������λ��
		//��֤insertVal ����λ�ò�Խ��
		//insertVal<arr[inertindex] ˵����û���ҵ����ʵĲ���λ��
		while(insertIndex>=0&&insertVal<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}//���˳�whileѭ��ʱ ˵��λ���ҵ���insertIndex+1
		
			arr[insertIndex+1]=insertVal;
		 
		System.out.println("��һ�������"+Arrays.toString(arr));
		
		//�ڶ���
		insertVal=arr[2];
		insertIndex=2-1;
		while(insertIndex>=0&&insertVal<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertVal;
		 
		System.out.println("�ڶ��������"+Arrays.toString(arr));
		//������
		insertVal=arr[3];
		insertIndex=3-1;
		while(insertIndex>=0&&insertVal<arr[insertIndex]) {
			arr[insertIndex+1]=arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex+1]=insertVal;
		 
		System.out.println("�����������"+Arrays.toString(arr));
		
		
		
		//����Ľ�  ������ʹ��forѭ��
		for(int i=1;i<arr.length;i++) {
			insertVal=arr[i];
			insertIndex=i-1;
			while(insertIndex>=0&&insertVal<arr[insertIndex]) {
				arr[insertIndex+1]=arr[insertIndex];
				insertIndex--;
			}
			if((insertIndex+1)!=i)
			arr[insertIndex+1]=insertVal;
			 
			System.out.println("��"+i+"�������"+Arrays.toString(arr));
			
		}
	}

}
