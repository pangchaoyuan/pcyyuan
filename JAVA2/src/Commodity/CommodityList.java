package Commodity;

public class CommodityList {
        private Commodity[] commoditys=  new Commodity[10];
        private int UsedSized;

        public CommodityList(){
            commoditys[0]= new Commodity("苹果",3.5,7);
            commoditys[1]=new Commodity("薯片",5,10);
            commoditys[2]=new Commodity("锅",80,7);
            this.UsedSized = 3;
        }

    public int getUsedSized() {
        return UsedSized;
    }

    public void setUsedSized(int usedSized) {
        UsedSized = usedSized;
    }

    public Commodity getComoditys(int a){
            return commoditys[a];
    }

    public void setComoditys(Commodity commodity,int a) {
        commoditys[a] = commodity;
    }
}
