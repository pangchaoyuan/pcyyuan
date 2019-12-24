package operation;

import Commodity.CommodityList;

public class ExitOperation implements IOperation {
    @Override
    public void work(CommodityList commodityist) {
        System.out.println("已退出");
        System.exit(1);
    }
}
