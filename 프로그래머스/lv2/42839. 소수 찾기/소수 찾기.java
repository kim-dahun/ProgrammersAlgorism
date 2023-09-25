import java.util.*;

class Solution {
    
    private int answer = 0;
    
    private HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        String[] s1 = numbers.split("");
        int[] check = new int[s1.length];
        dfs(check,s1,"");
        
        for(Integer x : set){
            boolean stop = false;
            if(x<=1){
                continue;
            } else {
                
                for(int i = 2; i<=Math.sqrt(x); i++){
                    
                    if(x%i==0){
                        stop = true;
                        break;
                    }
                    
                }
                
            }
            
            if(stop==false){
                answer++;
            }
            
        }
        
        return answer;
    }
    
    
    
    
    
    public void dfs(int[] check, String[] s1, String s){
        
        
        
        for(int i = 0; i<s1.length; i++){
            
            if(check[i]==0){
                
                check[i]=1;
                s+=s1[i];
                dfs(check,s1,s);
                int b = Integer.parseInt(s);
                set.add(b);
                s = s.substring(0,s.length()-1);
                
                check[i]=0;
            }
            
        }
        
    }
}