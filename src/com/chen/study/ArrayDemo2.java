package com.chen.study;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		//ArrayIndexOutOfBoundsException
		//当访问到数组中不存在的角标时，就会发生该异常
		//System.err.println(arr[3]);
		
//		arr = null;
		//java.lang.NullPointerException
		//当引用型变量没有任何实体指向时，还在用其操作实体，就会发生该异常
//		System.err.println(arr[0]);
		
		//[I@7852e922
		
		System.err.println(arr);
	}
}
