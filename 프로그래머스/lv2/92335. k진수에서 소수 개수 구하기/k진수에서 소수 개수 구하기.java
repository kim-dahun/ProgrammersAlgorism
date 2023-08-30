import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String bin = "";
        
        for(int i = 0 ; n>0 ; i++){
            
            bin = n%k + "" + bin;
            n/=k;
        }
        
        char[] c1 = bin.toCharArray();
        String c2 = "0";
        for(int i = 0 ; i<c1.length ; i++){
        
            if(c1[i]=='0'){
                
                long num1 = Long.parseLong(c2);
                int check = 0;
                
                c2="0";
                long num2 = (long)Math.sqrt(num1);
                for(int j = 1 ; j<=num2 ; j++){
                    
                    if(num1%j==0){
                        
                        check++;
                        
                        
                    }
                    
                }
                if(check==1 && num1!=1){
                    
                    answer++;
                    
                }
                
            } else {
                
                c2 = c2 + c1[i];
                if(i==c1.length-1){
                    
                long num1 = Long.parseLong(c2);
                int check = 0;
                 long num2 = (long)Math.sqrt(num1);
                for(int j = 1 ; j<=num2 ; j++){
                    
                    if(num1%j==0){
                        
                        check++;
                        
                        
                    }
                    
                }
                if(check==1 && num1!=1){
                    
                    answer++;
                    
                }
                    
                }
                
            }
        
        }
        
        return answer;
    }
}