package food.service;
import food.model.foodorder;
public class regularorder extends foodorder implements discountable {
    public regularorder(int orderid, String customername, double amount) {
        super(orderid, customername, amount);
    }
    public double calculatedeliverycharge() {
        return 80.0;
    }
    public double applydiscount() {
        return getamount() * 0.10;
    }
}