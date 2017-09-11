package com.my.basic.java.algorithm.sort;

public class QuickSort {
	
	
	public void quickSort(int[]arr ,int low ,int high){
		int key = arr[low];
		int i = low ;
		int j = high ;
		while(i<j){
			//反向遍历，直到发现比基准小的元素就停止
			while(i<j&&arr[j]>=key){
				j--;
			}
			//将该值赋予正向遍历停留的位置处
			arr[i]=arr[j];
			//正向遍历，直到发现比基准大的元素就停止
			while(i<j&&arr[i]<=key){
				i++;
			}
			//将该值赋予反向遍历停留的位置处
			arr[j]=arr[i];
		}
		//当正反两个方向的遍历相遇时，该位置就是基准元素的位置，将基准元素赋予此处
		arr[i]=key;
		//分治，两部分单独进行快速排序
		if(low<i-1)	quickSort(arr,low,i-1);
		if(i+1<high) quickSort(arr,i+1,high);
	}

}
