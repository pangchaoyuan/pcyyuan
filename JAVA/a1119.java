import java.util.Scanner;

//汉诺塔 由 键盘输入方块个数n 生成解决方案       javac -encoding utf8 a1119.java
 


public class a1119{
	public static void move(char sti1,char sti2){
		 System.out.println(sti1 + "→" + sti2);                   //将方块由柱移到另一柱
	}                                      
     
	 
	public static void hanno(int n,char sti1,char sti2,char sti3){
		if(n==1){
			System.out.println(sti1 + "→" + sti3); //表示从“第一根”移动到“第三根”
		}		                                          	
		else{
		hanno(n-1,sti1,sti3,sti2);          //n-1个方块由1移动到2（将sti1赋值给“第一根”）
		move(sti1,sti3);                    //一个最大的方块由1移动到3
		hanno(n-1,sti2,sti1,sti3);          //n-1个方块由2移到3（将sti2赋值给“第一根）
		}		
	} 
	
	public static void main(String[] args){
		System.out.println("请输入方块的个数");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		hanno(n,'a','b','c');
	}





	
}