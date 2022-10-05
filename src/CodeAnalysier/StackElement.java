package CodeAnalysier;

public class StackElement {
    private String name;
    private Container container;
    private StackElement next;

    public StackElement(String name, Container container){
        this.name = name;
        this.container = container;
    }

    public void setNext(StackElement next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public Container getContainer() {
        return container;
    }

    public StackElement getNext() {
        return next;
    }
}
