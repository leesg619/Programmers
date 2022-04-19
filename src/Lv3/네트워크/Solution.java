package Lv3.네트워크;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n]; //false 초기화됨
        for (int i = 0; i<n; i++) { //한번의 반복때 dfs로 완전히 다 탐색 visited 활용 필수
            if(!visited[i]) {
                dfs(i, computers, visited);
                answer++; //이쪽에서는, 한번의 탐색이 끝나면 무조건 답 1개 카운트
            }
        }
        return answer;
    }
    public void dfs(int i, int[][] computers, boolean[] visited) {
        if(visited[i]) {
            return;
        }
        visited[i] = true; // 여기서 노드 방문처리 한다는 것이 중요
        for(int j = 0; j<visited.length; j++) { //단방향일수 있으므로 무조건 j는 0부터
            if(computers[i][j] == 1) {
                dfs(j, computers, visited);
            }
        }
    }
}