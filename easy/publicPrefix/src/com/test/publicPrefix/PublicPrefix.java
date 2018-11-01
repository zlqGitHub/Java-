package com.test.publicPrefix;

public class PublicPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicPrefix pp = new PublicPrefix();
		
		String[] strs = {"flow","flower","flight"};   //定义一个字符数组
		    
		
		String s = pp.longestCommonPrefix(strs);

		System.out.println(s);

	}
	
	public String longestCommonPrefix(String[] strs) {
        String temp = "";
        
        if(strs.length == 0 || strs[0].equals("")){  //判断数组是否为空及首项的值是否为空
            return "";
        }
        
        temp = strs[0];
        
        for(int i=1;i<strs.length;i++){
        	
            if(strs[i].length() == 0 ){   //判断下一项是否为空，空则退出
                return "";
            }
            
            else if(temp.length() >= strs[i].length()){   //判断选出长度最小项
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
