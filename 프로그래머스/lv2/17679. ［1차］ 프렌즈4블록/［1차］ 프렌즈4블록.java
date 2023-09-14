import java.util.*;

class Solution {
    
    private int answer = 0;
    
    private char[][] chars;
    
    private int[][] visit;
    
    public int solution(int m, int n, String[] board) {
        
        
        chars = new char[m][n];
        visit = new int[m][n];
        
        for(int i = 0 ; i<board.length; i++){
            
            for(int j = 0 ; j<board[i].length(); j++){

                chars[i][j]=board[i].charAt(j);
            
            }
            
        }
        boolean check = true;
        while(check){
        check = false;
        
            for(int i = 0 ; i<m-1; i++){
                
                for(int j = 0 ;j<n-1; j++){
                    
                    if(punch(i,j,chars,chars[i][j])==true && chars[i][j]!='-'){
                        System.out.println(i + " / " + j);
                        check = true;
                        // System.out.println(answer);
                    }
                    // System.out.print(chars[i][j]);
                }
                // System.out.println();
            }
            
            bomb(chars);
            refresh(chars);
            
            
            
        }
        
        for(int i = 0 ; i<visit.length; i++){
            
            for(int j = 0 ; j<visit[i].length; j++){
                
                if(visit[i][j]==1){
                    
                    
                    answer++;
                }
                
            }
            
        }
        
            
        
            
        
        return answer;
    }
    
    public void bomb(char[][] chars){
        
        for(int i = 0 ; i<chars.length; i++){
            
            for(int j = 0; j<chars[i].length; j++){
                
                if(visit[i][j]==1){
                    
                    chars[i][j]='-';
                    
                }
                // System.out.print(chars[i][j]);
            }
            // System.out.println();
        }
        
    }
    
    
    public void refresh(char[][] chars){
        
        for(int j = 0 ; j<chars[0].length; j++){
            String a1 = "";
            for(int i = chars.length-1 ; i>=0 ; i--){
                
                if(chars[i][j]!='-'){
                
                    a1+=chars[i][j];
                    
                }
                
                
            }
            int count = 0;
            for(int i = chars.length-1 ; i>=0 ; i--){
                
                if(i<chars.length-a1.length()){
                    
                    chars[i][j]='-';
                    
                } else {
                    
                    chars[i][j]=a1.charAt(count);
                    visit[i][j]=0;
                    count++;
                    
                }
                
            }
            
            
        }
        
    }
    
    public boolean punch(int i, int j, char[][] chars, char point){
        
        
        if((chars[i][j+1]==point && chars[i+1][j+1]==point && chars[i+1][j]==point && chars[i][j]==point)){
            
            
            visit[i][j+1]=1;
            visit[i+1][j]=1;
            visit[i+1][j+1]=1;
            visit[i][j]=1;
            
            return true;
            
        }
        
        return false;
        
    }
    
}