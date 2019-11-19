// 本次的编译：javac -encoding utf8 a1117.java











  //随机生成1000以内的数 根据提示猜测数字
import java.util.Scanner;
import java.util.Random;

/*   //Java中如何定义一个函数  引用时直接 int c =add(a,b);
public static int add(int a,int b){
	方法体
}







/*  //用while循环输入
public class a1117{
public static void main(String[] args){
      Scanner scan= new Scanner(System.in);
      while(scan.hasNextInt()){
		 int num = scan.nextInt();
		 System.out.println(num);
	  }	  
}
}

/* //Scanner初学
public class a1117{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入姓名");
	String name = scan.nextLine();
	System.out.println("请输入年龄");
	int age= scan.nextInt();
	System.out.println("请输入长度");
	double high = scan.nextDouble();
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("    姓名           " + name);
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("    年龄           " + age);
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("                 ");
	System.out.println("    长度           " + high );
	
	scan.close();//关闭引用
}
}


/*   //用for循环求5之内阶乘之和
public class a1117{
public static void main(String[] args){
	int num = 5;
	int ret = 1;
	int sum = 0;
	for(num = 5;num>=1;num--){
		ret =1 ;
	for(int i =1;i<=num;i++){
		ret*=i;
	}
	sum  += ret;
	}
	System.out.println("最终的和为 " + sum );
}
	
}

/*   //100以内奇数和偶数的和
public class a1117{
public static void main(String[] args){
	int sum1 = 0;
	int sum2 = 0;
	for(int i=1;i<100;++i){
		if(i%2==0){
		sum1+=i;}
		else{
		sum2+=i;
		}
	}
	System.out.println("偶数和=" + sum1 +"     " +"奇数和=" + sum2);
}
}

/*100到200以内所有的三
public class a1117{
	public static void main(String[] args){
		for(int i=100;i<200;++i){
			if(i % 3 != 0){
				continue;
		}
		System.out.println("i = " + i);
	}
	}
}*/// 本次的编译：javac -encoding utf8 a1117.java