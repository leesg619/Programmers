package Lv2.프린터;

import java.util.*;
class Doc {
    public int n;
    public int p;
    public Doc(int n, int p) {
        this.n = n;
        this.p = p;
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        int len = priorities.length;
        Queue<Doc> Q = new LinkedList<>();
        for(int i=0;i<len;i++) Q.offer(new Doc(i, priorities[i]));
        Arrays.sort(priorities);
        len-=1; //맨끝인덱스부터 시작하기위해 1빼줌

        while(!Q.isEmpty()) {
            Doc tmp = Q.poll();
            if(tmp.p == priorities[len]) { //현재뽑은게 최댓값이면
                if(tmp.n == location) return answer;
                else answer++;
                len--;
            } else Q.offer(tmp); //다시넣기
        }
        return answer;
    }
}