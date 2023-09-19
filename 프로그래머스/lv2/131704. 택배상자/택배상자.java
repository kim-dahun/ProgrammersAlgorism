import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        int pack = 0;
        
        for(int i = 1 ; i<order.length+1; i++){
            
            if(i == order[pack]){
                
                pack++;
                while(true){
                    
                    if(stack.size()<=0){
                        break;
                    }
                    
                    if(stack.peek()==order[pack]){
                        
                        stack.pop();
                        pack++;
                        
                    } else {
                        
                        break;
                        
                    }
                    
                }
                
            } else {
                
                stack.push(i);
                
            }
            
        }
        
        return pack;
    }
}