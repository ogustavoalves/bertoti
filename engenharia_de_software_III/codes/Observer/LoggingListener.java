package engenharia_de_software_III.codes.Observer;

public class LoggingListener implements Subscriber {
    
    @Override
    public void update(String filename) {
        System.out.println("LoggingListener: New file: " + filename);
    }
}
