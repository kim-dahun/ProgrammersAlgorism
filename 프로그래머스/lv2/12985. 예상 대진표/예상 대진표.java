class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
            
           for(int i = 1 ; i<=n ; i++){
            
             if(a%2==0){
                 a = a/2;
             } else {
                 a = a/2+1;
             }
               
             if(b%2==0){
                 b = b/2;
             } else{
                 b = b/2+1;
             }
             if(a==b){
                 answer = i;
                 return answer;
             }
           } 
            
        

        

        return answer;
    }
}