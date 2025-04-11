package heap;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {
    public static int solution(int[] scoville, int K){

        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>(Integer::compareTo);

        for (int i : scoville) {
            queue.add(i);
        }

        if(K<=queue.peek()){
            return answer;
        }

        while(queue.size() >= 2){
            int firstScoville = queue.poll();
            int secondScoville = queue.poll();;
            int value = Math.min(firstScoville, secondScoville) + (Math.max(firstScoville, secondScoville) * 2);
            answer++;
            queue.add(value);
            if(K <= queue.peek()){
                return answer;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] scovil = {1,2,3,9,10,12};
        int K = 7;

        System.out.println(solution(scovil,K));
    }
}
