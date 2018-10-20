package com.test.sum;
//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//暴力法找出数组中和为目标值的两个数(两数之和)
public class Sum {
	public static void main(String []args) {
		int a[] = {2,7,11,15};
		Sum sum = new Sum();   //对象调用方法
		int arr[]=sum.twoSum(a, 13);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public int[] twoSum(int []sums,int target) {
		for(int i=0;i<sums.length;i++) {
			for(int j=i+1;j<sums.length;j++) {
				if(sums[i]+sums[j] == target) {
					return new int[] {i,j};  
				}
			}
		}
//		throw new IllegalArgumentException("No two number!");  //抛出新的非法概念
		throw new NullPointerException("aaa");   //抛出空异常
	}
	
	

}
