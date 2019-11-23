//本次编译： javac -encoding utf8 hk10123.java


import java.util.Scanner;
import java.util.Random;


/* //生成 0到100的随机数 字  进行 猜数字的游戏 作业13
public class hk10{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();//用Random产生随机数
	int randNum = rand.nextInt(100);//接收随机数randNum在[0,100)内
while(true){
	System.out.println("请输入数字");
	int a =scan.nextInt();
	if(a > randNum){
		System.out.println("大了");
	}
	else if(a < randNum){
		System.out.println("小了");
	}
	else{
		System.out.println("对哦");
		break;
	}
}
}

}




  
/* //输出一个整数的各位数字   作业12
public class hk10{
	public static void method(int a){
		if(a!=0){
		int b=a%10;
		a=a/10;
		System.out.println(b);
		method(a);		
		}
		}
	
public static void main(String[] args){
	  System.out.println("请输入一个数字");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        method(a);		
}

}

/*  //将一个整数的二进制形式的奇数位和偶数位 分别输出    作业11
 public class hk10{
	 
	 public static void method(int a){
		 int[] c = new int[32];
		 int i =0;
		 for(i=0;i<=31;i++){
				
				 if(a%2==1){
					 c[i]=1;
				 }
				 else
					 c[i]=0;	
				 a= a>>>i;			  
		 }
		 
		  System.out.print("偶数位的二进制数字排列 ");
		 for(i=31;i>-1;i-=2){
				 System.out.print(c[i]);
			 }
			 System.out.println(" ");
			  System.out.print("奇数数位的二进制数字排列 ");
			 for(i=30;i>-1;i-=2){
				 System.out.print(c[i]);
			 }
		 }
	 
	 
	 
	 public static void main(String[] args){
		 System.out.print("请输入一个整数");
		 Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 method(a);
	 }
 }






/*   //输出一个整数的二进制形式有几个1 作业10
public class hk10{
	public static int method(int a){
    int c = 0 ;
	while(a!=0){
	a=a&(a-1);
	c++;
	}
	return c;
} 

public static void main(String[] args){
		System.out.print("请输入一个整数");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = method(a);
		System.out.println(b);
		
	}
}

*/