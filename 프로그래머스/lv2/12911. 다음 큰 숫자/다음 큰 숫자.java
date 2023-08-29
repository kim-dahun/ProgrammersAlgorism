class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String x = Integer.toString(n,2);
        String x1 = x.replace("0","");
        count = x1.length();
        
        
        int vscount = count;
        count = 0;
        
        
            for(int i = n+1 ; i<=1000000; i++){
                
                String s = Integer.toString(i,2);
                
                String x2 = s.replace("0","");
                count = x2.length();
                
                
                if(count==vscount){
                    
                    return i;
                    
                }
                count = 0;
                
            }
        
        return answer;
    }
    

    
}