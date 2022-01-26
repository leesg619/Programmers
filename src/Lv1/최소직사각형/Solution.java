package Lv1.최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        int allMax = 0, tmpMax = 0;
        for( int[] size: sizes ) {
            allMax = Math.max( allMax , Math.max(size[0], size[1]));
        }

        for( int[] size: sizes ) {
            tmpMax = Math.max( tmpMax , Math.min(size[0], size[1]));
        }

        return tmpMax * allMax;
    }
}