
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyBSTree bstree = new MyBSTree();
        
//        bstree.insert(10);
//        bstree.insert(6);
//        bstree.insert(15);
//        
//        int[] a = { 4, 8, 12, 19, 2, 5, 7, 9, 11, 14, 17, 20, 1, 3, 13, 16, 18, 21, 0, 22};
//        bstree.insertMany(a);
//        
//        System.out.println("PreOrder (NLR) BSTree");
//        bstree.preOrder(bstree.root);
//        System.out.println();
//        
//        System.out.println("InOrder (LNR) BSTree");
//        bstree.inOrder(bstree.root);
//        System.out.println();
//        
//        System.out.println("PostOrder (LRN) BSTree");
//        bstree.postOrder(bstree.root);
//        System.out.println();
//        
//        
//        
//        System.out.println("Breadth-First: ");
//        bstree.breadth();
//        System.out.println();
        
//        System.out.println("Delete by Merging: 3 ");        
//        bstree.deleteByMerging(3);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Merging: 7");        
//        bstree.deleteByMerging(7);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Merging: 2");        
//        bstree.deleteByMerging(2);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Merging: 20");        
//        bstree.deleteByMerging(20);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Merging: 15");        
//        bstree.deleteByMerging(15);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Merging: 10");        
//        bstree.deleteByMerging(10);
//        bstree.breadth();
//        System.out.println();
        
        
//         System.out.println("Delete by Copying: 3 ");        
//        bstree.deleteByCopying(3);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Copying: 7");        
//        bstree.deleteByCopying(7);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Copying: 2");        
//        bstree.deleteByCopying(2);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Copying: 20");        
//        bstree.deleteByCopying(20);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Copying: 15");        
//        bstree.deleteByCopying(15);
//        bstree.breadth();
//        System.out.println();
//        
//        System.out.println("Delete by Copying: 10");        
//        bstree.deleteByCopying(10);
//        bstree.breadth();
//        System.out.println();
//        
//        
//         System.out.println("Ballancing a Tree "); 
//         bstree.balance();
//         System.out.println();
         
         
         
         
     int [] a = {25,20,36,10,22,30,40,5,12,28,38,48,1,8,15,45,50};
        bstree.addManyLast(a);
        
        
        System.out.println("Breadth-First: ");
        bstree.breadth();
        System.out.println();
        
        
        
        System.out.println("searchFirstBothChildByBreadth : ");
        System.out.println(bstree.searchFirstBothChildByBreadth().infor);
        
        
        
        System.out.println("getParentNode");
        System.out.println(bstree.getParentNode(bstree.searchFirstBothChildByBreadth()).infor);
        
        Node p = bstree.searchFirstBothChildByBreadth();
        System.out.println("RotateRight: ");
        bstree.rotateRight(p);
        bstree.breadth();
        System.out.println();        
        
        
    }
}