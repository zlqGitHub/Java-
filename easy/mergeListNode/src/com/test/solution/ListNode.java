package com.test.solution;

public class ListNode {   //定义一个ListNode
	int val;
	ListNode next;     //下一个节点
	ListNode(int x){this.val = x;}    //构造函数的初始化
	
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
