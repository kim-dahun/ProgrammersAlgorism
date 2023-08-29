import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 1 ; i<=elements.length ; i++){
            
            for(int j = 0 ; j<elements.length ; j++){
                int sum = 0;
                for(int k = j ; k<j+i ; k++){
                    int a = k;
                    if(a>elements.length-1){
                        
                        a-=elements.length;
                        
                        
                    }
                    sum += elements[a];
                    
                }
                set.add(sum);
            }
            
        }
        
        return set.size();
    }
}