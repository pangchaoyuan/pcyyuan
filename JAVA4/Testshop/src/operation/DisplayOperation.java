package operation;

import Commodity.CommodityList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(CommodityList commodityist) {
        for (int i =0;i<commodityist.getUsedSized();i++){
            System.out.println(commodityist.getComoditys(i));
        }
    }
}
