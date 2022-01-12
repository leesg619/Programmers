package Lv1.소수찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] pa = new int[n+1];
        for(int i = 2; i*i <= n; i++ ) {
            if( pa[i] != 0) continue;
            int prime = i;
            for( int j = i*i; j <= n; j += i) {
                pa[j] = -1;
            }
            pa[prime] = 0;
        }
        for(int i=2; i<=n; i++) {
            if(pa[i]==0) answer += 1;
        }
        return answer;
    }
}