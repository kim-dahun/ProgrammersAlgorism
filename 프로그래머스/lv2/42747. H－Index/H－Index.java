import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Stack<int[]> stack = new Stack<>();
        int min = 10001*10001;
        for(int i = 0 ; i<citations.length ; i++){
            int[] arr = new int[2];
            arr[0]=citations[i];
            for(int j = 0 ; j<citations.length ; j++){
                
                if(citations[i]>=1 && citations[i]<=citations[j]){
                    
                    arr[1]+=1;
                    
                }
                
            }
            if(min> (arr[0]-arr[1])*(arr[0]-arr[1])){
                if(arr[0]==0 || arr[0]<arr[1]){
                    
                    continue;
                    
                }
                min = (arr[0]-arr[1])*(arr[0]-arr[1]);
                answer = arr[1];
            }
            
        }
        
        
        return answer;
    }
}