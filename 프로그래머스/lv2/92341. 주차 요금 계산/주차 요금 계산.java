import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> maps = new HashMap<>();
        
        for (int i = 0; i < records.length ; i++){
            String[] s1 = records[i].split(" ");
            
            
            int car = Integer.parseInt(s1[1]);
            map.put(car,new ArrayList<>());
            maps.put(car,0);
        }
        int[] answer = new int[map.size()];
        for (int i = 0 ; i<records.length ; i++){
            
            String[] s1 = records[i].split(" ");
            String[] s2 = s1[0].split(":");
            
            int car = Integer.parseInt(s1[1]);
            int cartime = Integer.parseInt(s2[0])*60 + Integer.parseInt(s2[1]);
            List<Integer> list = map.get(car);
            list.add(cartime);
            map.put(car,list);
            if(s1[2].equals("OUT")){
                int cometime = map.get(car).get(list.size()-2);
                int parktime = cartime-cometime;
                maps.put(car,maps.get(car)+parktime);
                map.put(car,new ArrayList<>());
            }
            
            
        }
        Set<Integer> set = map.keySet();
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        for (Integer x : treeSet){
            
            int car = x;
            
            if(map.get(car).size()!=0){
                int parktime = (23*60+59)-map.get(car).get(0);
                System.out.println(parktime);
                maps.put(car,maps.get(car)+parktime);
                
            }
            
        }
        
        
        int count = 0;
        for (Integer x : treeSet){
            int mainpid = maps.get(x)-fees[0] > 0 ? maps.get(x)-fees[0] : 0;
            int mainalp = mainpid%fees[2]==0 ? mainpid/fees[2] : mainpid/fees[2]+1;
            answer[count] = fees[1]+((mainalp)*fees[3]);
            count++;
        }
        
        
        return answer;
    }
}