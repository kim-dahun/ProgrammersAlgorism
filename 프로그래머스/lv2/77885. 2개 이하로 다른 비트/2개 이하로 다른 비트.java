import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        // 규칙은 짝수일 경우, 홀수의 경우 2가지 케이스로 나뉨
        // 짝수의 경우 현재 수보다 10진수 기준 1을 더한 숫자가 비트 차이 1개로 조건에 부합하는 가장 가까운 큰수
        // 홀수의 경우, 하위비트부터 탐색해서 처음 0을 만나는 자리에서 해당 0을 1로 0바로 하위 비트를 1로 바꿔야 한다.
        // 0이 없는 경우는 제일 상위 비트 하나를 삭제하고, 1,0 비트 하나씩 상위비트 자리에 넣어준다.
        
        for(int i = 0 ; i<numbers.length; i++){
            
            if(numbers[i]%2==0){
                
                answer[i]=numbers[i]+1;
                
            } else {
                
                String bin = Long.toBinaryString(numbers[i]);
                if(bin.contains("0")){
                    
                    for(int j = bin.length()-1; j>=0 ;j--){
                        
                        if(bin.charAt(j)=='0'){
                            
                            bin = bin.substring(0,j) + "10" + bin.substring(j+2,bin.length());
                            break;
                        }
                        
                    }
                    
                } else {
                    
                    bin = "10"+bin.substring(1,bin.length());
                    
                }
                
                answer[i]=Long.parseLong(bin,2);
                
            }
                
        }
        
        return answer;
    }
}