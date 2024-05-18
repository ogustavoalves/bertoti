package engenharia_de_software_III.codes.Observer;

public class EmailAlertListener implements Subscriber {

    @Override
    public void update(String filename) {
        System.out.println("EmailAlertListener: New file: " + filename);
    }
}
