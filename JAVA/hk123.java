//本次编译：javac -encoding utf8 a1118.java
import java.util.Scanner;

/*  //求1000到2000 所有的闰年 作业3
public class a1118{
	public static void main(String[] args){
		for(int i=1000;i<2001;++i){
			if((i%4==0&&i%100!=0)||i%400==0)
				System.out.println(i);
		}
	}
}

/* //求100以内的所有素数 作业2
public class a1118{
	public static void main(String[] args){
		for(int i=0;i<100;++i){
			 int j=2;
			while(j<i/2-1){
				if(i%j!=0){
				    j++;
				    if(j==i/2-1){
					    System.out.println(i);
				            }
							
				}
				else{
				   break;
				   }
			}
							
		}
	}
}



/*  //判断年龄 作业1


public class a1118{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a>56)
			System.out.println("老年");
		else if(a>=29&&a<=55)
			System.out.println("中年");
		else if(a>=19&&a<=28)
			System.out.println("青年");
		else
			System.out.println("少年");
	}
}*/