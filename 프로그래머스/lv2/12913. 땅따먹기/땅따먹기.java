import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        
        
        for(int i = 1 ; i<land.length; i++){
            
            
            
            for(int j = 0 ; j<4 ; j++){
                
                
                land[i][j] = findMax(land,i,j);
                
                if(answer<land[i][j]){
                    
                answer = land[i][j];
                    
            }
                
            }
            
            
            
        }


        return answer;
    }
    
    public int findMax(int[][] land, int i, int j){
        int max = 0;
        for(int k = 0 ; k<4; k++){
            
            if(j!=k){
            
                int sum = land[i-1][k]+land[i][j];
                if(sum>max){
                    
                    max = sum;
                    
                    
                }
            
            }
        }
        
        return max;
        
    }
    
}