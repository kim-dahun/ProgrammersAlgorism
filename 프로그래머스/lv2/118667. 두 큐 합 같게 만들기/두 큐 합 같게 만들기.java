import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long que1Sum = 0;
        long que2Sum = 0;
        
        LinkedList<Integer> que1 = new LinkedList<>();
        LinkedList<Integer> que2 = new LinkedList<>();
        
        for(int i = 0 ; i<queue1.length; i++){
            
            
            
            que1Sum += queue1[i];
            que1.add(queue1[i]);
            que2Sum += queue2[i];
            que2.add(queue2[i]);
        }
        
        long sumTarget = (que1Sum+que2Sum)/2;
        
        // 섞기 전에 que1과 que2 합계가 홀수거나 원소중에 타겟보다 큰수가 있거나 하면 -1
        
        if((que1Sum+que2Sum)%2!=0){
            return -1;
        }
        int count = 0;
        while(count<=600000){
            // System.out.println(answer);
            if(que1Sum==sumTarget && que2Sum==sumTarget){
                
                break;
                
            } else if(que1.get(0)>sumTarget || que2.get(0)>sumTarget) {
                
                return -1;
                
            } else {
                int value = 0;
                if(que1Sum<que2Sum){
                    
                    value = que2.removeFirst();
                    que2Sum-=value;
                    que1Sum+=value;
                    que1.add(value);
                    
                } else {
                    
                    value = que1.removeFirst();
                    que2Sum+=value;
                    que1Sum-=value;
                    que2.add(value);
                    
                }
                answer++;
            }
            count++;
        }
        
        if(count==600001){
            answer = -1;
        }
        
        return answer;
    }
}