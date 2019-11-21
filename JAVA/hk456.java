//本次编译： javac -encoding utf8 homework456.java
import java.util.Scanner;
//求1-1/2+1/3-1/4+1/5-1/6.......-1/100的值   作业6
public class homework456{
public static void main(String[] args){
	double c=1;
	double sum1=0;
	double sum2=0;
	for(int i =1;i<=99;i+=2){
		c=i/100;
		sum1+=c;
	}
	
	for(int i = 2;i<=100;i+=2){
		c=i/100;
		sum2+=c;
	}
	System.out.println("和为 "+ (sum1+sum2));
}
}



/* //求两个数字的最大公约数 作业5
public class homework456{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = a>b?a:b;
	int d = a<b?a:b;
	a=c;
	b=d;
	while(a%b!=0){
	c = a-b;
	b=b<c?b:c;
	a=b>c?b:c;
	}
	System.out.println("最大公约数是" + b);
	
}
}





 /*     //乘法口诀表 作业4
 public class homework456{
	 public static void main(String[] args){
         for(int i=1;i<=9;i++){
			 for(int j=1;j<=i;j++){
				 System.out.print(i + "*"+j+"=" +  (i*j)+" "  );
			 }
			 System.out.println(" ");
		 }
			 
			
		 
	 }
 }
 */