/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(26);
        tree.addNode(15);
        tree.addNode(8);
        tree.addNode(14);
        tree.addNode(100);
        tree.addNode(200);

        System.out.print("preOrder");
        System.out.println("");
        tree.preOrder(tree.getRoot());
        System.out.println("  ");
        System.out.print("in Order");
        System.out.println("");
        tree.inOrder(tree.getRoot());
        System.out.println("  ");
        System.out.print("PostOrder");
        System.out.println("");
        tree.postOrder(tree.getRoot());
        System.out.println("  ");
        
        TreeNode hasil=tree.search(26);
        if(hasil==null){
            System.out.println("Data tidak ditemukan");
        }else{ 
            System.out.println("Data ditemukan   "     +hasil.getElemen());
        }
        
        tree.searchChild(14);
        tree.getParent(14);
    }
}
