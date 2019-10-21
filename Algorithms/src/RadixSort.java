
public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {53,3,542,748,14,214};
	}
	//基数排序
	public static void radixSort(int[] arr) {
		//根据后面推导过程，可以得到基数排序代码
		int max=arr[0];
		//假设第一个数是最大数
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		int maxLength=(max+"").length();
		
		
		
		//定义一个二维数组，表示10个桶，每个桶就是一个一维数组
		//说明
		//1、二维数组包含10个一维数组
		//2、为了防止在放入数的时候，数据溢出，则每个一维数组（桶），大小定义为arr.lengt
		int [][] bucket=new int[10][arr.length];
		//为了记录每个桶中，世纪存放了多少个数据，我们定义一个一维数组来记录每个桶中放入的数据个数
		//可以这样理解
		//bucketElementCounts[0]记录的就是bucket[0]桶中放入的数据个数
		int[] bucketElementCounts=new int[10];
		//这里我们用循环处理代码
		for(int i=0, n=1;i<maxLength;i++,n+=10) {
			//针对每个元素对应位进行处理，个位，十位，百位。。。。
		
		
			for(int j=0;j<arr.length;j++) {
				//取出每个元素的个位值
				int digitOfElement=arr[j]/n%10;
				//放入对应的桶中
				bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
				bucketElementCounts[digitOfElement]++;
				
			}
			//按照这个桶的顺序（一维数组的下标依次取出数据，放入原来数组）
			int index=0;
			//遍历每一个桶，将桶中数据放入原数组
			for(int k=0;k<bucketElementCounts.length;k++) {
				//如果桶中有数据放入原数组
				if(bucketElementCounts[k]!=0) {
					//循环该桶即第k个桶（即第k个一维数组），放入
				for(int l=0;l<bucketElementCounts[k];l++)	//取出元素放入arr
					arr[index]=bucket[k][l];
					index++;
				}
		
			//第i+1轮处理后，需要将 每个bucketElementCounts[k]=0;
			bucketElementCounts[k]=0;
				}
			
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		//第一轮（针对每个元素的个位进行排序处理）
		for(int j=0;j<arr.length;j++) {
			//取出每个元素的个位值
			int digitOfElement=arr[j]%10;
			//放入对应的桶中
			bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
			bucketElementCounts[digitOfElement]++;
			
		}
		//按照这个桶的顺序（一维数组的下标依次取出数据，放入原来数组）
		int index=0;
		//遍历每一个桶，将桶中数据放入原数组
		for(int k=0;k<bucketElementCounts.length;k++) {
			//如果桶中有数据放入原数组
			if(bucketElementCounts[k]!=0) {
				//循环该桶即第k个桶（即第k个一维数组），放入
			for(int l=0;l<bucketElementCounts[k];l++)	//取出元素放入arr
				arr[index]=bucket[k][l];
				index++;
			}
	
		//第一轮处理后，需要将 每个bucketElementCounts[k]=0;
		bucketElementCounts[k]=0;
			}
		
		//==========================================================
		//第2轮（针对每个元素的十位进行排序处理）
		for(int j=0;j<arr.length;j++) {
			//取出每个元素的十位值
			int digitOfElement=arr[j]/10%10;
			//放入对应的桶中
			bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
			bucketElementCounts[digitOfElement]++;
			
		}
		//按照这个桶的顺序（一维数组的下标依次取出数据，放入原来数组）
		  index=0;
		//遍历每一个桶，将桶中数据放入原数组
		for(int k=0;k<bucketElementCounts.length;k++) {
			//如果桶中有数据放入原数组
			if(bucketElementCounts[k]!=0) {
				//循环该桶即第k个桶（即第k个一维数组），放入
			for(int l=0;l<bucketElementCounts[k];l++)	//取出元素放入arr
			{	arr[index]=bucket[k][l];
				index++;
			}
		
	}
	
	}
		//==========================================================
				//第3轮（针对每个元素的十位进行排序处理）
				for(int j=0;j<arr.length;j++) {
					//取出每个元素的百位值
					int digitOfElement=arr[j]/10/10%10;
					//放入对应的桶中
					bucket[digitOfElement][bucketElementCounts[digitOfElement] ]=arr[j];
					bucketElementCounts[digitOfElement]++;
					
				}
				//按照这个桶的顺序（一维数组的下标依次取出数据，放入原来数组）
				  index=0;
				//遍历每一个桶，将桶中数据放入原数组
				for(int k=0;k<bucketElementCounts.length;k++) {
					//如果桶中有数据放入原数组
					if(bucketElementCounts[k]!=0) {
						//循环该桶即第k个桶（即第k个一维数组），放入
					for(int l=0;l<bucketElementCounts[k];l++)	//取出元素放入arr
					{	arr[index]=bucket[k][l];
						index++;
					}}}}}
