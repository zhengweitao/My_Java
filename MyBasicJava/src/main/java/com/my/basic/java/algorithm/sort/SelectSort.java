package com.my.basic.java.algorithm.sort;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SelectSort {
	
	
	public int simpleSelectSort(int[] arr){
		int minPos ;
		int tmp ;
		int loopCount=0;
		for (int i = 0; i < arr.length; i++) {
			minPos  = i ;
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[minPos]){
					minPos = j ;
				}
				loopCount++;
			}
			if(minPos!=i){
				tmp = arr[i] ;
				arr[i] = arr[minPos] ;
				arr[minPos] = tmp ;
			}
			
		}
		return loopCount;
		
	}
	
	
	public int binarySelectSort(int[] arr){
		int minPos,maxPos;
		int tmp ;
		int loopCount=0;
		for (int i = 0; i < arr.length/2; i++) {
			minPos  = i ;
			maxPos = arr.length-1-i ;
			for (int j = i; j < arr.length-i; j++) {
				if(arr[j]<arr[minPos]){
					minPos = j ;
					continue;
				}
				if(arr[j]>arr[maxPos]){
					maxPos = j ;
				}
				loopCount++;
			}
			if(minPos!=i){
				tmp = arr[i] ;
				arr[i] = arr[minPos] ;
				arr[minPos] = tmp ;
			}
			if(maxPos!=arr.length-1-i){
				tmp = arr[arr.length-1-i] ;
				arr[arr.length-1-i] = arr[maxPos] ;
				arr[maxPos] = tmp ;
			}
			
		}
		return loopCount;
	}

}
