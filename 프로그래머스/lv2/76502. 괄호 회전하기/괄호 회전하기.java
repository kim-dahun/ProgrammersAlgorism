import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        String s1 = s;
        for(int i = 0; i<s1.length(); i++){
            
            if(i!=0){
                
                 
                String s2 = "" + s1.charAt(s1.length()-1) + s1;
                s1 = "";
                for(int j = 0; j<s2.length()-1 ; j++){
                    
                    s1 += "" + s2.charAt(j);
                    
                }
                
            }
            
            
            
            int check = 0;
            int left1 = 0;
            int right1 =0;
            int left2 = 0;
            int right2 = 0;
            Stack<Character> stack = new Stack<>();
            for(int j = 0; check<3 ; j++){
                
                
                
                if(j==s1.length()){
                    
                    
                    if(stack.size()!=0 || left1 != right1 || left2!=right2){
                        
                        break;
                        
                    }
                    j=-1;
                    check++;
                    stack = new Stack<>();
                    continue;
                }
                
                if(check==0){
                    
                    if(stack.size()==0){
                        
                        if(s1.charAt(j)=='{' || s1.charAt(j)=='}'){
                            
                            stack.push(s1.charAt(j));
                            
                        }
                        
                        
                        
                    } else {
                        
                        
                        
                        if(stack.peek()=='{'){
                            
                            if(s1.charAt(j)=='}'){
                                
                                stack.pop();
                                
                            } else if(s1.charAt(j)=='{') {
                                
                                stack.push(s1.charAt(j));
                                
                            } else if(s1.charAt(j)=='['){
                        
                                left1++;
                        
                            } else if(s1.charAt(j)==']'){
                        
                                right1++;
                        
                            } else if(s1.charAt(j)=='('){
                        
                                left2++;
                        
                            } else if(s1.charAt(j)==')'){
                        
                                right2++;
                        
                            }
                            
                        } else if(stack.peek()=='}') {
                            
                            stack.push(s1.charAt(j));
                            
                            if(left1!=right1 || left2!=right2){
                                
                                break;
                                
                            }
                            
                        } 
                        
                    }
                        
                    
                    
                    
                    
                    
                } else if(check==1){
                    
                    if(stack.size()==0){
                        
                        if(s1.charAt(j)=='[' || s1.charAt(j)==']'){
                            
                            stack.push(s1.charAt(j));
                            
                        }
                        
                        
                        
                    } else {
                        
                        
                        
                        if(stack.peek()=='['){
                            
                            if(s1.charAt(j)==']'){
                                
                                stack.pop();
                                
                            } else if(s1.charAt(j)=='[') {
                                
                                stack.push(s1.charAt(j));
                                
                            } else if(s1.charAt(j)=='{'){
                        
                                left1++;
                        
                            } else if(s1.charAt(j)=='}'){
                        
                                right1++;
                        
                            } else if(s1.charAt(j)=='('){
                        
                                left2++;
                        
                            } else if(s1.charAt(j)==')'){
                        
                                right2++;
                        
                            }
                            
                        } else if(stack.peek()==']') {
                            
                            stack.push(s1.charAt(j));
                            
                            if(left1!=right1 || left2!=right2){
                                
                                break;
                                
                            }
                            
                        } 
                        
                    }
                        
                    
                    
                    
                    
                    
                } else if(check==2){
                    
                    if(stack.size()==0){
                        
                        if(s1.charAt(j)=='(' || s1.charAt(j)==')'){
                            
                            stack.push(s1.charAt(j));
                            
                        }
                        
                        
                        
                    } else {
                        
                        
                        
                        if(stack.peek()=='('){
                            
                            if(s1.charAt(j)==')'){
                                
                                stack.pop();
                                
                            } else if(s1.charAt(j)=='(') {
                                
                                stack.push(s1.charAt(j));
                                
                            } else if(s1.charAt(j)=='['){
                        
                                left1++;
                        
                            } else if(s1.charAt(j)==']'){
                        
                                right1++;
                        
                            } else if(s1.charAt(j)=='{'){
                        
                                left2++;
                        
                            } else if(s1.charAt(j)=='}'){
                        
                                right2++;
                        
                            }
                            
                        } else if(stack.peek()==')') {
                            
                            stack.push(s1.charAt(j));
                            
                            if(left1!=right1 || left2!=right2){
                                
                                break;
                                
                            }
                            
                        } 
                        
                    }
                        
                    
                    
                    
                    
                }
                
                
            }
            
            if(check==3){
                
                answer++;
                
            }
            check=0;
            
        }
        
        return answer;
    }
}