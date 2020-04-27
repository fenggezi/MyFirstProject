package sort;

public class DFSTree {

    public void xianxu(TreeNode node){

        if(node==null){
            return ;
        }
        System.out.println(node.val);
        if(node.getLeft()!=null){
            xianxu(node.getLeft());
        }
        if(node.getRight()!=null){
            xianxu(node.getRight());
        }
    }

    public void zhong(TreeNode node){

        if(node==null){
            return ;
        }
        if(node.getLeft()!=null){
            xianxu(node.getLeft());
        }
        System.out.println(node.val);
        if(node.getRight()!=null){
            xianxu(node.getRight());
        }
    }

    public void hou(TreeNode node){

        if(node==null){
            return ;
        }
        if(node.getLeft()!=null){
            xianxu(node.getLeft());
        }
        if(node.getRight()!=null){
            xianxu(node.getRight());
        }
        System.out.println(node.val);

    }

}
