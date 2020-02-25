import java.util.*;

//value 可以相同，但对应的key不一样
public class A19MAP {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"你是谁？");
        map.put(2,"你在哪？"); //当key重复时，后一个数据会覆盖前一个同key的数据
        map.put(3,"wdnmd");
        //String s = map.get(2);
        //s = map.getOrDefault(40,"4324");//返回40，若有返回value，若无返回4324
        //System.out.println(s);
       // System.out.println(map.get(40));
        //String a = map.remove(1);//删除，弹出
       // System.out.println(a);
        System.out.println(map);
        //StringBuilder res = new StringBuilder();


       // Set<Integer> set = map.keySet(); //得到所有key Set是 集合 只能存放key; Map是 key+value
       // System.out.println(set);

       // Collection<String> collection = map.values();//得到所有value
        //System.out.println(collection);


       // for(Map.Entry<Integer,String> entry : map.entrySet()){
       //     System.out.println(entry);
       //     System.out.println(entry.getKey() +"  "+ entry.getValue());//get方法
      //  }
      //   String J ="aaaaaaaaaaa";
     //   Map<Character,Integer> map1 = new HashMap<>();
       // for(char a : J.toCharArray()){
        //    map1.put(a,map1.getOrDefault(a,0)+1);
      //  }
      //  System.out.println(map1);
    }


}
