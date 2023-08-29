import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int sum = 0;
        int count = 0;
        
        
        Arrays.sort(people);
        
        for(int i = 0,j=people.length-1 ; i<j ; j--){
            sum = people[i]+people[j];
            if(sum<=limit){
                
                answer++;
                people[i]=0;
                i++;
                
                people[j]=0;
                
            }
            
        }
        
        for(int i = 0 ; i<people.length ; i++){
            
            if(people[i]!=0){
                answer++;
            }
            
        }
        
        
//         for(int i = 0; i<people.length ; i++){
//             if(people[i]==0){
//                 continue;
//             }
//             for(int j = people.length - 1; j>i; j--){
//                 if(people[j]==0){
                    
//                     continue;
                    
//                 }
//                 sum = people[i]+people[j];
//                 if(sum<=limit){
//                     count = 1;
//                     answer++;
//                     people[j]=0;
//                     break;
//                 }
                
//             }
//             if(count == 1){
                
//             } else {
//                 answer++;
//             }
//             count = 0;
//         }
        
        return answer;
    }
}