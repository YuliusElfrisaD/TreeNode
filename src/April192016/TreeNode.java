/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April192016;

/**
 *
 * @author User
 */
public class TreeNode {
    public TreeNode leftNode;
    public TreeNode rightNode;
    public Object elemen;
    
    public TreeNode(Object in_elemen) {
        elemen = in_elemen;
        leftNode = null;
        rightNode = null;
    }

    public Object getElemen() {
        return elemen;
    }

    public void setElemen(Object elemen) {
        this.elemen = elemen;
    }
     
    public TreeNode getleftNode() {
        return leftNode;
    }
    
    public void setleftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
    
    public TreeNode getrightNode() {
        return rightNode; 
    }
    
    public void setrightNode(TreeNode rightNode) {
        this.rightNode = rightNode; 
    }
    
    public void insert(Object x) {
        if (((Comparable)x).compareTo(elemen)<0) {
            if (leftNode == null) {
                leftNode = new TreeNode(x);
            } else {
                leftNode.insert(x);
            }
            //penambahan di leftNodeNode
        } else {
            //penambahan di rightNodeNode
            if (((Comparable)x).compareTo(elemen)>0) {//x > elemen
                if (rightNode == null) {
                    rightNode = new TreeNode(x);
                } else {
                    rightNode.insert(x);
                }  
            }
        } 
    }
}