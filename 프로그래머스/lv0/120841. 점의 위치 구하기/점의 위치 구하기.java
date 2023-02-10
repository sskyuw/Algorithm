class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int i=0;
        
            if(dot[i]>0 && dot[i+1]>0)
            {
                answer+=1;
            }
            
            else if(dot[i]<0 && dot[i+1]>0)
            {
                 answer+=2;
            }
            
            else if(dot[i]<0 && dot[i+1]<0)
            {
                 answer+=3;
            }
            
            else 
            {
                 answer+=4;
            }
        
        return answer;
    }
    
    }
