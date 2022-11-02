package fullscan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Carpet {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;

        // (x-2)(y-2)==yellow

        for (int i = 1; i <= sum; i++) {
            if(sum%i == 0  && i >= sum/i){
                if((i-2)*(sum/i -2) == yellow){
                    answer[0] = i;
                    answer[1] = sum/i;
                    break;
                }
            }
        }

        return answer;
    }




    public static void main(String[] args) {

        Carpet carpet = new Carpet();

        int[] brown = {10,8,24};
        int[] yellow = {2,1,24};

//        int brown = 8;
//        int yellow = 1;
//        int brown = 24;
//        int yellow = 24;
        /*
        10	2	[4, 3]
        8	1	[3, 3]
        24	24	[8, 6]
         */

        int idx = 0;

        for (int i : carpet.solution(brown[idx], yellow[idx])) {
            System.out.println(i);
        }



    }
}
