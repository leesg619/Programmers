package Lv1.폰켓몬;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = nums.length/2;
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) hs.add(num);
        return Math.min(cnt, hs.size());
    }
}