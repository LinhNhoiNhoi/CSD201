/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Stack { // sử dụng lại LinkedList
    
    
    Node top; 
    //Node head;
    //Node tail;

    public Stack() {
        top = null; //head = null; tail = null;
    }
    
    void clear() {
        top = null; //head = null;
    }
    
    boolean isEmpty() {
        return (top == null); //return (head == null);
    }
    
    // addFirst
    void push(Student x) {
        Node p = new Node(x); // (1) p.next = null;
        p.next = top; // (2)
        top = p;
    }
    
    // removeFirst
    Student pop() {
        if(isEmpty()) return null;
        
        Node x = top;
        top=top.next;
        x.next = null;
        return(x.info);

    }
    
    Student top() {
        if(isEmpty()) return null;
        return top.info;
    }
}
