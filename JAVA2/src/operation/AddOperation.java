package operation;

import Commodity.Commodity;
import Commodity.CommodityList;

public class AddOperation implements IOperation {
    @Override
    public void work(CommodityList commodityist) {
        System.out.println("输入商品名字");
        String name = scan.nextLine();
        System.out.println("输入价格");
        double price = scan.nextDouble();
        System.out.println("输入入库数量");
        int quantity = scan.nextInt();
        Commodity commodity =new Commodity(name,price,quantity);
        commodityist.setComoditys(commodity,commodityist.getUsedSized());
        commodityist.setUsedSized(commodityist.getUsedSized()+1);
        System.out.println("已添加");


    }
}
