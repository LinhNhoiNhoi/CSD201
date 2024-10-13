/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Node {

    Student info; // truoc int info;
    Node next;

    Node() {
    }

    Node(Student x, Node p) {
        info = x;
        next = p;
    }

    Node(Student x) {
        this(x, null);
    }
}
