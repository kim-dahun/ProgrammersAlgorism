class Solution {
    public String solution(String s) {
               String answer = "";
        
        String[] s1 = s.split(" ");
        int max = Integer.parseInt(s1[0]);
        int min = Integer.parseInt(s1[0]);
        for(int i = 0 ; i<s1.length; i++){
            int vs = Integer.parseInt(s1[i]);
            if(min>vs){
                min = vs;
            }
            
            if(max<vs){
                max = vs;
            }
            
        }
        
        answer = min + " " + max;
        
        
        
        return answer;
    }
}