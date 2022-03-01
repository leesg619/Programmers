package Lv3.가장먼노드;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    // check배열, graph 인접리스트, distance 배열, Queue
    static int[] distance;
    static int[] ch;
    public static void bfs(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n;i++) graph.add(new ArrayList<>());
        for(int i=0; i<edge.length;i++){
            int a=edge[i][0];
            int b=edge[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        Queue<Integer> Q = new LinkedList<>();
        Q.offer(1);
        ch[1]=1;
        while(!Q.isEmpty()){
            int nv = Q.poll();

            for(int v: graph.get(nv)) {
                if(ch[v]==0) { //아직 미방문시 일단 직전 +1 로 set
                    distance[v] = distance[nv]+1;
                    Q.offer(v);
                } else { //방문했을 시 둘중 작은것으로 최적화
                    distance[v] = Math.min(distance[v], distance[nv]+1);
                }
                ch[v] = 1;
            }
        }
    }
    public int solution(int n, int[][] edge) {
        ch = new int[n+1];
        distance = new int[n+1];
        bfs(n, edge);
        
        //이하 답 셋팅하는 단순과정
        int answer=0, tmpMax = 0;
        for(int dist: distance) {
            if(tmpMax < dist) {
                tmpMax=dist;
                answer=1;
            } else if(tmpMax == dist) {
                answer++;
            }
        }
        return answer;
    }
}