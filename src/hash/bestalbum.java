//package hash;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Music{
//    String genre;
//    int plays;
//    int idx;
//    public Music(String genre, int plays, int idx){
//        this.genre = genre;
//        this.plays = plays;
//        this.idx = idx;
//    }
//}
//
//
//public class bestalbum {
//    public static int[] solution(String[] genres, int[] plays) {
//        int[] answer = {};
//        HashMap<String,Integer> map = new HashMap<>();
//        List<Music> list = new ArrayList<>();
//
//        for (int i = 0; i < plays.length; i++) {
//            map.put(genres[i],map.getOrDefault(genres,0)+plays[i]);
//            list.add(new Music(genres[i],plays[i],i));
//        }
//
//        list.sort(Comparator.reverseOrder(genres));
//       list.sort(Comparator.comparing(e-> e.genre));
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//        String[] gens = {"classic", "pop", "classic", "classic", "pop"};
//        int[] plays = {500, 600, 150, 800, 2500};
//
//        solution(gens,plays);
//
//    }
//
//}
