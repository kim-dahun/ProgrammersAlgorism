import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int i = scoville.length-1 ; i>=0; i--){
            
            que.add(scoville[i]);
            
        }
        boolean check = false;
        while(que.size()>1){
            
            if(que.peek()>=K){
                check = true;
                break;
                
            }
            
            
            int a = que.poll();
            int b = que.poll();
            
            
            
            
            que.add(a+(b*2));
            answer++;
            if(que.size()==1 && (a+(b*2))>=K){
                
                check=true;
                break;
                
            }
            
            
            
        }
        
        if(check==false){
            
            return -1;
            
        }
        
        return answer;
    }
    
    
    
    
    
}