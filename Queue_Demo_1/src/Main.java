
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
                
        
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.front()); // Output: 1
        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.front()); // Output: 2
        queue.clear();
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
}
