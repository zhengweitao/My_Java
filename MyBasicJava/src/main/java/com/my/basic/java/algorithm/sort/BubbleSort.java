package com.my.basic.java.algorithm.sort;

public class BubbleSort {
	
	
	public int bubbleSort(int[] arr){
		int loopCount = 0 ;
		int tmp ;
		for (int i = arr.length-1; i >0 ; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				loopCount++;
			}
		}
		return loopCount ;
	}
	
	public int posBubbleSort(int[] arr){
		int loopCount = 0 ;
		int tmp ;
		int pos = 0 ;
		int i = arr.length-1;
		while(i>0){
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					pos = j ;
				}
				loopCount++;
			}
			i = pos ;
		}
		return loopCount ;
	}
	
	public int binaryBubbleSort(int[] arr){
		int loopCount = 0 ;
		int tmp ;
		int low = 0 ;
		int high = arr.length-1;
		while(low<high ){
			for (int j = low; j < high; j++) {
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				loopCount++;
			}
			high--;
			
			for (int j = high; j > low; j--) {
				if(arr[j]<arr[j-1]){
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
				loopCount++;
			}
			low++;
		}
		return loopCount ;
		
		
	}
	

}
