package stackque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dislikesameword {
    public static int[] solution(int[] nums) {

        int[] answer ={};
        List<Integer> result = new ArrayList<>();
        result.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]){
                result.add(nums[i]);
            }
        }
        return result.stream().mapToInt(e->e).toArray();
    }

    public static void main(String[] args) {

        int[] nums = {1,1,3,3,0,1,1	};

        solution(nums);




    }

}
