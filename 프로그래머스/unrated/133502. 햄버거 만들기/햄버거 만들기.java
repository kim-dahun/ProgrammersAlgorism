import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0 ; i<ingredient.length ; i++){
            
            
                list.add(ingredient[i]);
                if(ingredient[i]==1 && list.size()>=4){
                    int len = list.size()-1;
                    if(list.get(len)==1 && list.get(len-1)==3 && list.get(len-2)==2 && list.get(len-3)==1){
                        
                        for(int j = len; j>=len-3; j--){
                            
                            list.removeLast();
                            
                        }
                        answer++;
                    }
                    
                }
                
            
        }
        
        
        return answer;
    }
}