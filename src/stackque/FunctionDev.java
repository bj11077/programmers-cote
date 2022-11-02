package stackque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDev {
    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> progressQue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            progressQue.add(i);
        }

        while(true){
            int cnt = 0;
            if(progressQue.isEmpty()){
               break;
            }
            for (int i = progressQue.peek(); i < progresses.length; i++) {

                if(progresses[i] >= 100 && i <=progressQue.peek()){
                    progressQue.remove();
                    cnt++;
                }
                progresses[i] += speeds[i];
            }
            if(cnt != 0){
                result.add(cnt);
            }
        }

        return result.stream().mapToInt(e->e).toArray();
    }

    public static void main(String[] args) {

        int[] progress = {93, 30, 55	};
        int[] speed = {1, 30, 5	};

//        progresses	speeds	return
//[93, 30, 55]	[1, 30, 5]	[2, 1]
//[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
//

        solution(progress,speed);




    }

}
