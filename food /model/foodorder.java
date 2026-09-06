package food.model;
public abstract class foodorder {
    private int orderid;
    private String customername;
    private double amount;

    public static String restaurantname = "Tasty Bites";
    private static int ordercounter = 0;

    public foodorder(int orderid, String customername, double amount) {
        this.orderid = orderid;
        this.customername = customername;
        this.amount = amount;
        ordercounter++;
    }

    public int getorderid() {
        return orderid;
    }

    public void setorderid(int orderid) {
        this.orderid = orderid;
    }

    public String getcustomername() {
        return customername;
    }

    public void setcustomername(String customername) {
        this.customername = customername;
    }

    public double getamount() {
        return amount;
    }

    public void setamount(double amount) {
        this.amount = amount;
    }

    public static int gettotalorders() {
        return ordercounter;
    }

    public abstract double calculatedeliverycharge();
}
