package sort;


import java.util.ArrayDeque;
import java.util.LinkedList;

public class BFSTree {

    public void bfsTree(TreeNode node){
        if(node == null){
            return ;
        }
        // 层序遍历
        ArrayDeque<TreeNode> list = new ArrayDeque();
        list.add(node);
        while(!list.isEmpty()){
            TreeNode poll = list.poll();
            System.out.println(poll.getVal()+"节点");// 打印这个树的节点值
            if(poll.getLeft()!=null){
                bfsTree(poll.getLeft());
            }
            if(poll.getRight()!=null){
                bfsTree(poll.getRight());
            }
        }
    }
}

class TreeNode{
    public int val;
    public TreeNode left;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode right;
}
