package food.main;

import food.model.foodorder;
import food.service.regularorder;
import food.service.premiumorder;
import food.utility.orderutility;

public class main {
    public static void main(String[] args) {

        foodorder[] orders = new foodorder[6];

        orders[0] = new regularorder(101, "Amit Sharma", 500.0);
        orders[1] = new premiumorder(102, "Priya Singh", 800.0);
        orders[2] = new regularorder(103, "Rahul Verma", 350.0);
        orders[3] = new premiumorder(104, "Sneha Patel", 1200.0);
        orders[4] = new regularorder(105, "Vikram Rao", 450.0);
        orders[5] = new premiumorder(106, "Anjali Mehta", 950.0);

        for (foodorder order : orders) {
            if (orderutility.validateamount(order.getamount())
                    && orderutility.validatecustomername(order.getcustomername())) {
                orderutility.generateordersummary(order);
            } else {
                System.out.println("Invalid order data for Order ID: " + order.getorderid());
            }
        }

        System.out.println("Total Orders Placed: " + foodorder.gettotalorders());
    }
}