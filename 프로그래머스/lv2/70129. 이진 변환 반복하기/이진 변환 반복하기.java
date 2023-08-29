class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        boolean start = true;
        for(int i = 0 ; 1<s.length() ;i++ ){
            String[] s2 = s.split("");
            for(int j = 0 ; j<s2.length ; j++){
                
                if(s2[j].equals("0")){
                    
                    answer[1] += 1;
                    
                }
                
            }
            
            String s1 = s.replace("0","");
            int len = s1.length();
            s1 = ""+Integer.toBinaryString(len);
            
            s = s1;
            
            answer[0]+=1;
            if(s1.length()==0){
                
                start=false;
                
            }
            
        }
        
        return answer;
    }
}