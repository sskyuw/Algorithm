class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
       
      
        
        //반복을 햇을때 같은 equals로 인해 같은 값이면 answer 증가 ++ 
        //s1에 들어있는 원소와 s2에 들어있는 원소가 같은값이면 
        
        for(int i=0; i<s1.length;i++)
        {
            for(int y=0;y<s2.length;y++)
            {
                if(s1[i].equals(s2[y]))
                {
                    answer++;
                }
            }
        }
        
            
    return  answer;
    }
}