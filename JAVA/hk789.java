//本次编译  javac -encoding utf8 hk789.java

import java.util.Scanner;
 //三次机会输入密码  作业9
public class hk789{
public static void main(String[] args){
	int a=111111;
	int i=1;
	System.out.println("请输入六位密码");
	
	while(i<=3){
		Scanner scan = new Scanner(System.in);
	    int b =scan.nextInt();
		if(a!=b){
			if(i==3){
				break;
			}
			System.out.println(" 密码错了，还有"+ (3-i)   +"次机会");
			i++;
		}
			if(a==b){
				System.out.println("密码正确");
			}
		}System.out.println("无机会");
	}
	
}





/*
 //求1--999内的水仙花 数   作业8
public class hk789{
public static void main(String[] args){
	for(int i=1;i<=999;i++){
		int a =(i/100);
		int b =(i/10)%10;
		int c =i%10;
		if((a*a*a)+(b*b*b)+(c*c*c)==i)
			System.out.print(i + "   "  );
	}
	
}
}







/* //数出1--100里有几个9   作业7
public class hk789{
	public static void main(String[] args){
		int c=0;
		for(int i =1;i<=100;i++){
			
			if(i/9==11){
			c=c+2;
		break;
			}
		else if((i%10==9)||(i/9==10))
			c++;		
			}
			System.out.println(c);
		}
		
	}
*/