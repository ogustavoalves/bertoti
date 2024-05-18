package engenharia_de_software_III.codes.Facade;

public class OrderService {
    // Simula a lógica de pegar os detalhes da ordem
        public Order getOrder(int orderId) {
        // ...
            return new Order(orderId, 100.0, "pending");
        }
    }
