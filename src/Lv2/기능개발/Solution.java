package Lv2.기능개발;
import java.util.*;
class Solution {
    public int[] solution(int[] prg, int[] spd) {
        int n = prg.length;
        int[] days = new int[n];
        for(int i=0; i<n; i++) {
            int todo = 100-prg[i];
            if(todo%spd[i] == 0) days[i] = todo/spd[i];
            else days[i] = todo/spd[i]+1;
        }
        Queue<Integer> Q = new LinkedList<>();
        for(int day: days) Q.offer(day);

        int tmpMax = Q.poll();
        int cnt = 1;

        List<Integer> arr = new ArrayList<>();
        while(!Q.isEmpty()) {
            int tmp = Q.poll();

            if(tmp <= tmpMax) {
                cnt++;
            } else {
                arr.add(cnt);
                cnt=1;
                tmpMax = tmp;
            }
        }
        arr.add(cnt);
        int[] answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++) answer[i] = arr.get(i);
        return answer;
    }
}