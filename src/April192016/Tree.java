/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April192016;

import java.util.Stack;

/**
 *
 * @author User
 */
public class Tree {
    private TreeNode root;
    private int size;
    
    public Tree() {
        root = null;
        size = 0;
    }
    
    //method untuk menambah simpul baru
    public void addNode(Object node) {
        if (isEmpty()) {
            root = new TreeNode(node);
        } else {
            root.insert(node); 
        } 
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false; 
        } 
    }
    
    public void preOrder(){
        preOrderHelper(root);
    }
    
    public void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getElemen() + "   ");
            preOrderHelper(node.getleftNode());
            preOrderHelper(node.getrightNode());
        } else {
            return; 
        } 
    }
        
    public void postOrder(){
        postOrderHelper(root);
    }
    
    public void postOrderHelper(TreeNode node){
        if (node != null){
            postOrderHelper(node.getleftNode());
            postOrderHelper(node.getrightNode());
            System.out.print(node.getElemen() + "   ");
        }
    }
    public void inOrder(){
        inOrderHelper(root);
    }
   
    public void inOrderHelper(TreeNode node) {
        if (node != null) {            
            inOrderHelper(node.getleftNode());
            System.out.print(node.getElemen() + "   ");            
            inOrderHelper(node.getrightNode());
        } else {
            return; 
        } 
    }
    
    public TreeNode search (Object x){
        if(isEmpty()){
            return null;
        }else{
            TreeNode bantu =root;
            while(bantu!=null){
                if(((Comparable)x).compareTo(bantu.getElemen())==0){
                    return bantu;
                    
                }else if (((Comparable)x).compareTo(bantu.getElemen())<0){
                    bantu=bantu.getleftNode();
                    
                }else{
                    bantu=bantu.getrightNode(); 
                }
            }
            return null;  
        }
    }
    
    public TreeNode searchChild(Object x){
        if(isEmpty()){
            return null;
        }else{
            TreeNode bantu = root;
            while(bantu != null){
                if(((Comparable)x).compareTo(bantu.getElemen())==0){
                    if(bantu.leftNode != null){
                        System.out.println("Anak kiri "+bantu.leftNode.getElemen());
                    }else{
                        System.out.println("Anak kiri null");
                    }
                    if(bantu.rightNode != null){
                        System.out.println("Anak kanan "+bantu.rightNode.getElemen());
                    }else{
                        System.out.println("Anak kanan null");
                    }           
                    return bantu;
                }else if(((Comparable)x).compareTo(bantu.getElemen())<0){
                    bantu = bantu.getleftNode();
                }else{
                    bantu = bantu.getrightNode();
                }
            }
            System.out.println("Tidak memiliki anak satupun");
            return null;
        }
    }
    
    public TreeNode getParent(Object x){
        if(isEmpty()){
            return null;
        }else{
            TreeNode bantu = root;
            TreeNode parent = null;
            while(bantu != null){
                if(((Comparable)x).compareTo(bantu.getElemen())==0){
                    System.out.println("Parent dari "+x+" adalah "+parent.getElemen());
                    return parent;
                }else if(((Comparable)x).compareTo(bantu.getElemen())<0){
                    parent = bantu;
                    bantu = bantu.getleftNode();
                }else{
                    parent = bantu;
                    bantu = bantu.getrightNode();
                }
            }
            System.out.println("Parent idak ditemukan");
            return null;
        }
    }
    
     public void addPostFix(String postfix){
        Stack tumpukan = new Stack();
        for(int i=0; i<postfix.length(); i++){
            char a = postfix.charAt(i);
            if(a == '*' || a == '/' ||
                    a == '+' || a  =='-'){
                TreeNode bantu = new TreeNode(a);
                bantu.rightNode = (TreeNode)tumpukan.pop();
                bantu.leftNode = (TreeNode)tumpukan.pop();
                tumpukan.push(bantu);
            }else{
                TreeNode bantu = new TreeNode(a);
                tumpukan.push(bantu);
            }
        }
        root =(TreeNode)tumpukan.pop();
    }
}
