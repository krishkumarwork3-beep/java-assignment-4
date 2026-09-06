package food.utility;
import food.model.foodorder;
import food.service.discountable;
public class orderutility {
    public static boolean validateamount(double amount) {
        return amount > 0;
    }
    public static boolean validatecustomername(String name) {
        return name != null && !name.trim().isEmpty();
    }
    public static void generateordersummary(foodorder order) {
        double deliverycharge = order.calculatedeliverycharge();
        double discount = 0.0;
        if (order instanceof discountable) {
            discount = ((discountable) order).applydiscount();
        }
        double finalamount = order.getamount() - discount + deliverycharge;
        System.out.println("Order ID: " + order.getorderid());
        System.out.println("Customer Name: " + order.getcustomername());
        System.out.println("Restaurant: " + foodorder.restaurantname);
        System.out.println("Bill Amount: Rs. " + order.getamount());
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Delivery Charge: Rs. " + deliverycharge);
        System.out.println("Final Payable: Rs. " + finalamount);
    }
}