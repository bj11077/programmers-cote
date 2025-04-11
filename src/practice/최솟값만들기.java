package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최솟값만들기 {
    public int solution(int[]A,int[]B){
        int answer=0;

        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();

        for (int i : A) {
            list1.add(i);
        }

        for (int i : B) {
            list2.add(i);
        }

        Collections.sort(list1);
        list2.sort(Collections.reverseOrder());

        for (int i = 0; i < list1.size(); i++) {
            answer += (list1.get(i) * list2.get(i));
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] A = {1,4,2};
        int[] B = {5,4,4};

        최솟값만들기 sol = new 최솟값만들기();
        System.out.println(sol.solution(A,B));



    }
}
