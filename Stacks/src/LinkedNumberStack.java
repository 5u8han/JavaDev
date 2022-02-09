// The linked list based implementation for the NumberStack ADT
// Subhan Noeman 623424

public class LinkedNumberStack implements NumberStack {
    // instance variable
    private LNode m_top;
    public boolean isEmpty() {
        if (m_top == null) return true;
        else return false;
    }

    // check whether the stack is full
    public boolean isFull() {
        return false;
    }

    // return the element at the top of the stack
    public int top() {
        if (isEmpty()) throw new RuntimeException("top attempted on an empty stack");
        else return - 1;
    }

    // push a value onto the stack
    public void push(int v) {
        // TODO: implement this method
        if (isFull()) {
            throw new RuntimeException("top attempted on a Full stack");
        }
        LNode temp = new LNode(v);
        m_top.setLink(temp);
    }

    // remove and return the value at the top of the stack
    public int pop() {
        // TODO: implement this method
        if (isEmpty()) {
            throw new RuntimeException("Pop Attempted on an Empty Stack");
        }
        else {
            int value = m_top.getInfo();
        }
        return m_top.getInfo();
    }

    // return the number of elements on the stack
    public int size() {
        int size = 0;
        while (!isEmpty()) {
            size++;
        }
        return size;
    }

    // return a string representation of the stack
    @Override
    public String toString() {
        String stackContent = "";
        LNode current = m_top;

        while (current != null) {
            stackContent += current.getInfo() + " ";
            current = current.getLink();
        }

        return stackContent;
    }
}