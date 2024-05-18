package engenharia_de_software_III.codes.Composite;

class Div implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        for (Component child : children) {
            child.execute();
        }
    }
}
