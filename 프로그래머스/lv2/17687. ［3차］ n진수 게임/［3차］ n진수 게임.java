import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int myTurn = m==p ? 0 : p;
        
        
        int count = 1;
        int chk = 0;
        String memberSay = "";
        StringBuilder str = new StringBuilder("");
        for(int i = 0 ; chk<t; i++){
           
            if(i<n){
                
                if(i>=10){
                    
                memberSay = "" + (char) (i+55);   
                    
                } else{
                
                memberSay = i+"";
                }
                if(turnCheck(count,m,myTurn)){
                    
                    str.append(memberSay);
                    chk++;
                }
                count++;
            } else {
                
                int makeDigit = i;
                StringBuilder str2 = new StringBuilder("");
                while(makeDigit>0){
                    
                    if(n>10 && makeDigit%n>=10){
                        
                        str2.insert(0,(char)(makeDigit%n + 55));
                        
                    } else {
                    
                        str2.insert(0,makeDigit%n);
                        
                    }
                    makeDigit/=n;
                    
                }
                memberSay = str2.toString();
                
                char[] c1 = memberSay.toCharArray();
                
                for(int j = 0; j<c1.length; j++){
                    
                    if(chk>=t){
                        
                        break;
                        
                    }
                    
                    if(turnCheck(count+j,m,myTurn)){
                        
                        
                        str.append(c1[j]);
                        chk++;
                        
                    }
                    
                }
                count += c1.length;
                
            }
            
            
            
        }
        
        answer = str.toString();
        
        return answer;
    }
    
    public boolean turnCheck(int count, int member, int myturn){
        
        return count%member==myturn ? true : false;
        
    }
    
}