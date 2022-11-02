package fullscan;

import java.util.LinkedList;
import java.util.Queue;

public class minSquare {

    public static int solution(int[][] sizes){
        int result =0;

        int max = 0;
        int min = 0;

        for (int i = 0; i < sizes.length; i++) {
            int maxTmp = Math.max(sizes[i][0],sizes[i][1]);
            int minTmp = Math.min(sizes[i][0],sizes[i][1]);
            if(max < maxTmp){
                max = maxTmp;
            }
            if(min < minTmp){
                min = minTmp;
            }
        }

        result = max * min;


        return result;
    }

    public static void main(String[] args) {
//[[60, 50], [30, 70], [60, 30], [80, 40]]
        int[][] request = {{60,50},{30,70},{60,30},{80,40}};

        System.out.println(solution(request));


    }
}

