package Lv1.숫자문자열과영단어;

import java.util.*;
class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> H1 = new HashMap<>();
        HashMap<String, Integer> H2 = new HashMap<>();
        H1.put("zero", 0); H2.put("zero", 4);
        H1.put("one", 1); H2.put("one", 3);
        H1.put("two", 2); H2.put("two", 3);
        H1.put("three", 3); H2.put("three", 5);
        H1.put("four", 4); H2.put("four", 4);
        H1.put("five", 5); H2.put("five", 4);
        H1.put("six", 6); H2.put("six", 3);
        H1.put("seven", 7); H2.put("seven", 5);
        H1.put("eight", 8); H2.put("eight", 5);
        H1.put("nine", 9); H2.put("nine", 4);


        for(int i = 0; i< s.length();) {
            if(Character.isDigit(s.charAt(i))) {
                answer.append(s.charAt(i));
                i++;
                continue;
            }
            String tmp = s.substring(i,i+3);
            if(H1.containsKey(tmp)) {
                answer.append(H1.get(tmp).toString());
                i+=H2.get(tmp);
                continue;
            }
            String tmp2 = s.substring(i,i+4);
            if(H1.containsKey(tmp2)) {
                answer.append(H1.get(tmp2).toString());
                i+=H2.get(tmp2);
                continue;
            }
            String tmp3 = s.substring(i,i+5);
            if(H1.containsKey(tmp3)) {
                answer.append(H1.get(tmp3).toString());
                i+=H2.get(tmp3);
                continue;
            }
        }
        return Integer.parseInt(answer.toString());
    }
}