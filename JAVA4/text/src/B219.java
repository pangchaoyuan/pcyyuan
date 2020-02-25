import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class B219 {
    public static String method(String J , String S){
        Map<Character,Integer> mapj = new HashMap<>();
        Map<Character,Integer> maps = new HashMap<>();

        for(char a : J.toCharArray()){
            System.out.print(a);
            mapj.put(a,mapj.getOrDefault(a,0)+1);
            System.out.println(mapj);
        }

        for(char a : S.toCharArray()){
            maps.put(a,maps.getOrDefault(a,0)+1);
        }
        StringBuilder res = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : mapj.entrySet()){   //遍历两个
            if( entry.getValue()!=maps.get(entry.getKey())){
                res.append(entry.getKey());
            }
        }
        return res.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        String J = "";
        String S = "";
        String res = method(J,S);
        System.out.println(res);

        PriorityQueue<Map.Entry<String,Integer>> map = new PriorityQueue<>();
    }
}
