package com.test.sum;
//����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
//�������ҳ������к�ΪĿ��ֵ��������(����֮��)
public class Sum {
	public static void main(String []args) {
		int a[] = {2,7,11,15};
		Sum sum = new Sum();   //������÷���
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
//		throw new IllegalArgumentException("No two number!");  //�׳��µķǷ�����
		throw new NullPointerException("aaa");   //�׳����쳣
	}
	
	

}
