class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        
        int start = s/n;
        int len = s%n;
        
        if(n>s){
            
            return new int[]{-1};
            
        }
        
        if(s%n==0){
            
            answer = new int[n];
            
            for(int i = 0 ; i<answer.length ; i++){
                
                answer[i] = start;
                
            }
            
        } else {
            
            answer = new int[n];
            
            for(int i = answer.length-1; i>=0 ; i--){
                
                if(i>=(answer.length-len)){
                    
                    answer[i] = start+1;
                    
                } else {
                    
                    answer[i] = start;
                    
                }
                
            }
            
        }
        
        
        
        
        
        
        return answer;
    }
}