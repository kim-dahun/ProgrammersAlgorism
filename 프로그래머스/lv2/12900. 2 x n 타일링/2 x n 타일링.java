import java.util.*;

class Solution {
    public int solution(int n) {
        
        int x = 1;
        int y = 2;
        int z = 0;
        for(int i = 3 ; i<=n ; i++){
            
            z = (x+y)%1000000007;
            x = y;
            y = z; 
            
        }
        
        
        
        return z;
    }
    
    private int answer = 0;
    
    
    
    
}