import java.util.*;

class Solution {
    public long solution(int n) {
        long answer = 0;
        LinkedList<Long> list = new LinkedList<>();
        long a = (long) n;
        if(a==1){
            answer = 1;
            
        } else if(a==2){
            answer = 2;
            
        } else {
            
            for(long i = 0 ; i<=a ; i++){
                
                if(i==0){
                    
                    list.add((long)1);
                    
                } else if(i==1){
                    
                    list.add((long)1);
                    
                } else {
                    long alpha = list.get((int)i-2);
                    long beta = list.get((int)i-1);
                    list.add((alpha+beta)%1234567);
                    
                }
                
            }
            
            int len = list.size();
            answer = list.get(len-2)+list.get(len-3);
            
        }
        
        answer = answer%1234567;
        
        return answer;
    }
}