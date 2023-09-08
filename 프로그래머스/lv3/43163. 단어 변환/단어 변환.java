class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int[] check = new int[words.length];
        ts = target;
        
        int count = 1;
        dfs(check, begin,words,count);
        answer=min;
        return answer;
    }
    
    private String ts = "";

    private int min = 0;
    
    private boolean finds = false;
    
    public void dfs(int[] check, String nowString, String[] words, int count){
        
        for(int i = 0 ; i<check.length ; i++){
            
            if(check[i]!=1){
                int ch = 0;
                for(int j = 0; j<nowString.length(); j++){
                    
                    if(nowString.charAt(j)==words[i].charAt(j)){
                        
                        ch++;
                        
                    }
                    
                }
                
                if(ch<nowString.length()-1){
                    
                    continue;
                    
                }
                
                
                check[i]=1;
                if(ts.equals(words[i])){
                    
                    
                    if(min>count || finds==false){
                        
                        min = count;
                        finds=true;
                        
                    } 

                }
                
                dfs(check,words[i],words,count+1);
                check[i]=0;
            }
            
        }
        
        
        
        
    }
    
}