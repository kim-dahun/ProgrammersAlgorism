import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int maximum = 0;
        int[] bigyo = new int[number.length];
        for(int i = 0 ; i<number.length ; i++){
            
            maximum += number[i];
            bigyo[i]=number[i];
        }
        
        
        
        for(int i = 0 ; i<discount.length-maximum+1 ; i++){
            
            
            
            for(int j = i; j<i+10; j++){
                
                if(j==discount.length){
                    
                    break;
                    
                }
                
                // System.out.println(discount[j]);
                for(int k = 0 ; k<want.length ; k++){
                    
                    if(want[k].equals(discount[j])){
                        // System.out.println(want[k]);
                        if(bigyo[k]>0){
                            
                            bigyo[k]-=1;
                            // System.out.println(want[k]);
                            break;
                        }
                        
                    }
                
                }
            
                
            }
            // System.out.println("//////");
            int sum = 0;
            for(int j = 0 ; j<bigyo.length ; j++){
                
                sum += bigyo[j];
               
            }
            // System.out.println(sum);
            if(sum==0){
                
                answer++;
                
            }
            for(int j = 0 ; j<bigyo.length ; j++){
                
                bigyo[j]=number[j];
                
            }
            
        }
        
        
        
        
        
        return answer;
    }
}