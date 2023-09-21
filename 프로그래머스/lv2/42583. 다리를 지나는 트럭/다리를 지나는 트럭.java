import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        
        // Arrays.sort(truck_weights);
        List<Integer> list = new LinkedList<>();
        int[] bridge = new int[bridge_length];
        int len = bridge.length;
        int sum = 0;
        int count = 0;
        int idx = 0;
        
        while(true){
            count++;
            if(bridge[len-1]!=0){
                
                sum-=bridge[len-1];
                list.add(bridge[len-1]);
                bridge[len-1]=0;
                
            }
            
            if(list.size()==truck_weights.length){
                break;
            }
            
            for(int i = bridge.length-1; i>=1; i--){
                
                bridge[i]=bridge[i-1];
                // System.out.println("truck = " + bridge[i] + " / count = " + count);
            }
            
            if(idx<truck_weights.length && sum+truck_weights[idx]<=weight){
                
                bridge[0]=truck_weights[idx];
                sum+=bridge[0];
                idx++;
                
            } else {
                
                bridge[0]=0;
                
                
            }
            
        }        
        
        return count;
    }
}