package com.test.palindromeNumber;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//121  121是     ；  -121  121-不是  ；    10 01不是；
//思路：1、反转一半数字   1221  用反转后的21->12与剩下的12比较     2、字符串的处理      3、反转整数处理(可能会溢出)


import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		
		Scanner in = new Scanner(System.in);    //使用scanner类定义对象
		System.out.println("请输入一个整数：");
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(in.nextInt()));     //in.nextInt()输入一个整数
	}
	
	//判断是否是回文数
	public boolean isPalindrome(int x) {
		//只要x是负数或能整除10（不包含0） 的数，就不是回文数
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int number = 0;
		while(x > number) {
			number = number * 10 + x % 10;   //反转数
			x = x / 10;     //去位 
			
			//return (number == x || x ==number / 10);    //返回boolean类型
		}
		if(x==number || x == number / 10) {
			return true;
		}
		else {
			return false;
		}
	}

}
