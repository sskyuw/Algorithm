class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count = -1;
        
        //10인분 -> 음료수 하나 서비스 
        // 양꼬치 1인분은 12000 음료수는 2000원
        // 120000 -> (2000) 
        // n이 10개일때마다 1씩 증가?
        
        if((0<n&&n<1000)||(n/10<=k&&k<1000))
           {
               for(int i=0;i<=n;i++)
               {
                   if(i%10==0)
                   {
                       count++;   
                       
                   }
                   
               }
            
           }
        
        answer = (n*12000+k*2000)-(count*2000);
        
        return answer;
    }
}