package com.test.solution;

public class ListNode {   //����һ��ListNode
	int val;
	ListNode next;     //��һ���ڵ�
	ListNode(int x){this.val = x;}    //���캯���ĳ�ʼ��
	
	public void add(int newdata) {
		ListNode newNode = new ListNode(newdata);
		if(this.next == null) {
			this.next = newNode;
		}
		else {
			this.next.add(newdata);
		}
		
	}
	
	 public void print(){  
		          System.out.print(this.val + "-->");  
		          if(this.next!=null){  
		               this.next.print();  
		           }
		       }  
	

}
