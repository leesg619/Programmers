package Lv1.나머지가1이되는수찾기;

class Solution {
    public int solution(int n) {
        if(n%2 == 1) return 2; // 홀수면 무조건 x=2
        for(int i = 3; i<= n/2; i++) { //절반까지만 체크
            if( n%i == 1) return i;
        }
        return n-1; //절반넘으면 무조건 n-1
    }
}
