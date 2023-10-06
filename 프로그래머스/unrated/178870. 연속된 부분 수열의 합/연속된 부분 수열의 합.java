import java.util.*;

class Solution {
    
    private static int len = 1000001;
    
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        LinkedList<Integer> list = new LinkedList<>();
        
        int sum = 0;

        for(int i = 0 ; i<sequence.length; i++){
            
            list.add(i);
            sum+=sequence[i];
            if(sum>=k){
                
                while(sum>=k){
                    if(sum==k && len>(list.getLast()-list.getFirst())){
                    
                        len = list.getLast()-list.getFirst();
                        answer[0]=list.getFirst();
                        answer[1]=list.getLast();
                    
                    }
                    sum -= sequence[list.getFirst()];
                    list.removeFirst();
                }
                
            }
            // System.out.println(sum);
        }
        
        return answer;
    }
}