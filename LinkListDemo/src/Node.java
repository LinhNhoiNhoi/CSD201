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

    int infor;//sau nay : float double....
    Node next;

    //contructor
    public Node() {
    }

    public Node(int x, Node p) {
        this.infor = x;
        this.next = p;
    }

    Node(int x) {
        this(x, null);

    }
    
 

}
