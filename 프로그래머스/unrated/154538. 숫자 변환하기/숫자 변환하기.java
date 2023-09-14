import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        boolean check = true;
        set.add(x);
        int count = 0;
        while(set.size()>0){
            if(set.contains(y)){
                return count;
            }
            set2 = new HashSet<>();
            for(Integer sam : set){
                // System.out.println(sam);
                if(sam*2<=y){
                    set2.add(sam*2);
                }
                
                if(sam*3<=y){ 
                    set2.add(sam*3);
                }
                
                if(sam+n<=y){
                    set2.add(sam+n);
                }
            }
            count++;
            set = set2;
            
            
        }
        
        
        
        return -1;
    }
    
    
    
    
}