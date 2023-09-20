import java.util.*;

class Solution {
    
    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        Arrays.sort(stations);
        
        for(int i = 0 ; i<stations.length; i++){

            int baseline = stations[i]; // 기지국 설치 위치
            int start = baseline - w >= 0 ? baseline-w : 0; // 기지국 전파 좌측끝
            int len = baseline + w < n ? baseline + w : n; // 기지국 전파 우측끝
            int wides = 1+(2*w);
            
            if(stations.length==1){
                if((n-len)%wides==0){
                    answer+=(n-len)/wides;
                } else{
                    answer+=(n-len)/wides+1;
                }
                
                if((start-1)>0){
                    
                    if((start-1)%wides==0){
                        answer+=(start-1)/wides;
                    } else{
                        answer+=(start-1)/wides+1;
                    }
                    
                }
                continue;
            } else {
                
                if(i==stations.length-1){
                    if((n-len)>0){
                        if((n-len)%wides==0){
                            answer+=(n-len)/wides;
                        } else{
                            answer+=(n-len)/wides+1;
                        }
                    }
                } else {
                    
                    int baseline2 = stations[i+1];
                    int start2 = baseline2 - w >= 0 ? baseline2-w : 0;

                    if(start2-len-1>0){
                        if((start2-len-1)%wides==0){
                                answer+=(start2-len-1)/wides;
                        } else{
                                answer+=(start2-len-1)/wides+1;
                        }
                    }
                    
                }
                
                if(i==0){
                    
                    if(start>0){
                        
                        if((start-1)%wides==0){
                            answer+=(start-1)/wides;
                        } else{
                            answer+=(start-1)/wides+1;
                        } 
                    }
                    
                }
                
                
            }
            
        }

        return answer;
    }
}