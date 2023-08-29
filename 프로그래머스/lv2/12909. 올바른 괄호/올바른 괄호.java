import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0)==')' || s.charAt(s.length()-1)=='('){
            return false;
        }
        
        
        
        for(int i = 0 ; i<s.length() ; i++){
            
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            } else if(stack.size()!=0){
                stack.pop();
            }
            
        }
        
        if(stack.size()==0){
            answer=true;
        } else {
            answer=false;
        }
        
        return answer;
    }
}