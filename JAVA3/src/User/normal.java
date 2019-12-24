package User;

import operation.BuyOperation;
import operation.DisplayOperation;
import operation.ExitOperation;
import operation.IOperation;

import java.util.Scanner;

public class normal extends User {
    public normal(String name){
        this.name = name;
        this.operation=new IOperation[]{
                new ExitOperation(),
                new DisplayOperation(),
                new BuyOperation()
        };
    }

    @Override
    public int Menu() {
        System.out.println("===============================");
        System.out.println("您好"+this.name+"   您要做什么？");
        System.out.println("0  退出系统 ");
        System.out.println("1  查看所有商品 ");
        System.out.println("2  购买商品 ");
        System.out.println("===============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
