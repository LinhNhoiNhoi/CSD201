/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyList {

    // data members
    Node head;
    Node tail;

    //Constructors
    public MyList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = null;
        tail = null;
    }

    void addLast(int x) {
        if (isEmpty()) {
            Node p = new Node(x);//(1) p.next = null
            head = p; //(2)
            tail = p;//(3)

        } else {
            Node p = new Node(x);//(1) p.next = null
            tail.next = p; //(2)
            tail = p;//(3)}
        }
    }

    void addManyLast(int[] a) {
        for (int i = 0; i < a.length; i++) {
            addLast(a[i]);

        }

    }

    public void AddFirst(int value) {
        Node p = new Node(value);
        if (isEmpty()) {

            head = p;
            tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Can not delete");
        } else if (head == tail) {
            clear();

        } else {
            Node p = head;
            head = head.next;
            p.next = null;

        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Can not delete. List is empty.");
        } else if (head == tail) {
            clear(); // Xóa toàn bộ danh sách nếu chỉ có một phần tử
        } else {
            // Duyệt đến phần tử kế cuối
            Node p = head;
            while (p.next != tail) {
                p = p.next;
            }
            // Xóa phần tử cuối cùng
            p.next = null;
            tail = p; // Cập nhật tail thành phần tử kế cuối
        }
    }

    void visit(Node p) {
        System.out.println(p.infor + " ");

    }

    void travel() {
        Node p = head;
        while (p != null) {
            visit(p);
            p = p.next;
        }
        System.out.println();
    }

    Node getFirst() {
        return head;
    }

    Node getLast() {
        return tail;
    }

    Node search(int x) {
        Node p = head;
        while (p != null) {
            if (p.infor == x) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    Node getNext(Node p) {
        if (p == null) {
            return null;
        } else {
            return p.next;
        }
    }

    Node getPrev(Node p) {
        Node q = head;
        while (q != null) {
            if (q.next == p) {
                return q;
            }
            q = q.next;
        }
        return null;
    }

    int size() {
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    Node getNode(int index) {
        if (index < 0 && index > size()) {
            System.out.println("Index cannot be find.");
            return null;
        }

        int count = 0;
        Node p = head;

        while (p != null) {
            if (count == index) {
                return p;
            }
            count++;
            p = p.next;
        }
        return null;
    }

    void insertAfter(Node p, int x) {
        if (p == null) {
            System.out.println("Node p is null.");
            return;
        }

        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next = newNode;
        if (p == tail) {
            tail = newNode;
        }
    }

    void insertBefore(Node p, int x) {
        if (p == null) {
            System.out.println("Node p is null.");
            return;
        }

        if (p == head) {
            AddFirst(x);
            return;
        }

        Node newNode = new Node(x);
        Node prev = getPrev(p);
        if (prev != null) {
            newNode.next = p;
            prev.next = newNode;
        } else {
            System.out.println("Node p not found in the list.");
        }
    }

    void insert(int index, int x) {
        if (index < 0 || index > size()) {
            System.out.println("Can not inseart.");
            return;
        }

        if (index == 0) {
            AddFirst(x);
            return;
        }

        if (index == size()) {
            addLast(x);
            return;
        }

        Node newNode = new Node(x);
        Node prev = getNode(index - 1);
        if (prev != null) {
            newNode.next = prev.next;
            prev.next = newNode;
        } else {
            System.out.println("Can not inseart.");
        }
    }

//remove
    void remove(Node p) {
        if (p == null) {
            return;
        }
        if (p == head) {
            removeFirst();
        } else if (p == tail) {
            removeLast();
        } else {
            Node prev = getPrev(p);
            prev.next = p.next;
        }

    }
    //removeIndex

    void removeIndex(int index) {
        Node p = getNode(index);
        if (p == null) {
            System.out.println("Invalid index");
        } else {
            remove(p);
        }
    }

    //removeAfter
    void removeAfter(Node p) {
        if (p == null || p == tail) {
            return;
        }
        Node next = p.next;
        p.next = next.next;
        if (next == tail) {
            tail = p;
        }

    }

    //removeBeforer
    void removeBefore(Node p) {
        if (p == null || p == head) {
            return;
        }
        Node current = head;
        while (current.next != p) {
            current = current.next;
        }
        current.next = p;
    }

    // set
    void set(Node p, int x) {
        if (p == null) {
            return;
        }
        p.infor = x;
    }

    // Get the Node having the largest value (info) in the list
    Node max() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return null;
        }

        Node maxNode = head;
        Node p = head;

        while (p != null) {
            if (p.infor > maxNode.infor) {
                maxNode = p;
            }
            p = p.next;
        }

        return maxNode;
    }

// xem lại code n sai vơi th phần tử giống nhau
    Node secondMax() {

        if (isEmpty() || head.next == null) {
            System.out.println("List has less than two elements.");
            return null;
        }

        Node maxNode = null;
        Node secondMaxNode = null;

        Node p = head;
        while (p != null) {
            if (maxNode == null || p.infor > maxNode.infor) {
                secondMaxNode = maxNode;
                maxNode = p;
            } else if (secondMaxNode == null || p.infor > secondMaxNode.infor) {
                if (p != maxNode) {
                    secondMaxNode = p;
                }
            }
            p = p.next;
        }

        return secondMaxNode;
    }

    // Swap two nodes' values
    void swap(Node p, Node q) {
        if (p == null || q == null) {
            System.out.println("Cannot swap: One or both nodes are null.");
            return;
        }
        int temp = p.infor;
        p.infor = q.infor;
        q.infor = temp;
    }

    // Bubble Sort for linked list
    void bubbleSort() {
        if (head == null || head.next == null) {
            System.out.println("List is empty or has only one node.");
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current != null && current.next != null) {
                if (current.infor > current.next.infor) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    
    
    
    void Sort(Node p, Node q) {
        if (p == null || q == null) {
            System.out.println("Cannot swap.");
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            while (p != null && q != null) {
                if (p.infor > q.infor) {
                    swap(p, q);
                    swapped = true;
                }
                p = q;
            }
        } while (swapped);

    }
    
    
    

    void reverse() {
       if (head == null) {
           System.out.println("List is empty.");
           return;
       }

       Node p = head; 
       Node q = null; 
       Node r = null; 

       while (p != null) {
           r = p.next; 
           p.next = q; 
           q = p;      
           p = r;    
       }

       head = q; 
       tail = head;
      
        }


}
