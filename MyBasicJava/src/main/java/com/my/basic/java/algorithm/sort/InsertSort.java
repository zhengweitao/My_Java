package com.my.basic.java.algorithm.sort;

public class InsertSort {
	
	public int loopCount;
	
/*	public  void sort(int[] arr){
		//循环遍历整个数组，每个值都调用insetSort方法，插入到正确顺序的位置
		for (int i = 0; i < arr.length; i++) {
			insertSort(arr,i,arr[i]);
		}
	}
	
	private void insertSort(int[] arr,int pos,int value){
		pos = pos -1 ;
		while(pos >= 0 && arr[pos]>value){
			arr[pos+1]=arr[pos];
			pos--;
		}
		arr[pos+1]=value;
		
	}*/
	
	/**
	 * 当前位置的值作为标准值,当直接插入排序时，dk为1，endPos为数组长度
	 * 由于当前位置前面的是有序的， 判断前dk个位置不小于0，并且前dk个位置的值比标准值大，
	 * 则将该位置的值赋予后dk个位置，直到前dk个位置的值比标准值小，则将标准值赋予当前位置
	 */
	public int insertSort(int[] arr,int dk,int endPos){
		int pos = 0 ;
		int value = 0 ;
		for (int i = dk; i < endPos; i++) {
			pos = i -dk ;
			value = arr[i] ;
			while(pos >= 0 && arr[pos]>value){
				arr[pos+dk]=arr[pos];
				pos-=dk;
				loopCount++;
			}
			arr[pos+dk]=value;
			//SortCaller.printArray(arr, "In processing");
		}
		//SortCaller.printLoopCount(loopCount);
		return loopCount;
	}
	
	public int shellSort(int[] arr){
		
		int d = arr.length/2;
		while(d>=1){
			loopCount +=insertSort(arr,d,arr.length);
			d=d/2;
		}
		return loopCount;
	}
	
	public int binaryInsertSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j=i-1 ;
			//认为当前位置前子数组已经排好顺序了，则对前面的采用二分法查找当前位置数值的插入位置
			int pos = binarySearch(arr,0,i-1,value);
			//System.out.println(pos);
			//从当前位置j+1开始往前逐个后移一位，直到插入位置
			while(j>=pos){
				arr[j+1]=arr[j];
				j--;
				loopCount++;
			}
			//将当前数值赋予插入位置
			arr[pos]=value;
//			SortCaller.printArray(arr,"temp",-1);
		}
		return loopCount;
	}
	
	//实际上此步骤为二分查找法
	private int binarySearch(int[] arr,int left,int right,int value){
		loopCount++;
		//如果子数组上限小于等于下限，则实际上子数组已经缩小到只剩一个值，以下限值为准，如果查找值大于下限值，则返回下限+1的位置，否则返回下限位置。其中需要注意查找值与下限值的比较符使用>=，保持查找值等于下限时，查找值在其后，保持算法稳定
		if(right<=left) return value>=arr[left]?left+1:left;
		//当子数组非缩小到只有一个值时，去其中间位置，判断中间位置值是否等于查找值，是则返回，否则根据大小取下限至中间-1或者中间+1至上限进行递归。
		int mid = (left+right)/2;
		if(value==arr[mid]) return mid+1;
		if(arr[mid]>value){
			return binarySearch(arr,left,mid-1,value);
		}else{
			return binarySearch(arr,mid+1,right,value);
		}
	}

}
