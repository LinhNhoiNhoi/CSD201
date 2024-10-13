/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Node {
    //data member

    Student infor;//sau nay : float double....
    Node next;

    //contructor
    public Node() {
    }

    public Node(Student x, Node p) {
        this.infor = x;
        this.next = p;
    }

    Node(Student x) {
        this(x, null);

    }
    
 

}
