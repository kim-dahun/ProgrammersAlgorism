import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int i = 0 ; i<B.length; i++){
            
            que.add(B[i]);
            
        }
        Arrays.sort(A);
        for(int i = 0 ; i<A.length; ){
            
            if(que.size()==0){
                
                break;
                
            }
            
            if(que.poll()>A[i]){
                
                i++;
                answer++;
                
            }
            
        }
        
        return answer;
    }
    
    
    
}