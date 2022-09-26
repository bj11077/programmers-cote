package stackque;

import java.util.*;

public class PrintDev {
    public static int solution(int[] priorities, int location) {

        int result = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int priority : priorities) {
            queue.add(priority);
        }

        while(!queue.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if(priorities[i] == queue.peek()){
                    if(i == location){
                        result++;
                        return result;
                    }
                    queue.poll();
                    result++;

                }
            }
        }



        return result;
    }

    public static void main(String[] args) {

        int[] progress = {2,1,3,2};
        int location = 2;
//[2, 1, 3, 2]	2	1
//        progresses	speeds	return
//[93, 30, 55]	[1, 30, 5]	[2, 1]
//[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
//
        System.out.println(solution(progress,location));





    }

}
