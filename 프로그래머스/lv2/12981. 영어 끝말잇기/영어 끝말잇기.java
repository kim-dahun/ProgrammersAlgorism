class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int loser = 0;
            for(int i = 0 ; i<words.length; i++){
                
                if(words[i].length()<2){
                    loser = (i+1)%n;
                        if(loser==0){
                            answer[0]=n;
                            answer[1]=(i+1)%n==0 ? (i+1)/n : (i+1)/n+1;
                        } else {
                            answer[0]=loser;
                            answer[1]=(i+1)%n==0 ? (i+1)/n : (i+1)/n+1;
                        }
                    return answer;
                }
                
                if(i==0){
                    
                } else{
                    String[] s1 = words[i-1].split("");
                    String[] s2 = words[i].split("");
                    
                    if(!s1[s1.length-1].equals(s2[0])){
                        loser = (i+1)%n;
                        if(loser==0){
                            answer[0]=n;
                            answer[1]=(i+1)%n==0 ? (i+1)/n : (i+1)/n+1;
                        } else {
                            answer[0]=loser;
                            answer[1]=(i+1)%n==0 ? (i+1)/n : (i+1)/n+1;
                        }
                        return answer;
                        
                    } 
                }
                
                for(int j = 0; j<i; j++){
                    
                    if(words[j].equals(words[i])){
                        
                        answer[0]=(i+1)%n==0 ? n : (i+1)%n;
                        answer[1]=(i+1)%n==0 ? (i+1)/n : (i+1)/n+1;
                        return answer;
                    }
                    
                }
                
               
                
                
            }

        return answer;
    }
}