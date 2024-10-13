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
        MyList mylist = new MyList();
        System.out.println("List is empty " + mylist.isEmpty());

        mylist.addLast(5);
        mylist.travel();
        System.out.println("addLast");
        mylist.addLast(3);
        mylist.addLast(7);
        mylist.addLast(1);
        mylist.travel();

        int[] a = {4, 9, 8, 2, 6};
        mylist.addManyLast(a);
        mylist.travel();

        System.out.println("AddFirst");

        mylist.AddFirst(2);
        mylist.travel();

        System.out.println("removeFirst");
        mylist.removeFirst();
        mylist.travel();

        System.out.println("removeLast");
        mylist.removeLast();
        mylist.travel();
        
        
        
         System.out.println("Get first: ");
         Node n = mylist.getFirst();
         System.out.println(n.infor);
         
         System.out.println("Get last: ");
         Node p = mylist.getLast();
         System.out.println(p.infor);
         
         //cont in here
         
         
         
         
          System.out.println("Get size: ");
          System.out.println(mylist.size());
          
          
          System.out.println("Get Node: ");
          System.out.println(mylist.getNode(2).infor);
          
          
           System.out.println("Insert After: ");
           
         
         
         
    }

}
