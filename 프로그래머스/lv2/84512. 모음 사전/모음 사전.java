import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        
        char[][] c1 = new char[][]{{'A','E','I','O','U'},{'A','E','I','O','U'},{'A','E','I','O','U'},{'A','E','I','O','U'},{'A','E','I','O','U'}};
        
        int[][] check = new int[5][5];
        
        perfectSearch(c1,check,0,"");
        int count = 0;
        for(String x : set){
            count++;
            
            if(x.equals(word)){
                
                return count;
                
            }
            
        }
        
        return 0;
    }
    
    Set<String> set = new TreeSet<>();
    
    
    public void perfectSearch(char[][] c1, int[][] check, int depth, String words){
        
        if(depth==5){
            
            return;
            
        }
        
        for(int i = 0 ; i<c1.length; i++){
            
            if(check[depth][i]==0){
                String res = words;
                words += c1[depth][i];
                
                check[depth][i]=1;
                set.add(words);
                perfectSearch(c1,check,depth+1,words);
                words = res;
                check[depth][i]=0;
            }
            
        }
        
    }
    
}