package Lv1.예산;
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int n: d) {
            if(budget<=0) break;
            if(budget>=n) {
                budget-=n;
                answer++;
            }
        }
        return answer;
    }
}