class Solution {
    
    private int end = 0;
    
    public int[] solution(int n) {
        
        factorial(n);
        
        int[] answer = new int[end];
        
        int m = n; // 도달한 경우 우측으로 숫자를 넣어줘야 하는 위치
        
        int y = 1; // 현재 층
        
        int x = 1; // 현재 층에서 내 위치
        
        int idx = 0; // 인덱스
        
        int count = 0; // 지금 넣을 숫자
        
        int move = 0;
        
        int l = y+1; // 역순으로 돌았을때 도착 시 다시 내려갈 시작점.
        
        boolean res = false;
        
        boolean check = false;
        
        int limit = 0;
        
        while(count<end){ // end 값보다 작거나 같을때까지만.
            
            count++;
            
            if(move==0){
                
                answer[idx]=count;
                
                
                move++;
                
            } else {
                
                if(res==false && check == false){
                    
                    
                    y++;
                    idx+=move;
                    move++;
                    answer[idx]=count;
                    if(y==m){
                        
                        res = true;
                        
                    }
                    
                    
                } else if(res==true){
                    
                    idx+=1;
                    
                    x++;
                    answer[idx]=count;
                    if(x==(m-limit)){
                        
                        res = false;
                        check = true;
                        m-=1;
                        limit+=1;
                    }

                } else if(res==false && check == true){

                    y--;
                    x--;
                    idx-=move;
                    move--;
                    answer[idx]=count;
                    if(y==l){

                        l+=2;
                        check = false;
                        
                    }
                    
                }
                
                
                
            }
            // System.out.println("x = " + x + " / y = " + y);
            // System.out.println("idx = " + idx + " / count = " + count + " / y = " + y + " / x = " + x + " / res = " + res);
        }
        
        return answer;
    }
    
    public void factorial(int n){
        
        if(n==1){
            
            end+=1;
            return;
            
        } else {
            
            end+=n;
            factorial(n-1);
            
        }
        
    }
}