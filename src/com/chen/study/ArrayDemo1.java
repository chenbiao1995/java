package com.chen.study;

public class ArrayDemo1 {
	public static void main(String[] args) {
		//局部代码块，限定局部变量的生命周期
		{
			int age = 3;
		} 
		int [] arr = new int[3];
		arr[0] = 89;
		System.out.println(arr[0]);
		for(int x=0;x<4;x++) {
			
		}
	}
} 
/*内存的划分
 * 1.寄存器
 * 2.本地方法区
 * 3.栈内存
 * 		存储的都是局部变量
 * 		而且变量所属的作用域一旦结束，该变量自动释放9 
 * 4.堆内存
 * 存储的是数组和对象，其实数组就是对象，凡是new建立的都在堆中
 * 特点：
 * 1.每一个实体都有一个首地址
 * 2.堆内存中的每一个变量都有默认初始化值，根据类型不同而不同，整数是0，小数是0.0或者0.0f 
 * boolean false char '\u0000'
 * 
 */
