package hash;

import java.util.HashMap;

public class pokemon {
    public static int solution(int[] nums) {

        int answer = 0;
        int halfSize = nums.length / 2;

        HashMap<Integer,Integer> map = new HashMap<>();

//        System.out.println("half : "+ halfSize);

        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

//        System.out.println("map size : "+map.keySet().size());

//        for (Integer integer : map.keySet()) {
//            System.out.println("key :" + integer + "  value : "+map.get(integer));
//        }


        if(halfSize > map.keySet().size()){
            answer =  map.keySet().size();
        }else{
            answer = halfSize;
        }





        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] numa3 = {3,3,3,2,2,2};

        solution(nums);




    }

}
