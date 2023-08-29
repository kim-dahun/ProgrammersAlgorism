import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Stack<Integer> stack = new Stack<>();
        Deque<Stack<Integer>> que = new ArrayDeque<>();
        int b = 0;
        for(int i = 0 ; i<speeds.length ; i++){
            int a = 0;
            if((100-progresses[i])%speeds[i]==0){
                
                a = (100-progresses[i])/speeds[i];
                
            } else {
                
                a = (100-progresses[i])/speeds[i]+1;
                
            }
            
            if(stack.size()==0){
                b=a;
                stack.push(a);
                if(i==speeds.length-1){
                    
                    que.add(stack);
                    
                }
            } else if(b>=a){
                
                stack.push(a);
                if(i==speeds.length-1){
                    
                    que.add(stack);
                    
                }
            } else {
                
                que.add(stack);
                stack = new Stack<>();
                stack.push(a);
                b=a;
                if(i==speeds.length-1){
                    
                    que.add(stack);
                    
                }
                
            }
            
        }
        int[] answer = new int[que.size()];
        
        for(int i = 0; i<answer.length; i++){
            
            answer[i]=que.removeFirst().size();
            
        }
        
        return answer;
    }
}