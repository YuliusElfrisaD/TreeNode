/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void addNode(int node) {
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
    
    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getElemen() + "   ");
            preOrder(node.getleftNode());
            preOrder(node.getrightNode());
        } else {
            return; 
        } 
    }
    
    public void inOrder(TreeNode node) {
        if (node != null) {
           inOrder(node.getleftNode());
            System.out.print(node.getElemen() + "   ");
            inOrder(node.getrightNode());
        } else {
            return;   
        }
    }
    
    public void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.getleftNode());
            postOrder(node.getrightNode());
            System.out.print(node.getElemen() + "   ");
        } else {
            return;  
        }
    }

    public TreeNode search (int x){
        if(isEmpty()){
            return null;
        }else{
            TreeNode bantu =root;
            while(bantu!=null){
                if(x==bantu.getElemen()){
                    return bantu;
                    
                }else if (x<bantu.getElemen()){
                    bantu=bantu.getleftNode();
                    
                }else{
                    bantu=bantu.getrightNode(); 
                }
            }
            return null;  
        }
    }
    
    public TreeNode searchChild(int x){
        if(isEmpty()){
            return null;
        }else{
            TreeNode bantu = root;
            while(bantu != null){
                if(x == bantu.getElemen()){
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
                }else if(x < bantu.getElemen()){
                    bantu = bantu.getleftNode();
                }else{
                    bantu = bantu.getrightNode();
                }
            }
            System.out.println("Tidak memiliki anak satupun");
            return null;
        }
    }
    
    public TreeNode getParent(int x){
        if(isEmpty()){
            return null;
        }else{
            TreeNode bantu = root;
            TreeNode parent = null;
            while(bantu != null){
                if(x == bantu.getElemen()){
                    System.out.println("Parent dari "+x+" adalah "+parent.getElemen());
                    return parent;
                }else if(x < bantu.getElemen()){
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
    
    public int getSize() {
        return size; 
    }
    
    public void setSize(int size) {
        this.size = size;
    }
}
