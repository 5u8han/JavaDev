// The BST class that represents binary search trees
// Xiwei Wang
import java.util.*;
public class BST
{
    private BSTNode m_root;
    private int m_size;
    public BST()
    {
        m_root = null;
        m_size = 0;
    }

    // This method returns the number of elements in the tree.
    // Do not make any changes to this method!
    public int size()
    {
        return m_size;
    }

    // This method clears the content of the tree.
    // Do not make any changes to this method!
    public void clear()
    {
        m_root = null;
        m_size = 0;
    }

    // This non-recursive method takes a string and inserts it into the binary
    // search tree, keeping the tree ordered.
    public void add(String value) {
        BSTNode newNode = new BSTNode(value);
        m_size++;

        if (m_root == null) { m_root = newNode; } //Base Case

        BSTNode tempNode = m_root;
        BSTNode headerNode = null;

        while (tempNode != null) {
            String tempNodeValue = tempNode.getInfo();
            //Now that we have gotten info on a node, time to see if it already exists, if so, ignore
            if (value.equals(tempNodeValue)) { m_size--; }
            headerNode = tempNode;
            // now we need to check the left side of the tree,compare, and right side, compare
            if (value.compareTo(headerNode.getInfo()) < 0) { headerNode.setLeft(newNode); }
            else { headerNode.setRight(newNode); }
        }
    }

    // This non-recursive method returns a string that represents the in-order traversal
    // of the binary search tree.
   /* public String inOrder() {
        /*String orderTraversal = "";
        Stack nodes = new Stack<>();
        BSTNode current = m_root;
        while (!nodes.isEmpty() || current != null) {
            if (current != null){
                nodes.push(current);
            }
            else {
                orderTraversal = (String) nodes.pop();
                current = current.setRight();
            }
        }
        if (m_root != null) {
            Stack<BSTNode> myStack = new Stack<BSTNode>();
            myStack.push(m_root);
        }
        while (true) {
            BSTNode current = myStack.peek();   // set current to the top of the stack

            if (current != null) {
                myStack.push(current.getLeft());
            } else {
                myStack.pop();
            }
            if (myStack.isEmpty()) {
                break;
            }
            current = myStack.pop(); // pop off a node and assign it to current
            orderTraversal += current.getInfo() + " ";
            myStack.push(current.getRight());
        }
        return "null"; // replace this statement with your own return
    }*/
    // This method returns the largest element in the binary search tree. You
    // are not allowed to create any additional structures, including but not
    // limited to arrays, stacks, queues, or other trees.
    public String max()
    {
        BSTNode current = m_root;
        String larger = "";
        while (current != null){
            larger = current.getInfo();
            current=current.getRight();
                                      /*  if (current.getRight() > larger) {
                                            larger = current.getRight();
                                        }*/
        }
        return larger; // replace this statement with your own return
    }

    // This method takes a reference to the root of the expression, evaluates
    // the tree, and returns the result as an int.
    public int evaluate(BSTNode node)
    {
        if (node == null) {return 0;}
        if (node.getLeft() == null && node.getRight() == null){
            return Integer.parseInt(node.getInfo()); }

        int leftValue = evaluate(node.getLeft());
        int rightValue = evaluate(node.getRight());
        if (node.getInfo().equals("+"))
            return leftValue + rightValue;
        else if (node.getInfo().equals("-"))
            return leftValue - rightValue;
        else if (node.getInfo().equals("*"))
            return leftValue * rightValue;
        else
            return leftValue / rightValue;
    }
}
