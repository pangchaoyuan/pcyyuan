package Commodity;





public class Commodity {
    public String name;
    public double price;
    public boolean IsSell;
    public int quantity;
    public int UsedSize;

    public Commodity(String name, double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSell() {
        return IsSell;
    }

    public void setSell(boolean sell) {
        IsSell = sell;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "," + ( IsSell == true ? "已售空":"未售空" )+
                ", quantity=" + quantity +
                '}';
    }
}

