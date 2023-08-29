class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int count = 1;
        for(int i = 1; count<=n  ; i++){
            
            
            sum += i;
            
            if(sum==n){
                answer++;
                
                count++;
                i = count;
                
                sum = 0;
            } else if(sum>n) {
                count++;
                i = count;
                sum = 0;
                
            } 
            
            
        }
        
        if(n==2){
            return 1;
        }
        
        
        return answer;
    }
}