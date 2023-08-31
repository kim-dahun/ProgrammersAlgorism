class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = "";
        for(int i = 0 ; n>0 ; i++){
            
            three= three+n%3;  
            n/=3;
        }
        // System.out.println(three);
        String[] s1 = three.split("");
        int count = 1;
        for(int i = s1.length-1 ; i>=0 ; i--){
            
            if(i==s1.length-1){
                
                answer+=Integer.parseInt(s1[i]);
                continue;
            }
            
            answer += (Integer.parseInt(s1[i])*doubleup(count));
            count++;
            
        }
        
        
        return answer;
    }
    
    public int doubleup(int num){
        
        
        int result = 3;
        for(int i = 1 ; i<num ; i++){
            
            result *= 3;
            
        }
        
        return result;
        
    }
    
}