import java.util.*;

class TreeNode
{
    int val;
    TreeNode left,right;
    TreeNode(int val)
    {
        this.val=val;
        left=null;
        right=null;
    }
}
public class LevelOrderToTree
{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        String lvlOrd=sc.nextLine();

        TreeNode root=getRoot(lvlOrd);
        printPreOrder(root);
    }
    static void printPreOrder(TreeNode root)
    {
        if(root==null)
        {
            
            return;
        }
        System.out.print(root.val+"  ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    static TreeNode getRoot(String lvlOrd)
    {
        TreeNode root=null;
        if(lvlOrd.length()!=0 && lvlOrd.charAt(0)!='n')
        {
            String vals[]=lvlOrd.split(",");
            root=new TreeNode(Integer.parseInt(vals[0]));
            Deque<TreeNode> q =new ArrayDeque<>();
            q.addLast(root);
            int i=1;
            while(!q.isEmpty())
            {
                TreeNode tmp=q.removeFirst();
                if(i<vals.length && vals[i].charAt(0)!='n')
                {
                    tmp.left=new TreeNode(Integer.parseInt(vals[i]));
                    q.addLast(tmp.left);
                }
                i++;
                if(i>=vals.length)
                    break;
                if(i<vals.length && vals[i].charAt(0)!='n')
                {
                    tmp.right=new TreeNode(Integer.parseInt(vals[i]));
                    q.addLast(tmp.right);
                }
                i++;
            }
            
        }
        return root;
    }

}


