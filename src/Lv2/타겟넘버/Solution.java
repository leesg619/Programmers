package Lv2.타겟넘버;

class Solution {
    static int answer = 0;
    public static void dfs(int[] numbers, int target, int L, int sum) {

        if(L == numbers.length) {
            if(sum == target) answer++;
            return;
        }

        sum +=numbers[L];
        dfs(numbers, target, L+1, sum);
        sum -=numbers[L];
        sum +=(numbers[L]*-1);
        dfs(numbers, target, L+1, sum);


    }
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
}