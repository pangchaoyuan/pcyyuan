import com.sun.deploy.util.ArrayUtil;

import java.util.*;
class Student implements Comparable<Student>{          //用来排序自定义类型 Comparable 需要在其后的<>内加
                                                       // 上自定义类型，然后再重写compareTo方法
    public  String name;
    public  int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       return this.name.compareTo(o.name);
        // return this.age - o.age;
    }

}


public class a1207 {

    public static void main(String[] args) {
   Student[] a =new Student[3];
   a[0]=new Student("dsa",623,124.4);
   a[1]=new Student("wqr",5233,3.4);
   a[2]=new Student("gerg",73,1223.24);

   Arrays.sort(a);
        System.out.println(Arrays.toString(a));






        int[] a1 ={2,53,4,5,6};
        int[] a2 = new int[a1.length];
        System.arraycopy(a1,0,a2,0,a1.length);       //从a1的下标0开始复制10个数字，从a2的0下标开始存放
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1)+Arrays.toString(a2));


    }
}
