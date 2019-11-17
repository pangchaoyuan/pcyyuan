
/*        //求5！+4！+3！+2!+1!
public class a1116{
public static void main(String[] args) {
	int num =5;
	int sum=0;
	while(num>=0){
		int ret=1;
		int i=1;
	while(i<=num){
		ret*=i;
		i++;
	}
	num--;
	sum += ret;
	}
	System.out.println("sum = " + sum);
   }
}




/*public class a1116{
	public static void main(String[] args) {
		int a= 10 ;
		int b =20;
		System.out.println(a>b||10/0==1);//逻辑或 有短路特性
		System.out.println(a<b&&10/0==1);
		System.out.println(a<b&10/0==1);//“按位与“ 做 “逻辑与” 用，但是没有短路特性
		System.out.println(a<b|10/0==1);
		
		
	}
}





/*
public class a1116{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<=b);
	}
}

/*
public class b1116{
	public static void main(String[] args) {
	byte a=10;
	byte b=20;
	int c=(byte)a+b;
	System.out.println(c);
	}
}*///javac -encoding utf8 a1116.java