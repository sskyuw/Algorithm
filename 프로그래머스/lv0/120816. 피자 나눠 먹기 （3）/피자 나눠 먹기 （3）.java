class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
     
        
        //2~10조각 원하는 조각수로 커팅 
        // 나머지가 0이 아닐때 answer가 증가 
        
        if(n%slice != 0)
        {
            answer++;
        }
        
        for(int i=1; i<=n;i++)
        {
           //n = 사람의수 10 -> slice -7 
            if((i%slice ==0)) // n -> slice
            {
               
                answer++;
                }
                
                
                
            }
                
             
        
        //2~10조각 
       
        return answer;
    }
}