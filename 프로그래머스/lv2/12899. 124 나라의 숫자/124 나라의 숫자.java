class Solution {
    public String solution(int n) {
        String answer = "";
        int m = 3;
        
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            
            
            if((n%m)>0 && (n%m)<=(m/3)){
                
                sb.insert(0,"1");
                
            } else if((n%m)>(m/3) && (n%m)<=(m/3*2)){
                
                sb.insert(0,"2");
                
            } else if((n%m)>(m/3*2) || (n%m)==0){
                
                sb.insert(0,"4");
                
            } 
            n-=m;
            m*=3;
            
        }
        
        
           
        return sb.toString();
    }
}