package Lv1.소수만들기;

class Solution {
    static int answer = 0;
    int[] combi = new int[3];
    public int solution(int[] nums) {;
        dfs(0, 0, nums);
        return answer;
    }
    public void dfs(int L, int tmp, int[] nums) {
        if( L == 3) {
            int sum = 0;
            boolean flag = true;
            for(int n: combi) sum +=n;

            for(int k=2; k<=Math.sqrt(sum); k++) {
                if (sum % k == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;

        } else {
            for(int i=tmp; i<nums.length; i++) {
                combi[L] = nums[i];
                dfs(L+1, i+1, nums);
            }
        }
    }
}