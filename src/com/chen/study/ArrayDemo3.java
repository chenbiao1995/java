package com.chen.study;

public class ArrayDemo3 {

	public static void main(String[] args) {
		//��ʽ1
		/*
		 * ��Ҫһ�����������ǲ���ȷ�ľ�������
		 * */
		int[] arr = new int[3];
		//��ʽ2
		/*
		 * ��Ҫһ��������������֪������
		 * */
		
		//Ԫ������[] ������ = new Ԫ������[]{Ԫ�أ�Ԫ�ء�����}
		int[] arr1 = new int[]{89,34,270,17};

		int[] arr2 = {23,14,343,53,13,34,5};
		/*
		 *���������������Ķ������Ǵ��ȡ��
		 *����˼�룺���ǶԽǱ�Ĳ����� 
		 */
//		System.err.println(arr2[3]);
		for (int a=0;a<arr2.length;a++) {
			System.err.println("arr["+a+"] = "+arr2[a]+";");
		}
	}

}
