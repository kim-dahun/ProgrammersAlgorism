import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        int len = str1.length()>str2.length() ? str1.length() : str2.length();
        
        for(int i = 1 ;i<len ;i++){
            
            if(i<str1.length()){
                
                if(((int)str1.charAt(i)>=65 && (int)str1.charAt(i)<=90) || ((int)str1.charAt(i)>=97 && (int)str1.charAt(i) <=122)){
                    
                    if(((int)str1.charAt(i-1)>=65 && (int)str1.charAt(i-1)<=90) || ((int)str1.charAt(i-1)>=97 && (int)str1.charAt(i-1) <=122)){
                    
                    String a = "" + str1.charAt(i-1)+str1.charAt(i);
                    a = a.toLowerCase();
                    list1.add(a);
                    
                    // System.out.println("a = " + a);
                    
                }
                    
                }
                
                
            }
            
            if(i<str2.length()){
                
                if(((int)str2.charAt(i)>=65 && (int)str2.charAt(i)<=90) || ((int)str2.charAt(i)>=97 && (int)str2.charAt(i) <=122)){
                    
                    if(((int)str2.charAt(i-1)>=65 && (int)str2.charAt(i-1)<=90) || ((int)str2.charAt(i-1)>=97 && (int)str2.charAt(i-1) <=122)){
                    
                    String a = "" +str2.charAt(i-1)+ str2.charAt(i);
                    a = a.toLowerCase();
                    list2.add(a);
                    // System.out.println("b = " + a);
                    
                }
                    
                }
                
            }
            
        }
         int count = 0;
        if(list1.size() > list2.size()){
        int[] check = new int[list2.size()];
       
        for(int i = 0 ; i<list1.size(); i++){
            
            for(int j = 0; j<list2.size(); j++){
                
                if(check[j]==0 && list1.get(i).equals(list2.get(j))){
                    
                    count++;
                    check[j]=1;
                    break;
                }
                
            }
            
        }
        } else{
            
            int[] check = new int[list1.size()];
        
        for(int i = 0 ; i<list2.size(); i++){
            
            for(int j = 0; j<list1.size(); j++){
                
                if(check[j]==0 && list2.get(i).equals(list1.get(j))){
                    
                    count++;
                    check[j]=1;
                    break;
                }
                
            }
            
        }
            
        }
        int sum = list1.size()+list2.size()-count;
        System.out.println(sum);
        System.out.println(count);
        
        if(sum==0 && count==0){
            
            return 65536;
            
        }
        double ans = 65536 * (count/(double)sum);
        answer = (int) ans;
        
        
        return answer;
    }
}