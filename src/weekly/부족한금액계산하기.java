package weekly;

public class 부족한금액계산하기 {
    public static long solution(int price,int money, int count){

        long answer = 0;

        long totalPrice = price;

        long currentPrice = price;

        for (int i = 1; i < count; i++) {
            currentPrice += price;
            totalPrice += currentPrice;
        }

        long tmp =  totalPrice-money;
        if(tmp <=0){
            answer = 0;
        }else{
            answer = tmp;
        }


        return answer;
    }
}
