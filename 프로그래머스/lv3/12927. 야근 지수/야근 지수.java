import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        // 우선순위 큐 선언 ( 역순 정렬 행태로 선언 )
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 최초 원소들의 합계값을 확인해서 답이 0이면 불필요한 연산 없이 메서드 종료하기 위한 변수
        int sum = 0;
        // 우선순위 큐에 업무들을 넣음.
        for(Integer x : works){
            
            pq.add(x);
            sum += x;
        }
        
        // 합계와 잔여 시간 비교
        if(sum < n){
            
            return 0;
            
        }
        
        int overtime = 0;
        
        // 우선순위 큐에서 원소 하나씩 빼서 잔여시간 중 한시간을 사용해 업무 처리 후 다시 큐에 넣음.
        while(n>0){
            
            overtime = pq.poll();
            overtime-=1;
            n-=1;
            pq.add(overtime);
            
        }
        
        while(pq.size()>0){
            overtime = pq.poll();
            answer += overtime*overtime;
            
        }

        
        return answer;
    }
}