import java.util.*;

class Person{

}






public class a1209 {

    public static void main(String[] args) {
         //int >>> Integer 自动装包
        Integer a = 10;
        System.out.println(a);
    }









    public static void main5(String[] args) {
        Person a1 = new Person();
        System.out.println(a1);


        b1209ArrayList<String> a2 =new b1209ArrayList<>();
        System.out.println(a2);
        b1209ArrayList<Integer> a3 = new b1209ArrayList<>();
    }




    public static void main4(String[] args) {
        b1209ArrayList<String> a1 = new b1209ArrayList<>();   //检查加入的数据是否为指定类型,且这个指定不能为简单类型，要是对象的包装类    (称为泛型类型的参数)
        a1.add("dsad");
        a1.add("3123");
        a1.add("312few");
        System.out.println(a1.get());
    }




    public static void main3(String[] args) {
        b1209ArrayList a1 = new b1209ArrayList();
        a1.add("dasdaw");
        a1.add(312.312);
        a1.add("xADAd");
        System.out.println(a1.get());

    }




    public static void main2(String[] args) {
        Map<String,String> map =new HashMap<>();

        map.put("a","a1"); //key,value          key 不能重复，若重复了会使最新的value覆盖之前的
        map.put("b","b2");
        map.put("c","c3");
        String a= map.getOrDefault("c3","未找到");  //找key,找到返回对应value，找不到返回defaultValue
        System.out.println(map);
        System.out.println(a);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("c"));
        for(Map.Entry<String,String>entry : map.entrySet()){   //将所有的键值对返回，返回形式是一个集合
            System.out.println(entry.getKey()+ entry.getValue());
        }
    }





    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("java");
        collection.add("hello");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection);
        collection.remove("java");
        System.out.println(collection);
        collection.add("2019");
        collection.add("1208");
        for(String a : collection){
            System.out.print(a+"  ");
        }
    }
}
