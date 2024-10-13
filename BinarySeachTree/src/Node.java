/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Node {

    int infor;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int infor, Node left, Node right) {
        this.infor = infor;
        this.left = left;
        this.right = right;
    }

    public Node(int x) {
        this(x, null, null);
    }
    
    
}
