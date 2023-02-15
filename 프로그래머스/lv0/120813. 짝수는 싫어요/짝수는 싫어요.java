import java.util.ArrayList;

class Solution {
    public  ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        
        for(int i=0; i<=n; i++)
        {
        
            //홀수 일때 
            //배열의 크기도 그때 생성 
            
         
            if(i%2 != 0)
            {   
              
               
                answer.add(i);     
              
            }
            
          
            
        }
        return   answer;
    }
}