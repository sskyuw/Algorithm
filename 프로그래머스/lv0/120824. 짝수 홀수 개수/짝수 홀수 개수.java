class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        
        //정수가 담긴 배열 
        // 그 배열에서 이제 짝수 홀수를 구분해서 answer를  ++해줘야됨 
        
        
        
            for(int i=0; i<num_list.length; i++)
            {
                if(num_list[i]%2==0)
                {
                    answer[0] += 1;
                }
                
                else  
                {
                    answer[1] +=1;   
                }
                
                
            }
         
           
            
        
        
        return answer;
    }
}