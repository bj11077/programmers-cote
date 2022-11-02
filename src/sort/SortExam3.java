package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortExam3 {

    /*


     */

    public static int solution(int[] citations) {
        int answer = 0;

        int n = citations.length;
        int h = -1;

        Integer[] result = Arrays.stream(citations).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);


        for (int res : result) {
            if(res < n){
                h = res;
                break;
            }
        }


        for (int res : result) {
            if(res < h){
                h = res;
            }
        }





        return answer;
    }



    public static void main(String[] args) {
// 6 5 3 1 0
        // 5

//        int[] numbers = {6,10,2};          // 6210
        int[] numbers = {3, 0, 6, 1, 5};  // 3

        solution(numbers);

    }
}
