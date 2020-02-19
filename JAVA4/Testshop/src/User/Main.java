package User;


import Commodity.CommodityList;

import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("欢迎使用交易系统");
        System.out.println("请输入您的姓名");
        String name1 = scan.nextLine();
        System.out.println("请输入您的身份   1.管理员   2.顾客");
        int who = scan.nextInt();
        if(who==1){
            return new Admin(name1);
        }if(who==2){
            return new normal(name1);
        }else{
            System.out.println("无效的身份信息");
            return  null;
        }
    }


    public static void main(String[] args) {
        CommodityList commodityList = new CommodityList();
        User user = login();
        while(true) {
            int choice = user.Menu();
            user.doOperation(choice, commodityList);
        }

    }
}
