package Lv1.다트게임;

class Solution {
    public int solution(String dart) {
        int answer = 0;
        int res[] = new int[3];
        int[] ch = new int[3];
        String tmp ="";
        int cnt = 0;
        for( int i = 0;i<dart.length(); i++) {
            switch(dart.charAt(i)) {
                case 'S':
                    res[cnt++] = (int)Math.pow(Integer.parseInt(tmp),1);
                    tmp="";
                    break;
                case 'D':
                    res[cnt++] = (int)Math.pow(Integer.parseInt(tmp),2);
                    tmp="";
                    break;
                case 'T':
                    res[cnt++] = (int)Math.pow(Integer.parseInt(tmp),3);
                    tmp="";
                    break;
                case '*':
                    if(cnt>1) res[cnt-2]=res[cnt-2]*2;
                    res[cnt-1] = res[cnt-1]*2;
                    break;
                case '#':
                    res[cnt-1] = res[cnt-1]*-1;
                    break;
                default:
                    tmp = tmp+=dart.charAt(i)+"";
                    break;
            }
        }

        for(int r: res) answer+=r;
        return answer;
    }
}