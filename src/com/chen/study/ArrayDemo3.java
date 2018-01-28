package com.chen.study;

public class ArrayDemo3 {

	public static void main(String[] args) {
		//格式1
		/*
		 * 需要一个容器，但是不明确的具体数据
		 * */
		int[] arr = new int[3];
		//格式2
		/*
		 * 需要一个容器，储存已知的数据
		 * */
		
		//元素类型[] 数组名 = new 元素类型[]{元素，元素、、、}
		int[] arr1 = new int[]{89,34,270,17};

		int[] arr2 = {23,14,343,53,13,34,5};
		/*
		 *对数组操作最基本的动作就是存和取，
		 *核心思想：就是对角标的操作。 
		 */
//		System.err.println(arr2[3]);
		for (int a=0;a<arr2.length;a++) {
			System.err.println("arr["+a+"] = "+arr2[a]+";");
		}
	}

}
