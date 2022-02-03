package Lv1.체육복;
import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] st = new int[n+2];
        Arrays.fill(st, 1);

        for(int num: lost) { st[num]--; }
        for(int num: reserve) { st[num]++; }

        for(int i=1; i<=n; i++) {
            if(st[i]==2) {
                if(st[i-1]==0) {
                    st[i]--;
                    st[i-1]++;
                    continue;
                }
                if(st[i+1]==0) {
                    st[i]--;
                    st[i+1]++;
                }
            }
        }

        for(int i = 1; i<=n; i++) {if(st[i] >= 1) answer++;}
        return answer;
    }
}