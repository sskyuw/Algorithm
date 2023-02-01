class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        //피자는 7조각
        //피자가 몇판 필요한지 
        //n이 피자먹을 사람 
        
        
        if((1<=n&&n<=100))
        {
            
            for(int i=0;i<n;i++)
            {
              //n만큼 반복 
              //그리고 7조각마다 1판업 
            if(i%7 ==0)
            {
                answer++;
            }
                
            }
                
        }
        return answer;
    }
}