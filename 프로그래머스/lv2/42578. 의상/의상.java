import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i<clothes.length ; i++){
            
            set.add(clothes[i][1]);
            
        }
        
        for(String x : set){
            int result = 0;
            for(int j = 0 ; j<clothes.length ; j++){
                
                if(x.equals(clothes[j][1])){
                    
                    result++;
                    
                }
                
            }
            result++;
            answer *= result; 
            
        }
        
        answer-=1;
        
        return answer;
    }
}