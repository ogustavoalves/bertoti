package engenharia_de_software_III.codes.Facade;

public class PaymentProcessor {
    private final OrderService orderService;
    private final PaymentService paymentService;
    
    public PaymentProcessor(OrderService orderService, PaymentService paymentService) {
        this.orderService = orderService;
        this.paymentService = paymentService;
    }
    
    public boolean processPayment(int orderId, double amount, String paymentMethod){
        Order order = orderService.getOrder(orderId);
        if (order == null) {
            return false;
        }
        if (order.getAmountDue() != amount) {
            return false;
        }
        return paymentService.makePayment(amount, paymentMethod);
    }
}