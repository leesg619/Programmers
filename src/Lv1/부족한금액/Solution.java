package Lv1.부족한금액;

public class Solution {
    public long solution(int price, int money, int count) {
        long tmp = (long)price * (long)count * (long)(count + 1) / 2 - money;
        return tmp > 0 ? (long)tmp : 0;
    }
}
