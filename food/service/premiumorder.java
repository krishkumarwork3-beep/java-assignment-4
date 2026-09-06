package food.service;
import food.model.foodorder;
public class premiumorder extends foodorder implements discountable {
    public premiumorder(int orderid, String customername, double amount) {
        super(orderid, customername, amount);
    }
    public double calculatedeliverycharge() {
        return 50.0;
    }
    public double applydiscount() {
        return getamount() * 0.15;
    }
}