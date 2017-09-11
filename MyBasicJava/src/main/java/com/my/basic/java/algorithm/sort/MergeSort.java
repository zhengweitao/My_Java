package com.my.basic.java.algorithm.sort;

public class MergeSort {
	
	int[] tmp ;
	int[] swap ;
	
	public void mergeSort(int[] arr){
		tmp = new int[arr.length];
		int len = 1 ;
		while(len<arr.length){
			int i = 0 ;
			while(i+2*len<arr.length){
				merge(arr,i,i+len,i+2*len-1);
				i+=2*len;
			}
			if(i+len<arr.length){
				merge(arr,i,i+len,arr.length-1);
			}else{
				while(i<arr.length){
					tmp[i]=arr[i];
					i++;
				}
			}
			len *= 2;
			swap = arr; arr= tmp; tmp = swap;
			SortCaller.printArray(arr,"tmp",-1);
		}
	}
	
/*	
	public void recurMergeSort(int[] arr,int low,int high){
		if(low!=high){
			recurMergeSort(arr,low,(low+high)/2);
			recurMergeSort(arr,(low+high)/2+1,high);
			merge(arr,low,(low+high)/2+1,high);
			swap = arr; arr= tmp; tmp = swap;
		}
	}*/
	
	
	
	private void merge(int[] arr,int low,int mid,int high){
		int i = low, j = mid ,k = low ;
		while(i<mid&&j<=high){
			if(arr[i]<=arr[j]){
				tmp[k++]=arr[i++];
			}else{
				tmp[k++]=arr[j++];
			}
		}
		while(i<mid){
			tmp[k++]=arr[i++];
		}
		while(j<=high){
			tmp[k++]=arr[j++];
		}
		/*k=0;
		while(low<=high){
			arr[low]=tmp[k];
			k++;
			low++;
		}*/
		
	}

}
