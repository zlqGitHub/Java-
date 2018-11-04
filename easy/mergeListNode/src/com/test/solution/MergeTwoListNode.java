package com.test.solution;

public class MergeTwoListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode L1 = new ListNode(1);
		ListNode L2 = new ListNode(1);
		
		L1.add(2);
		L1.add(3);
		
		L2.add(3);
		L2.add(4);
		
		MergeTwoListNode mtl = new MergeTwoListNode();
		
		ListNode res = mtl.mergetTwoListNode(L1, L2);
		System.out.println(res.val);
		res.print();
		 

	}
	
	public ListNode mergetTwoListNode(ListNode L1,ListNode L2) {
		ListNode temp1 = L1;
		ListNode temp2 = L2;
		ListNode newTemp = new ListNode(0);
		ListNode res = newTemp;
		while(temp1 != null && temp2 != null) {
			if(temp1.val >= temp2.val) {
				newTemp.next = temp1;
				newTemp = newTemp.next;
				temp1 = temp1.next;
			}
			else {
				newTemp.next = temp2;
				newTemp = newTemp.next;
				temp2 = temp2.next;
			}
		}
		if(temp1 == null && temp2 != null){
            newTemp.next = temp2;
        }
        
        if(temp1 != null && temp2 == null){
            newTemp.next = temp1;
        }
		
		return res.next;
		
		
		
	}

}
