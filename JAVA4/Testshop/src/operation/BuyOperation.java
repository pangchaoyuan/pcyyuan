package operation;

import Commodity.CommodityList;

public class BuyOperation implements IOperation {
    @Override
    public void work(CommodityList commodityist) {
        System.out.println("请输入你要查找的商品的名字");
        String name =scan.nextLine();
        int i =0;
        for(i =0;i<commodityist.getUsedSized();i++){
            if(commodityist.getComoditys(i).getName().equals(name)){
                break;
            }
        }
        if(i==commodityist.getUsedSized()){
            System.out.println("没有此商品");
        }

        commodityist.getComoditys(i).setQuantity(commodityist.getComoditys(i).getQuantity()-1);
        if(commodityist.getComoditys(i).getQuantity()==0){
            commodityist.getComoditys(i).IsSell=true;
            System.out.println("该商品已经售空");
        }
        System.out.println("已购买");




    }
}
