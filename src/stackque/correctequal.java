package stackque;

public class correctequal {

    public static boolean solution(String s){
        boolean result = false;

        int cnt = 0;

        char[] chars = s.toCharArray();


        for(int i=0; i<chars.length; i++){
            if(chars[i] == '('){
                cnt++;
            }else{
                if(cnt == 0){
                    return result;
                }
                cnt--;
            }
        }

        if(cnt == 0){
            result = true;
        }




        return result;
    }

    public static void main(String[] args) {
        /*
        "()()"	true
        "(())()"	true
        ")()("	false
        "(()("	false
         */

        String s = ")()(";
        String s2 = "(())()";

        System.out.println(solution(s2));


    }
}


