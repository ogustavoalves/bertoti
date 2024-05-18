package engenharia_de_software_III.codes.Facade;

public class PaymentClient {

public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        PaymentFacade paymentFacade = new PaymentProcessor(orderService, paymentService);

        int orderId = 1;
        double amount = 100.0;
        String paymentMethod = "credit_card";

        boolean success = paymentFacade.processPayment(orderId, amount, paymentMethod);
        if (success) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed!");
        }
    }
}

