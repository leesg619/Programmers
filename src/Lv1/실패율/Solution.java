package Lv1.실패율;

import java.util.*;
class Play implements Comparable<Play> {
    int idx;
    double ra;
    public Play(int idx, double ra) {
        this.idx = idx;
        this.ra = ra;
    }
    @Override
    public int compareTo(Play p){
        if(p.ra == this.ra) return this.idx -p.idx;
        return (int)(p.ra - this.ra);
    }
}
    class Solution {
        public int[] solution(int N, int[] stages) {
            double[] tmp = new double[N+1];
            HashMap<Integer,Integer> h = new HashMap<>();
            for(int stage: stages) {
                h.put(stage, h.getOrDefault(stage, 0)+1);
            }
            Play[] arr = new Play[N];
            for(int i=1; i<=N; i++){
                int len = stages.length;

                for(int j = 1; j<i; j++) {
                    if(h.containsKey(j)) {
                        len-=h.get(j);
                    }
                }

                if(h.containsKey(i)) {
                    //System.out.println(h.get(i)+"  "+len);
                    double rate = h.get(i)/(double)len;
                    //System.out.println(rate);
                    tmp[i] = rate;
                    arr[i-1] = new Play(i, rate);
                } else {
                    tmp[i] = 0.0;
                    arr[i-1] = new Play(i, 0);
                }

            }
            Arrays.sort(arr);
            int[] answer = new int[N];

            for(int i = 0; i<N;i++){
                answer[i] = arr[i].idx;
            }
            return answer;
        }
    }