import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // Set<Integer> set = new HashSet<>();
        
//         for(int i = 0 ; i<tangerine.length ; i++){
            
//             set.add(tangerine[i]);
            
//         }
        Arrays.sort(tangerine);
        List<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(1);
        int nowcount = 0;
        for(int i = 1 ; i<tangerine.length ; i++){
            
            if(tangerine[i]==tangerine[i-1]){
                
                nowcount = list.get(count)+1;
                list.remove(count);
                list.add(nowcount);
                
            } else {
                nowcount=1;
                count++;
                list.add(nowcount);
                
            }
            
        }
        Collections.sort(list);
        
//         for(Integer x : set){
            
//             for(int j = 0 ; j<tangerine.length ; j++){
                
//                 if(x==tangerine[j]){
                    
                    
//                     arr[count]++;
                    
//                 }
                
//             }
//             count++;
//         }
        
        
        count = 0;
        for(int i = list.size()-1 ; i>=0 ; i--){
            
            
            k = k-list.get(i);
            count++;
            if(k<=0){
                
                return count;
                
            }
            
        }
        
        return answer;
    }
}