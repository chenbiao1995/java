package com.chen.study;
//���ֵ��ѡ������ð������
import java.util.Arrays;

public class ArrayDemo4 {
		public static void main(String[] args) {
//			int[] arr = new int[]{-1,-34,-435,-53,-534,-12};
			int[] arr = new int[]{1,34,54,6456,35,345,352};
//			printArray(arr);
			bubbleSort(arr);
//			selectSort(arr);
			printArray(arr);
			//java��������
//			Arrays.sort(arr);
//			int max = getMax2(arr);
//			System.err.println("max="+max);
		}
		//ѡ������
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
		//��������
		public static void  swap(int[] arr,int a,int b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		//��������Ĺ���
		public static void printArray(int[] arr) {
			for(int x=0;x<arr.length;x++) {
				if(x!=arr.length-1) {
					System.err.println(arr[x]+",");
				} else
					System.err.println(arr[x]);
			}
		}
		//ð������
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
		//��ȡ�����е����ֵ
		/*
		 * ˼·��1��Ҫ���бȽϣ������������¼ÿ�αȽϺ�ϴ��ֵ
		 * 2�������е�Ԫ�ؽ��б���ȡ�����ͱ����м�¼��Ԫ�ؽ��бȽ�
		 * �����������Ԫ�ش��ڱ����м�¼��Ԫ�أ����ñ�����¼�ô��ֵ
		 * 3�����������ñ�����¼�������ֵ
		 * ����һ��������ʵ��
		 * ��ȷһ������������е�Ԫ�� int
		 * ��ȷ����δ֪���� ����
		 */
//		public static int getMax(int[] arr) {
//			//���������¼����ֵ
//			int max = arr[0];
//			for (int x=1;x<arr.length;x++) {
//				if(arr[x]>max) {
//					max = arr[x];
//				}
//			}
//			return max;
//		}
//		public static int getMax2(int[] arr) {
//			//���������¼����ֵ
//			int max = 0;
//			for (int x=1;x<arr.length;x++) {
//				if(arr[x]>arr[max]) {
//					max = x;
//				}
//			}
//			return arr[max];
//		}

  
}
