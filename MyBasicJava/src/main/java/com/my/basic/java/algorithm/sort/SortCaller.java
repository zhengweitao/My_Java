package com.my.basic.java.algorithm.sort;

public class SortCaller {

	public static void main(String[] args) {
		//int[] array = {15,9,8,1,4,11,7,12,13,6,5,3,16,2,10,14};
		int[] array = {49,38,65,97,76,13,27,49,78,34,12,64,3,1,2};
		printArray(array,"Origin",-1);
		
	/*	
		InsertSort is = new InsertSort();
		//直接插入排序
		int[] insertSort = array.clone();
		is.loopCount=0;
		printArray(insertSort,"Insert Sorted",is.insertSort(insertSort,1,insertSort.length));
		
		//希尔插入排序
		int[] shellSort = array.clone();
		is.loopCount=0;
		printArray(shellSort,"Shell Sorted",is.shellSort(shellSort));
		
		int[] binaryInsertSort = array.clone();
		is.loopCount=0;
		printArray(binaryInsertSort,"Binary Shell Sorted",is.binaryInsertSort(binaryInsertSort));
		
		
		SelectSort ss = new SelectSort();
		//简单选择排序
		int[] simpleSelectSort = array.clone();
		printArray(simpleSelectSort,"Simple Select Sorted",ss.simpleSelectSort(simpleSelectSort));
		//二分选择排序
		int[] binarySelectSort = array.clone();
		printArray(binarySelectSort,"Binary Select Sorted",ss.binarySelectSort(binarySelectSort));
		
		HeapSort hs = new HeapSort();
		//堆排序
		int[] heapSort = array.clone();
		hs.heapSort(heapSort);
		printArray(heapSort,"Heap Sorted",hs.loopCount);
		
		
		BubbleSort bs = new BubbleSort();
		//冒泡排序
		int[] bubbleSort = array.clone();
		printArray(bubbleSort,"Bubble Sorted",bs.bubbleSort(bubbleSort));
		
		int[] posBubbleSort = array.clone();
		printArray(posBubbleSort,"Position Bubble Sorted",bs.posBubbleSort(posBubbleSort));
		
		int[] binaryBubbleSort = array.clone();
		printArray(binaryBubbleSort,"Binary Bubble Sorted",bs.binaryBubbleSort(binaryBubbleSort));
	
		
		QuickSort qs = new QuickSort();
		int[] quickSort = array.clone();
		qs.quickSort(quickSort,0,quickSort.length-1);
		printArray(quickSort,"Quick Sorted",-1);
		
		
		MergeSort ms = new MergeSort();
		int[] mergeSort = array.clone();
		ms.mergeSort(mergeSort);
		printArray(mergeSort,"Merge Sorted",-1);
		*/
		
		RadixSort ms = new RadixSort();
		int[] radixSort = array.clone();
		ms.radixSort(radixSort);
		printArray(radixSort,"Radix Sorted",-1);
		
		
		
		printArray(array,"Origin",-1);
		
	}
	
	
	
	
	
	public static void printArray(int[] arr,String title,int loopCount){
		String loopStr= "";
		if(loopCount!=-1) loopStr = String.valueOf(loopCount); 
		System.out.println(title+":"+loopStr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1){
				System.out.print(" - ");
			}
		}
		System.out.println();
		
	}
	
	
}
