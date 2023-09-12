import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        // 인덱스를 담을 stack
        Stack<Integer> stack = new Stack<>();
        
        
        for(int i = 0 ; i<numbers.length; i++){
            
            if(i==0){
                
                stack.push(0);
                
            } else{
                
                // 스택에 원소가 있고, 현재 원소값이 스택에 저장된 인덱스의 값보다 크다면 다음 큰 수로 인식함.
                while(stack.size()>0 && numbers[stack.peek()] < numbers[i]){
                    
                    numbers[stack.pop()] = numbers[i];
                    
                }
                
                // 조건에 부합하지 않거나 반복문이 종료되면 현재 인덱스를 넣어줌.
                stack.push(i);
            }
            
            
        }
        
        while(stack.size()>0){
                
                numbers[stack.pop()]=-1;
                
        }
        
        return numbers;
    }
}