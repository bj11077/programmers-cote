package fullscan;

import java.util.*;
import java.util.stream.Collectors;

public class mockExam {

    public static int[] solution(int[] answers){

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] th = {3,3,1,1,2,2,4,4,5,5};
        int oneIdx = 0;
        int twoIdx = 0;
        int thIdx = 0;

        int[] maxx = {0,0,0};



        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == one[oneIdx]){
                maxx[0] += 1;
            }
            if(oneIdx == one.length-1){
                oneIdx = 0;
            }else{
                oneIdx++;
            }

            if(answers[i] == two[twoIdx]){
                maxx[1] += 1;
            }
            if(twoIdx == two.length-1){
                twoIdx = 0;
            }else{
                twoIdx++;
            }

            if(answers[i] == th[thIdx]){
                maxx[2] += 1;
            }
            if(thIdx == th.length-1){
                thIdx = 0;
            }else{
                thIdx++;
            }
        }

            int maxVal = -1;
            int maxIdx = -1;

            List<Integer> list = new ArrayList<>();

        for (int i = 0; i < maxx.length; i++) {
            if(maxx[i] > maxVal){
                maxVal = maxx[i];
                maxIdx = i;
            }
        }



        for (int i = maxIdx; i < maxx.length; i++) {
            if(maxx[i] == maxVal){
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(e->e).toArray();
    }

    public static void main(String[] args) {
//[[60, 50], [30, 70], [60, 30], [80, 40]]
//        int[] request = {1,2,3,4,5};
        int[] request = {1,1,2,1};
//        System.out.println(solution(request));


        for (int i : solution(request)) {
            System.out.println(i);
        }


    }
}

