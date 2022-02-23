package Lv1.비밀지도;
import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];

        for(int i=0;i<n;i++) {
            int tmp = arr1[i];
            String s = "";
            int cnt = 0;
            while(true) {
                if(tmp<2) {
                    s+=tmp+"";
                    cnt++;
                    break;
                }
                int a =tmp%2;
                s+= a+"";
                tmp/=2;
                cnt++;
            }
            while(cnt<n) {
                s+="0";
                cnt++;
            }
            String newS = new StringBuffer(s).reverse().toString();
            strArr1[i] = newS;
        }
        for(int i=0;i<n;i++) {
            int tmp = arr2[i];
            String s = "";
            int cnt = 0;
            while(true) {
                if(tmp<2) {
                    s+=tmp+"";
                    cnt++;
                    break;
                }
                int a =tmp%2;
                s+= a+"";
                tmp/=2;
                cnt++;
            }
            while(cnt<n) {
                s+="0";
                cnt++;
            }
            String newS = new StringBuffer(s).reverse().toString();
            strArr2[i] = newS;
        }
        for(int i=0; i<n; i++) {
            String ans = "";
            for(int j = 0; j<n; j++) {
                if(strArr1[i].charAt(j) == '0' && strArr2[i].charAt(j) == '0') ans+=" ";
                else ans+="#";
            }
            answer[i] = ans;
        }
        return answer;
    }
}