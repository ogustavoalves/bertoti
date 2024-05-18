package engenharia_de_software_III.codes.Facade;

public interface PaymentFacade {
    boolean processPayment(int orderId, double amount, String paymentMethod);
}

