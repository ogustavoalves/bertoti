package engenharia_de_software_III.codes.Observer;

import java.util.List;
import java.util.concurrent.Flow.Subscriber;


public class Publisher implements Subject {
    private final List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String filename) {
        for (Subscriber subscriber : subscribers) {
        subscriber.update(filename);
        }
    }

    public void doSomething() {
        String filename = "data.txt";
        notifySubscribers(filename);
    }
}