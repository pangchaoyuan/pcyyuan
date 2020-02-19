package User;

import Commodity.CommodityList;
import operation.IOperation;

public abstract class User {
    public String name;
    public IOperation[] operation;

    public void doOperation(int choice, CommodityList commodityList){
        operation[choice].work(commodityList);
    }


    public abstract int Menu();

}
