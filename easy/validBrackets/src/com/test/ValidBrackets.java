package com.test;

import java.util.Stack;

public class ValidBrackets {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((({}{}[])))";
		ValidBrackets vb = new ValidBrackets();
		System.out.println(vb.isValid(s));
		
	}
	
	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				char topElem = stack.pop();    
				//ջ��Ԫ���뵱ǰ�������Աȿ��Ƿ�ɶ�
				if(ch == ')' && topElem != '(') {
					return false;
				}
				if(ch == ']' && topElem != '[') {
					return false;
				}
				if(ch == '}' && topElem != '{') {
					return false;
				}
			}
			
		}
		
		return stack.isEmpty();
	}

}

