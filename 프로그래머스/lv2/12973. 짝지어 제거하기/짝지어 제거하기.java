import java.util.*;

class Solution
{
    
    public int solution(String s)
    {
        
        int answer = 0;
        String[] s1 = s.split("");
        Stack<String> list = new Stack<>();
        
        for(String x : s1){
            
            if(list.size()==0){
                
                list.push(x);
                
            } else if (x.equals(list.peek())){
                
                list.pop();
                
            } else {
                
                list.push(x);
                
            }
            
        }
        
        if(list.size()==0){
            answer = 1;
            
        } else {
            answer = 0;
        }
        

        return answer;
    }
}