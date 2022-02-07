package Lv1.삼진법뒤집기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp = "";
        while(n>=3) {
            tmp = tmp+(n%3);
            n = (int)n/3;

        }
        tmp = tmp+n;

        for(int i = 0; i<tmp.length(); i++) {
            int num = (int)Math.pow(3,tmp.length()-1-i)*(tmp.charAt(i)-48);
            answer+=num;
        }
        return answer;
    }
}