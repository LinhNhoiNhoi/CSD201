
import java.util.LinkedList;

public class MyQueue<Node> {

    private LinkedList<Node> queue;

    // Clear the queue
    public void clear() {
        queue.clear();
    }

    // Check to see if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Put the element at the end of the queue
    public void enqueue(Node x) {
        queue.addLast(x);
    }

    // Take the first element from the queue
    public Node dequeue() {
        if (!isEmpty()) {
            return queue.removeFirst();
        }
        return null; // or throw exception if needed
    }

    // Return the first element in the queue without removing it
    public Node front() {
        if (!isEmpty()) {
            Node p = this.queue.getFirst();
        }
        return null;
    }

}
