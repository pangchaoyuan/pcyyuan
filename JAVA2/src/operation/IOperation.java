package operation;

import Commodity.Commodity;
import Commodity.CommodityList;

import java.util.Scanner;

public interface IOperation {
    Scanner scan = new Scanner(System.in);
    void work(CommodityList commodityist);
}
