package com.my.basic.java.algorithm.sort;

public class HeapSort {
	public int loopCount;
	
	public void heapSort(int[] arr){
		
		this.loopCount = 0 ;
		/**
		 * 把当前数组当作一个完全二叉树（即此处的堆）的数据结构，其中树根节点为arr[0]
		 * 并遵循父节点为index，左子节点存放在(2*index)+1,右子节点存放在(2*index)+2的位置
		 * 可以推断最后一个非叶子节点的位置为(数组最后一位-1)/2 的位置，并从该往前遍历所有非叶子节点
		 * 调用maxHeap()方法，对父节点和两个子节点进行比较，保证大根堆的特性，即父节点始终大于子节点。
		 * 遍历完所有非叶子节点后，大根堆建立完成，
		 * 将最大的数与数组最后一位交换，并堆减少最后一位的子数组调用maxHeap()进行调整，
		 * 循环此操作，直到子数组只剩一位，排序完成
		 */
		// (arr.length-2)/2    数组最后一位的索引为arr.length-1 ,(该索引-1)/2即为最后一个非叶子节点的索引位
		int lastNode =  (arr.length-2)>>1 ; 
		for (int i = lastNode; i >= 0; i--) {
			maxHeap(arr,arr.length,i);
		}
		int tmp ;
		for (int i = arr.length-1; i > 0 ; i--) {
			tmp = arr[i];
			arr[i]=arr[0];
			arr[0]=tmp;
			maxHeap(arr,i,0);
		}
		
		
	}
	
	/**
	 * 比较堆的父节点和两个子节点的大小，保证父节点大于子节点
	 * 如果交换了父节点和子节点的位置，则需要对被交换了的子节点进行递归调用maxHeap()，调整该子节点下的节点。
	 * 
	 * @param arr
	 * @param heapSize
	 * @param nodeIndex
	 */
	private void maxHeap(int[] arr,int heapSize,int nodeIndex){
		
		this.loopCount++;
		int left = (nodeIndex<<1)+1;//nodeIndex*2+1     左子节点在数组的位置
		int right = (nodeIndex<<1)+2;//nodeIndex*2+2    右子节点在数组的位置
		
		int max = nodeIndex ;
		int tmp ;
		if(left<heapSize&&arr[max]<arr[left]){
			max = left ;
		}
		if(right<heapSize&&arr[max]<arr[right]){
			max = right ;
		}
		
		if(max != nodeIndex){
			tmp = arr[max];
			arr[max]=arr[nodeIndex];
			arr[nodeIndex]=tmp;
			maxHeap(arr,heapSize,max);
		}
		
		
		
	}
	
	
	
	

}
