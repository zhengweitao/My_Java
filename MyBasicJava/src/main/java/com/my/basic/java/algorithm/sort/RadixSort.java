package com.my.basic.java.algorithm.sort;

public class RadixSort {
	
	
	public void radixSort(int[] arr){
		int len = getDigitLength(arr);
	/*	int[][] bucket = new int[10][arr.length];
		for (int i = len; i >=1; i--) {
			sort(arr,bucket,i);
		}*/
		sort(arr,len);
	}
	
	
	private void sort(int[] arr,int max){
		
		int k = 0;
        int n = 1;
        int m = 1; //控制键值排序依据在哪一位
        int[][]temp = new int[10][arr.length]; //数组的第一维表示可能的余数0-9
        int[]order = new int[10]; //数组orderp[i]用来表示该位是i的数的个数
        while(m <= max)
        {
            for(int i = 0; i < arr.length; i++)
            {
                int lsd = ((arr[i] / n) % 10);
                temp[lsd][order[lsd]] = arr[i];
                order[lsd]++;
            }
            for(int i = 0; i < 10; i++)
            {
                if(order[i] != 0)
                    for(int j = 0; j < order[i]; j++)
                    {
                    	arr[k++] = temp[i][j];
                        //k++;
                    	temp[i][j] = 0 ;
                    }
                order[i] = 0;
            }
            n *= 10;
            k = 0;
            m++;
        }
	}
	
	private void toArray(int[] arr,int[][] bucket){
		int k = 0 ;
		while(k<arr.length){
			for (int i = 0; i < bucket.length; i++) {
				int l = bucket[i].length;
				for (int j = 0; j < l; j++) {
					arr[k++]=bucket[i][j];
					bucket[i][j]=0;
				}
			}
		}
	}
	
	private int getDigitLength(int[] arr){
		int max = 0 ;
		for (int i = 0; i < arr.length; i++) {
			int l = String.valueOf(i).length();
			max = max<l?l:max;
		}
		return max ;
	}
	
	
}
