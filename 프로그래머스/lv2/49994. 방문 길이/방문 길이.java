import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int right = 0;
        int up = 0;
        String[] s1 = dirs.split("");
        LinkedList<int[]> list = new LinkedList<>();
        int[] ax = new int[2];
        for(int k = 0 ; k<s1.length ; k++){
            
            if(k==0){
                
                ax = new int[]{0,0};
                list.add(ax);
                
            }
            
            
            if(s1[k].equals("U")){
                up++;
            } else if(s1[k].equals("D")) {
                up--;
            } else if(s1[k].equals("L")) {
                right--;
            } else if(s1[k].equals("R")) {
                right++;
            }
            
            
            if(right>5){
                right--;
            } else if(right<-5){
                right++;
            } else if(up>5) {
                up--;
            } else if(up<-5) {
                up++;
            } else {
                ax = new int[]{right,up};
                System.out.println(k + " " + right + " " + up);
                list.add(ax);
                answer++;
                if(list.size()>1){
                    
                    
                    int[] check1 = {list.get(list.size()-2)[0],list.get(list.size()-2)[1],list.get(list.size()-1)[0],list.get(list.size()-1)[1]};
                    
                    for(int j = 1; j<list.size()-1 ; j++){
                        int a = list.get(j)[0];
                        int b = list.get(j)[1];
                        int c = list.get(j-1)[0];
                        int d = list.get(j-1)[1];
                        int[] checks = {a,b,c,d};
                        int[] checks2 = {c,d,a,b};
                        if(Arrays.equals(check1,checks) || Arrays.equals(check1,checks2)){
                            answer--;
                            break;
                        }
                        
                    }
                    
                }
                
            }
            
            
            
            
        }
        
        return answer;
    }
}