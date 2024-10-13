
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class MyBSTree {

    Node root;

    public MyBSTree() {
        this.root = null;
    }

    public void clear() {
        this.root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public void insert(int x) {
        if (isEmpty()) {
            System.out.println("Insert root: " + x);
            Node newNode = new Node(x);
            root = newNode;
            return;
        }

        Node curr;
        Node parentOfCurr;
        curr = root;
        parentOfCurr = null;
        while (curr != null) {
            if (curr.infor == x) {
                System.out.println("The key " + x + "already exist ");
                return;
            }

            parentOfCurr = curr;
            if (x < curr.infor) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }

        }

        Node newNode = new Node(x);
        if (x < parentOfCurr.infor) {
            System.out.println("Insert " + parentOfCurr.infor + ".left: " + x);
            parentOfCurr.left = newNode;
        } else {
            System.out.println("Insert " + parentOfCurr.infor + ".right: " + x);
            parentOfCurr.right = newNode;
        }

    }

    void addManyLast(int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }

    void visit(Node p) {
        System.out.print(p.infor + " ");
    }

    public void insertMany(int[] a) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    void breadth() {
        if (root == null) {
            return;
        }
        MyQueue q = new MyQueue();
        q.enqueue(root);
        while (!q.isEmpty()) {
            Node p = (Node) q.dequeue();
            if (p.left != null) {
                q.enqueue(p.left);
            }
            if (p.right != null) {
                q.enqueue(p.right);
            }
            visit(p);
        }
    }

    public void deleteByMerging(int x) {
        // Kiểm tra nếu cây BST rỗng
        if (isEmpty()) {
            System.out.println("BSTree is empty, no deletion");
            return;
        }

        // Tìm node cần xóa
        Node deleteNode = root;
        Node parentOfDeleteNode = null;

        while (deleteNode != null) {
            if (deleteNode.infor == x) {
                break; // Tìm thấy x
            }

            // Tiếp tục tìm kiếm
            parentOfDeleteNode = deleteNode;
            if (x < deleteNode.infor) {
                deleteNode = deleteNode.left;
            } else {
                deleteNode = deleteNode.right;
            }
        }

        // Kiểm tra nếu không tìm thấy x
        if (deleteNode == null) {
            System.out.println("The key " + x + " does not exist, no deletion");
            return;
        }

        // Trường hợp 1: Node cần xóa là lá
        if (deleteNode.left == null && deleteNode.right == null) {
            // Kiểm tra nếu node cần xóa là root
            if (parentOfDeleteNode == null) {
                root = null;
            } else {
                if (parentOfDeleteNode.left == deleteNode) {
                    parentOfDeleteNode.left = null;
                } else {
                    parentOfDeleteNode.right = null;
                }
            }
            return;
        }

        // Trường hợp 2: Node cần xóa chỉ có con trái
        if (deleteNode.left != null && deleteNode.right == null) {
            if (parentOfDeleteNode == null) {
                root = deleteNode.left;
            } else {
                if (parentOfDeleteNode.left == deleteNode) {
                    parentOfDeleteNode.left = deleteNode.left;
                } else {
                    parentOfDeleteNode.right = deleteNode.left;
                }
            }
            return;
        }

        // Trường hợp 3: Node cần xóa chỉ có con phải
        if (deleteNode.left == null && deleteNode.right != null) {
            if (parentOfDeleteNode == null) {
                root = deleteNode.right;
            } else {
                if (parentOfDeleteNode.left == deleteNode) {
                    parentOfDeleteNode.left = deleteNode.right;
                } else {
                    parentOfDeleteNode.right = deleteNode.right;
                }
            }
            return;
        }

        // Trường hợp 4: Node cần xóa có cả con trái và con phải
        if (deleteNode.left != null && deleteNode.right != null) {
            Node leftSubTree = deleteNode.left;
            Node rightMost = leftSubTree;
            Node parentOfRightMost = deleteNode;

            // Tìm node lớn nhất trong cây con bên trái (rightMost)
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            // Thay thế deleteNode bằng rightMost
            if (parentOfRightMost != deleteNode) {
                parentOfRightMost.right = rightMost.left;
                rightMost.left = deleteNode.left;
            }
            rightMost.right = deleteNode.right;

            // Kiểm tra nếu node cần xóa là root
            if (parentOfDeleteNode == null) {
                root = rightMost;
            } else {
                if (parentOfDeleteNode.left == deleteNode) {
                    parentOfDeleteNode.left = rightMost;
                } else {
                    parentOfDeleteNode.right = rightMost;
                }
            }
        }
    }

    public void deleteByCopying(int x) {
        // Kiểm tra nếu cây BST rỗng
        if (isEmpty()) {
            System.out.println("BSTree is empty, no deletion");
            return;
        }

        // Tìm node cần xóa
        Node deleteNode = root;
        Node parentOfDeleteNode = null;

        while (deleteNode != null) {
            if (deleteNode.infor == x) {
                break; // Tìm thấy x
            }

            // Tiếp tục tìm kiếm
            parentOfDeleteNode = deleteNode;
            if (x < deleteNode.infor) {
                deleteNode = deleteNode.left;
            } else {
                deleteNode = deleteNode.right;
            }
        }

        // Kiểm tra nếu không tìm thấy x
        if (deleteNode == null) {
            System.out.println("The key " + x + " does not exist, no deletion");
            return;
        }

        // Trường hợp 1: Node cần xóa là lá
        if (deleteNode.left == null && deleteNode.right == null) {
            // Kiểm tra nếu node cần xóa là root
            if (parentOfDeleteNode == null) {
                root = null;
            } else {
                if (parentOfDeleteNode.left == deleteNode) {
                    parentOfDeleteNode.left = null;
                } else {
                    parentOfDeleteNode.right = null;
                }
            }
            return;
        }

        // Trường hợp 2: Node cần xóa chỉ có con trái
        if (deleteNode.left != null && deleteNode.right == null) {
            if (parentOfDeleteNode == null) {
                root = deleteNode.left;
            } else {
                if (parentOfDeleteNode.left == deleteNode) {
                    parentOfDeleteNode.left = deleteNode.left;
                } else {
                    parentOfDeleteNode.right = deleteNode.left;
                }
            }
            return;
        }

        // Trường hợp 3: Node cần xóa chỉ có con phải
        if (deleteNode.left == null && deleteNode.right != null) {
            if (parentOfDeleteNode == null) {
                root = deleteNode.right;
            } else {
                if (parentOfDeleteNode.left == deleteNode) {
                    parentOfDeleteNode.left = deleteNode.right;
                } else {
                    parentOfDeleteNode.right = deleteNode.right;
                }
            }
            return;
        }

        // Trường hợp 4: Node cần xóa có cả con trái và con phải
        if (deleteNode.left != null && deleteNode.right != null) {
            Node leftSubTree = deleteNode.left;
            Node largestInLeftSubTree = leftSubTree;
            Node parentOfLargest = deleteNode;

            // Tìm node lớn nhất trong cây con bên trái (largestInLeftSubTree)
            while (largestInLeftSubTree.right != null) {
                parentOfLargest = largestInLeftSubTree;
                largestInLeftSubTree = largestInLeftSubTree.right;
            }

            // Sao chép giá trị của largestInLeftSubTree vào deleteNode
            deleteNode.infor = largestInLeftSubTree.infor;

            // Xóa largestInLeftSubTree (vì nó đã được sao chép vào deleteNode)
            if (parentOfLargest == deleteNode) {
                deleteNode.left = largestInLeftSubTree.left;
            } else {
                parentOfLargest.right = largestInLeftSubTree.left;
            }
        }
    }

    public void inorderToAraay(ArrayList<Integer> a, Node p) {
        if (p == null) {
            return;
        }
        inorderToAraay(a, p.left);
        a.add(p.infor);
        inorderToAraay(a, p.right);

    }

    public void balance(ArrayList<Integer> a, int first, int last) {
        if (first <= last) {
            int middle = (first + last) / 2;
            insert(a.get(middle));
            balance(a, first, middle - 1);
            balance(a, middle + 1, last);
        }
    }

    public void balance() {
        ArrayList<Integer> a = new ArrayList<>();
        inorderToAraay(a, root);
        clear();
        balance(a, 0, a.size() - 1);
    }

    public Node searchFirstBothChildByBreadth() {

        if (root == null) {
            return null;
        }

        MyQueue q = new MyQueue();
        q.enqueue(root);

        Node p;
        while (!q.isEmpty()) {
            p = (Node) q.dequeue();

            if (p.infor < 22 && p.left != null && p.right != null) {
                return p;
            }

            if (p.left != null) {
                q.enqueue(p.left);
            }
            if (p.right != null) {
                q.enqueue(p.right);
            }
        }

        return null;
    }

    public Node getParentNode(Node p) {
        //Hint:Use code delete
        //DeleteNode and parentOfDeleteNode

        Node deleteNode;
        Node parentOfDeleteNode;
        deleteNode = root;
        parentOfDeleteNode = null;
        while (deleteNode != null) {
            if (deleteNode.infor == p.infor) {
                break; // found x
            }
            // continue search
            if (p.infor < deleteNode.infor) {
                parentOfDeleteNode = deleteNode;
                deleteNode = deleteNode.left;
            } else {
                parentOfDeleteNode = deleteNode;
                deleteNode = deleteNode.right;
            }
        }
        return parentOfDeleteNode;

    }

    public void rotateRight(Node p) {
        if (p == null || p.left == null) {
            return;
        }
        Node left = p.left;
        p.left = left.right;
        Node parent = getParentNode(p);
        if (parent == null) {
            root = left;
        } else {
            if (parent.left == p) {
                parent.left = left;
            } else {
                parent.right = left;
            }
        }
        left.right = p;
    }
}
