package Lv2.더맵게;
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for(int scv: scoville) pQ.offer(scv);

        while (true) {
            int first = pQ.poll();
            if(first >= K ) return answer;

            if(pQ.isEmpty()) break;

            int second = pQ.poll();
            pQ.offer(first+(second*2));
            answer++;
        }

        return -1;
    }
}