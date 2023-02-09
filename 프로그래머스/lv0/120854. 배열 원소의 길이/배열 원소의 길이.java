class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
  
        
       
    
        for(int i=0;i<strlist.length;i++)
        {
            
            //길이 만큼 돌고 그 해당 원소의 길이만큼 answer 증가
            // strlist[i].length()
            //length() 문자열길이 
         
            answer[i] = strlist[i].length();
            
        }
        return answer ;
    }
}