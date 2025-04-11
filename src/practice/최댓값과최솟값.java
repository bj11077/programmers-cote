package practice;

import java.time.LocalTime;
import java.util.*;

public class 최댓값과최솟값 {
    public String solution(String s){
        String answer = "";

        String[] split = s.split(" ");

        List<Integer> list= new ArrayList<>();

        for (String string : split) {
            list.add(Integer.parseInt(string));
        }
        Collections.sort(list);
        answer += list.get(0) +" " + list.get(list.size()-1);
        return answer;
    }


    public static void main(String[] args) {
        String s = "1 2 3 4";

        최댓값과최솟값 sol = new 최댓값과최솟값();
        System.out.println(sol.solution(s));



    }
}
