package com.test.publicPrefix;

public class PublicPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicPrefix pp = new PublicPrefix();
		
		String[] strs = {"flow","flower","flight"};   //����һ���ַ�����
		    
		
		String s = pp.longestCommonPrefix(strs);

		System.out.println(s);

	}
	
	public String longestCommonPrefix(String[] strs) {
        String temp = "";
        
        if(strs.length == 0 || strs[0].equals("")){  //�ж������Ƿ�Ϊ�ռ������ֵ�Ƿ�Ϊ��
            return "";
        }
        
        temp = strs[0];
        
        for(int i=1;i<strs.length;i++){
        	
            if(strs[i].length() == 0 ){   //�ж���һ���Ƿ�Ϊ�գ������˳�
                return "";
            }
            
            else if(temp.length() >= strs[i].length()){   //�ж�ѡ��������С��
                // boolean flag = false;
                for(int j=0;j<strs[i].length();j++){
                    // System.out.println(strs[i].charAt(j));
                    if(temp.charAt(j) != strs[i].charAt(j)){
                        temp = strs[i].substring(0,j);  
                        // flag =true;
                        break;
                    }
                    if(j == strs[i].length() -1 ){    
                        temp = strs[i];
                    }
                    
                }
            }
            
            else{
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) != strs[i].charAt(j)) {
                        temp = strs[i].substring(0, j);
                        break;
                    }
	                if(j == strs[i].length() -1 ){    
	                    temp = strs[i];
	                }
                }
            }

        }
        return temp;
    }
        

}
