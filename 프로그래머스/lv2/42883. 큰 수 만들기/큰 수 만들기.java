import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        Stack<String> stack = new Stack<>();
        
        
        
        int len = number.length()-k;
        int index = 0;
        int max = 0;
        
        int count = k;
        
        String[] numbers = number.split("");
        for(int i = 0 ; i<numbers.length-len+1; i++){
            
            
            
            if(Integer.parseInt(numbers[i])>max){
                if(numbers[i].equals("9")){
                    
                    index=i;
                    break;
                    
                }
                max=Integer.parseInt(numbers[i]);
                index=i;
                
            }
            
        }
        
        count-=index;
        
        for(int i = index ; i<numbers.length; i++){
            
            
            if(stack.size()==0){
                
                stack.push(numbers[i]);
                
            } else {
                int a = Integer.parseInt(numbers[i]);
                
                while(count>0 && stack.size()>1){
                    
                    int b = Integer.parseInt(stack.peek());
                    // System.out.println("b = " + b + " / count = " + count);
                    if(b<a){
                        
                        stack.pop();
                        count-=1;
                        
                    } else {
                        
                        break;
                        
                    }
                    
                }
                
                if(stack.size()<len){
                    stack.push(numbers[i]);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(String x : stack){
            
            sb.append(x);
            
        }
        
        return sb.toString();
    }
}