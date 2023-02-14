import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int array = numbers.length;
        
        Arrays.sort(numbers);
        
        answer = numbers[array-1]*numbers[array-2];
        return answer;
    }
}