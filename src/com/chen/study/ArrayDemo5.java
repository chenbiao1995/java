package com.chen.study;

public class ArrayDemo5 {
/*
 * 数组常见功能，查找
 * */
	public static void main(String[] args) {
//		int[] arr = {4,8 ,7,8,787,45,45,4};
		int[] arr = {1,12,14,21,24,26,37,56,86,98,100};
		
//		int index = getIndex(arr, 8);
		
		int index = halfSearch(arr, 33);

		System.out.println(index);
	}
	public static int getIndex(int[] arr,int key) {
		for(int x=0;x<arr.length;x++) {
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	//二分查找法 int index = Arrays.binarySearch(arr,num)
	public static int halfSearch(int[] arr,int key) {
		int max,min,mid;
		min = 0;
		max = arr.length-1;
		mid = (max+min)/2;
		while(arr[mid]!=key) {
			if(key>arr[mid]) {
				min = mid + 1;
			} else if (key<arr[mid]) {
				max = mid - 1;
			}
			if (max<min) {
				return -1;
			}
			mid = (max+min)/2;
		}
		return mid;
	}
}
