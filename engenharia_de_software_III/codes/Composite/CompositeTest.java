package engenharia_de_software_III.codes.Composite;

public class CompositeTest {
    
    public static void main(String[] args) {
        Div div = new Div();
        div.add(new ButtonElement());
        div.add(new InputElement());

        Div anotherDiv = new Div();
        anotherDiv.add(new InputElement());
        anotherDiv.add(new ButtonElement());
        div.add(anotherDiv);

        div.execute();
    }
}
