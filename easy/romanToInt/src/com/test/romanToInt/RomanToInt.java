package com.test.romanToInt;
//罗马数转整数     罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//特殊情况
//I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

import java.util.Scanner;

public class RomanToInt {
	public static void main(String args[]) {
		RomanToInt rToInt = new RomanToInt();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);    ////使用scanner类定义对象
		System.out.println(rToInt.romanToInt(in.next()));;
	}
	
	public int romanToInt(String s) {
		char ch[] = s.toCharArray();   //将字符串转化为字符数组，
		int sum = 0;
//		System.out.println(ch[0]);
		for(int i=0; i<ch.length; i++) {   //从字符串的左边开始      从左到右
			switch(ch[i]) {
				case 'I':
					sum += 1;
					break;
				case 'V':
					sum += 5;
					if(i-1>=0 && ch[i-1] == 'I') {    //i-1>0确保该字符不是第一项ch[0]
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
