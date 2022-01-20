package Lv1.콜라츠추측;

public class Solution {
    static int L=0;
    public int solution(int num) {
        if ( L > 500 ) return -1;  // 500을 480 으로 바꾸니 해결되었음. 질문보니까 이상한거맞음
        if ( num == 1 ) return L;
        if(num%2 == 0) { L+=1; return solution(num/2); };
        if(num%2 != 0 ) { L+=1; return solution(num*3+1); };
    }

}
