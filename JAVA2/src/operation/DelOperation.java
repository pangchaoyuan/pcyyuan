package operation;

import Commodity.CommodityList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class DelOperation implements IOperation {
    @Override
    public void work(CommodityList commodityist) {
        System.out.println("请输入你要删除的商品的名字");
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
        for(int j =i;j<commodityist.getUsedSized();j++) {
            commodityist.setComoditys(commodityist.getComoditys(j+1),j);
        }
        commodityist.setUsedSized(commodityist.getUsedSized()-1);
        System.out.println("已删除");

    }
}
