package com.chen.study;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		//ArrayIndexOutOfBoundsException
		//�����ʵ������в����ڵĽǱ�ʱ���ͻᷢ�����쳣
		//System.err.println(arr[3]);
		
//		arr = null;
		//java.lang.NullPointerException
		//�������ͱ���û���κ�ʵ��ָ��ʱ�������������ʵ�壬�ͻᷢ�����쳣
//		System.err.println(arr[0]);
		
		//[I@7852e922
		
		System.err.println(arr);
	}
}
