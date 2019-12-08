import java.util.Arrays;
//排序自定义类型需要实现Comparable接口
class Student implements Comparable<Student>{
    public String name;
    public  int age;
    public double score;


    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;  //     this - o 是从小到大排序  o - this 是从大到小排序
        //return  (int)(this.score - o.score); //注意  非int 类型的数字需要强转
        return this.name.compareTo(o.name);          //字符串比大小要用compareTo
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class a1201 {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0]=new Student("哈啊",152,23);
        students[1]=new Student("哈",112,242);
        students[2]=new Student("啊",123,251);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        }
}
