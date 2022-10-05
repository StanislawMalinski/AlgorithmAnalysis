package CodeAnalysier;

public class Stack {
    private StackElement head;

    public void put(String methodName, Container variableContainer) {
        StackElement element = new StackElement(methodName,variableContainer);
        element.setNext(head);
        head = element;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void pop() {
        head = head.getNext();
    }

    public String getTopName() {
        return head.getName();
    }

    public Container getTopContainer() {
        return head.getContainer();
    }
}
