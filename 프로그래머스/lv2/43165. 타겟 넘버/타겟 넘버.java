class Solution {
    private int target = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        this.target = target;
        // 필요한 것...?
        // 현재 입력될 숫자와 이전까지의 숫자 합
        // +1 과 -1 각각 2가지 루트로 움직이도록 출발해야함.
        int[] check = new int[numbers.length];
        
        findTarget(0,numbers,check, 0);
        answer = this.count;
        
        return answer;
        
    }
    
    private int count = 0;
    
    public void findTarget(int nowvalue, int[] numbers, int check[], int start){
                
                if(start==numbers.length){
                    
                    if(nowvalue==this.target){
                        
                        count++;
                        
                    }
                    return;
                }
        
                if(check[start]==0){
                    check[start]=1;
                
                    findTarget(nowvalue+numbers[start], numbers, check, start+1);
                    findTarget(nowvalue-numbers[start], numbers, check, start+1);
                
                
                    check[start]=0;
                }
        
                
                
            
        
        
        
        
        
        
    }
}