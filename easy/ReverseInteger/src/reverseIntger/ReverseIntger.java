package reverseIntger;

public class ReverseIntger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseIntger revInt = new ReverseIntger();
		int num = 128;
		int result = revInt.reverse(num);
		System.out.println(result);

	}
	
	//��ת�����㷨
	public int reverse(int x) {
		int rev = 0;   
		System.out.println(Integer.MAX_VALUE);    //21474836487
		System.out.println(Integer.MIN_VALUE);    //-2147483648
		while(x != 0) {
			int pop = x % 10;   // ȡ������ 
			x /= 10;           //����ȥλ 
			if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}
			
			rev = rev * 10 + pop;    //�����ת����
		}
		
		return rev; 
	}

}
