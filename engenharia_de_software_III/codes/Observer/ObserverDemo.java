package engenharia_de_software_III.codes.Observer;

public class ObserverDemo {

public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber emailAlertListener = new EmailAlertListener();
        publisher.subscribe(emailAlertListener);

        Subscriber loggingListener = new LoggingListener();
        publisher.subscribe(loggingListener);

        publisher.doSomething();
    }
}
