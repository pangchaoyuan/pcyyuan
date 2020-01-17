import java.util.*;




class Student1 implements  Comparable<Student1>{
    public String name;
    public double socre;
    public String class2;

    public Student1(String name, double socre, String class2) {
        this.name = name;
        this.socre = socre;
        this.class2 = class2;
    }

    @Override
    public int compareTo(Student1 o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", socre=" + socre +
                ", class2='" + class2 + '\'' +
                '}';



    }
}

class Person1 implements Comparable<Person1>{ //排序自定义类型
    public String name;
    public int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person1 o) {
        return this.age - o.age;
        }


    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}






public class a1210 {


    public static void main(String[] args) {
        List<Student1> a1 = new ArrayList<>();
        a1.add(new Student1("wqe",123.321,"JAVA20"));
        a1.add(new Student1("awfa",123.67,"JAVA20"));
        a1.add(new Student1("wtttqe",3.321,"JAVA20"));
        a1.add(new Student1("awrtuurtfa",83.67,"JAVA20"));
        System.out.println(a1);
        System.out.println("===================");
        for(Student1 b:a1){
            System.out.println(b);
        }
    }



    public static void main2(String[] args) {
        List<Person1>  a1= new ArrayList<>();
        a1.add(new Person1("rwar",1321));
        a1.add(new Person1("wae",31));
        a1.add(new Person1("das",91));
        Collections.sort(a1);
        System.out.println(a1);

    }


    public static void main1(String[] args) {

        List <Integer> list = new ArrayList<>(10);
        list.add(93);
        list.add(82);
        list.add(27);
        list.add(2463);
        list.add(41);
        list.add(6536);
        System.out.println(list);
        Collections.sort(list); //对集合排序
        System.out.println(list);
    }
}
