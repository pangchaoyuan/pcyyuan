import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A19SET {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(312);
        set.add(123);
        set.add(null);
        set.add(111);
        //迭代器 实现了iterable接口就可以使用迭代器
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        set.remove(111); //删除方法
        System.out.println(set.contains(111));//判断是否存在
        System.out.println(set);

    }

}
