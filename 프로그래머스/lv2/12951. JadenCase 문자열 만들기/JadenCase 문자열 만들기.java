class Solution {
    public String solution(String s) {
        
        
                boolean check = true;
        boolean all = false;
        String answer ="";
        char[] c1 = s.toCharArray();
        
        for(int i = 0; i<c1.length ; i++) {
            String ans = c1[i] + "";
            if(ans.equals(" ")) {
                
                check=true;
                all = false;
                
            } else {
                
                if(check==true) {
                    
                    if(ans.matches(".*[0-9].*")) {
                        
                        all = true;
                        
                    } else {
                        
                        if(all==false) {
                            
                            ans = ans.toUpperCase();
                            all = true;
                            
                        } else {
                            
                            ans = ans.toLowerCase();
                            
                        }
                        
                    }
                    
                } 
                
                
            }
            answer += ans;
        }
        
        return answer;
        
    }
        
        
        
    }
