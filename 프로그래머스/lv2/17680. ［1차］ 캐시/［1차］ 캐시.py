def solution(cacheSize, cities):
    answer = 0
    
    lists = []
    check = ""
    if(cacheSize==0):
        
        return len(cities)*5
    
    for x in cities:
        
        x = x.upper()
        
        if x in lists:
            
            lists.remove(x)
            lists.append(x)
            answer+=1
            
        else :
            
            if len(lists)==cacheSize:
                
                
                lists.remove(lists[0])
                lists.append(x)
                answer+=5
            else:
                
                lists.append(x)
                answer+=5
    
    return answer