
public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {53,3,542,748,14,214};
	}
	//��������
	public static void radixSort(int[] arr) {
		//���ݺ����Ƶ����̣����Եõ������������
		int max=arr[0];
		//�����һ�����������
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		int maxLength=(max+"").length();
		
		
		
		//����һ����ά���飬��ʾ10��Ͱ��ÿ��Ͱ����һ��һά����
		//˵��
		//1����ά�������10��һά����
		//2��Ϊ�˷�ֹ�ڷ�������ʱ�������������ÿ��һά���飨Ͱ������С����Ϊarr.lengt
		int [][] bucket=new int[10][arr.length];
		//Ϊ�˼�¼ÿ��Ͱ�У����ʹ���˶��ٸ����ݣ����Ƕ���һ��һά��������¼ÿ��Ͱ�з�������ݸ���
		//�����������
		//bucketElementCounts[0]��¼�ľ���bucket[0]Ͱ�з�������ݸ���
		int[] bucketElementCounts=new int[10];
		//����������ѭ���������
		for(int i=0, n=1;i<maxLength;i++,n+=10) {
			//���ÿ��Ԫ�ض�Ӧλ���д�����λ��ʮλ����λ��������
		
		
			for(int j=0;j<arr.length;j++) {
				//ȡ��ÿ��Ԫ�صĸ�λֵ
				int digitOfElement=arr[j]/n%10;
				//�����Ӧ��Ͱ��
				bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
				bucketElementCounts[digitOfElement]++;
				
			}
			//�������Ͱ��˳��һά������±�����ȡ�����ݣ�����ԭ�����飩
			int index=0;
			//����ÿһ��Ͱ����Ͱ�����ݷ���ԭ����
			for(int k=0;k<bucketElementCounts.length;k++) {
				//���Ͱ�������ݷ���ԭ����
				if(bucketElementCounts[k]!=0) {
					//ѭ����Ͱ����k��Ͱ������k��һά���飩������
				for(int l=0;l<bucketElementCounts[k];l++)	//ȡ��Ԫ�ط���arr
					arr[index]=bucket[k][l];
					index++;
				}
		
			//��i+1�ִ������Ҫ�� ÿ��bucketElementCounts[k]=0;
			bucketElementCounts[k]=0;
				}
			
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		//��һ�֣����ÿ��Ԫ�صĸ�λ����������
		for(int j=0;j<arr.length;j++) {
			//ȡ��ÿ��Ԫ�صĸ�λֵ
			int digitOfElement=arr[j]%10;
			//�����Ӧ��Ͱ��
			bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
			bucketElementCounts[digitOfElement]++;
			
		}
		//�������Ͱ��˳��һά������±�����ȡ�����ݣ�����ԭ�����飩
		int index=0;
		//����ÿһ��Ͱ����Ͱ�����ݷ���ԭ����
		for(int k=0;k<bucketElementCounts.length;k++) {
			//���Ͱ�������ݷ���ԭ����
			if(bucketElementCounts[k]!=0) {
				//ѭ����Ͱ����k��Ͱ������k��һά���飩������
			for(int l=0;l<bucketElementCounts[k];l++)	//ȡ��Ԫ�ط���arr
				arr[index]=bucket[k][l];
				index++;
			}
	
		//��һ�ִ������Ҫ�� ÿ��bucketElementCounts[k]=0;
		bucketElementCounts[k]=0;
			}
		
		//==========================================================
		//��2�֣����ÿ��Ԫ�ص�ʮλ����������
		for(int j=0;j<arr.length;j++) {
			//ȡ��ÿ��Ԫ�ص�ʮλֵ
			int digitOfElement=arr[j]/10%10;
			//�����Ӧ��Ͱ��
			bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
			bucketElementCounts[digitOfElement]++;
			
		}
		//�������Ͱ��˳��һά������±�����ȡ�����ݣ�����ԭ�����飩
		  index=0;
		//����ÿһ��Ͱ����Ͱ�����ݷ���ԭ����
		for(int k=0;k<bucketElementCounts.length;k++) {
			//���Ͱ�������ݷ���ԭ����
			if(bucketElementCounts[k]!=0) {
				//ѭ����Ͱ����k��Ͱ������k��һά���飩������
			for(int l=0;l<bucketElementCounts[k];l++)	//ȡ��Ԫ�ط���arr
			{	arr[index]=bucket[k][l];
				index++;
			}
		
	}
	
	}
		//==========================================================
				//��3�֣����ÿ��Ԫ�ص�ʮλ����������
				for(int j=0;j<arr.length;j++) {
					//ȡ��ÿ��Ԫ�صİ�λֵ
					int digitOfElement=arr[j]/10/10%10;
					//�����Ӧ��Ͱ��
					bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
					bucketElementCounts[digitOfElement]++;
					
				}
				//�������Ͱ��˳��һά������±�����ȡ�����ݣ�����ԭ�����飩
				  index=0;
				//����ÿһ��Ͱ����Ͱ�����ݷ���ԭ����
				for(int k=0;k<bucketElementCounts.length;k++) {
					//���Ͱ�������ݷ���ԭ����
					if(bucketElementCounts[k]!=0) {
						//ѭ����Ͱ����k��Ͱ������k��һά���飩������
					for(int l=0;l<bucketElementCounts[k];l++)	//ȡ��Ԫ�ط���arr
					{	arr[index]=bucket[k][l];
						index++;
					}}}}}
