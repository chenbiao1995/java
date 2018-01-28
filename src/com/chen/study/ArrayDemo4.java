package com.chen.study;
//最大值，选择排序，冒泡排序
import java.util.Arrays;

public class ArrayDemo4 {
		public static void main(String[] args) {
//			int[] arr = new int[]{-1,-34,-435,-53,-534,-12};
			int[] arr = new int[]{1,34,54,6456,35,345,352};
//			printArray(arr);
			bubbleSort(arr);
//			selectSort(arr);
			printArray(arr);
			//java内置排序
//			Arrays.sort(arr);
//			int max = getMax2(arr);
//			System.err.println("max="+max);
		}
		//选择排序
//		public static void selectSort(int[] arr) {
//			for(int x=0; x<arr.length-1;x++) {
//				for(int y=x+1;y<arr.length;y++) {
//					if(arr[x]>arr[y]) {
//						int temp = arr[x];
//						arr[x] = arr[y];
//						arr[y] = temp;
//					}
//				}
//			}
//		}
		//交换功能
		public static void  swap(int[] arr,int a,int b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		//遍历数组的功能
		public static void printArray(int[] arr) {
			for(int x=0;x<arr.length;x++) {
				if(x!=arr.length-1) {
					System.err.println(arr[x]+",");
				} else
					System.err.println(arr[x]);
			}
		}
		//冒泡排序
		public static void bubbleSort(int[] arr) {
			for(int x=0; x<arr.length-1;x++) {
				for(int y=0;y<arr.length-1-x;y++) {
					if(arr[y]>arr[y+1]) {
						swap(arr, y, y+1);
					}
				}
			}
		}

		// TODO Auto-generated method stub
		//获取数组中的最大值
		/*
		 * 思路：1需要进行比较，并定义变量记录每次比较后较大的值
		 * 2对数组中的元素进行遍历取出，和变量中记录的元素进行比较
		 * 如果遍历到的元素大于变量中记录的元素，就用变量记录该大的值
		 * 3遍历结束，该变量记录就是最大值
		 * 定义一个功能来实现
		 * 明确一：结果：数组中的元素 int
		 * 明确二：未知内容 数组
		 */
//		public static int getMax(int[] arr) {
//			//定义变量记录最大的值
//			int max = arr[0];
//			for (int x=1;x<arr.length;x++) {
//				if(arr[x]>max) {
//					max = arr[x];
//				}
//			}
//			return max;
//		}
//		public static int getMax2(int[] arr) {
//			//定义变量记录最大的值
//			int max = 0;
//			for (int x=1;x<arr.length;x++) {
//				if(arr[x]>arr[max]) {
//					max = x;
//				}
//			}
//			return arr[max];
//		}

  
}
