package com.test.romanToInt;
//������ת����     �������ְ������������ַ�: I�� V�� X�� L��C��D �� M��
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//�������
//I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
//X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90�� 
//C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��

import java.util.Scanner;

public class RomanToInt {
	public static void main(String args[]) {
		RomanToInt rToInt = new RomanToInt();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);    ////ʹ��scanner�ඨ�����
		System.out.println(rToInt.romanToInt(in.next()));;
	}
	
	public int romanToInt(String s) {
		char ch[] = s.toCharArray();   //���ַ���ת��Ϊ�ַ����飬
		int sum = 0;
//		System.out.println(ch[0]);
		for(int i=0; i<ch.length; i++) {   //���ַ�������߿�ʼ      ������
			switch(ch[i]) {
				case 'I':
					sum += 1;
					break;
				case 'V':
					sum += 5;
					if(i-1>=0 && ch[i-1] == 'I') {    //i-1>0ȷ�����ַ����ǵ�һ��ch[0]
						sum -= 2;
					}
					break;
				case 'X':
					sum += 10;
					if(i-1>=0 && ch[i-1] == 'I') {
						sum -= 2;
					}
					break;
				case 'L':
					sum += 50;
					if(i-1>=0 && ch[i-1] == 'X') {
						sum -= 20;
					}
					break;
				case 'C':
					sum += 100;
					if(i-1>=0 && ch[i-1] == 'X') {
						sum -= 20;
					}
					break;
				case 'D':
					sum += 500;
					if(i-1>=0 && ch[i-1] == 'C') {
						sum -= 200;
					}
					break;
				case 'M':
					sum += 1000;
					if(i-1>=0 && ch[i-1] == 'C') {
						sum -= 200;
					}
					break;
				default:
					break;
			}
		}
		
		
		return sum;
	}
	
}
