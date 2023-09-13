import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> set = new TreeSet<>();
        Map<Integer,Integer> map = new TreeMap<>();
        
        // 각 토핑별 갯수를 담은 Map
        for(int i = 0 ; i<topping.length ; i++){
            
            if(map.get(topping[i])==null){
                
                map.put(topping[i],0);
                
            }
            
            map.put(topping[i],map.get(topping[i])+1);
            
        }
            
        for(int i = 0 ; i<topping.length; i++){
            
            map.put(topping[i],map.get(topping[i])-1);
            set.add(topping[i]);
            if(map.get(topping[i])==0){
                map.remove(topping[i]);
            }
            
            if(set.size()==map.size()){
                
                answer++;
                
            }
            
        }
        
        return answer;
    }
    
    
}