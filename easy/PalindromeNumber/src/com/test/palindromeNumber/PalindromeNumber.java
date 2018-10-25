package com.test.palindromeNumber;
//�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
//121  121��     ��  -121  121-����  ��    10 01���ǣ�
//˼·��1����תһ������   1221  �÷�ת���21->12��ʣ�µ�12�Ƚ�     2���ַ����Ĵ���      3����ת��������(���ܻ����)


import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		
		Scanner in = new Scanner(System.in);    //ʹ��scanner�ඨ�����
		System.out.println("������һ��������");
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(in.nextInt()));     //in.nextInt()����һ������
	}
	
	//�ж��Ƿ��ǻ�����
	public boolean isPalindrome(int x) {
		//ֻҪx�Ǹ�����������10��������0�� �������Ͳ��ǻ�����
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int number = 0;
		while(x > number) {
			number = number * 10 + x % 10;   //��ת��
			x = x / 10;     //ȥλ 
			
			//return (number == x || x ==number / 10);    //����boolean����
		}
		if(x==number || x == number / 10) {
			return true;
		}
		else {
			return false;
		}
	}

}
