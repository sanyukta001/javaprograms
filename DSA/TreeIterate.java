import java.util.*;
public class TreeIterate
{
    Listnode[] arr;
    Listnode root;
    int top;
    class Listnode 
    {
        int data;
        Listnode left;
        Listnode right;
        public Listnode()
        {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        public Listnode(int val)
        {   
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    
    public TreeIterate()
    {
        arr = new Listnode[10];
        top = -1;
    }
    public boolean isEmpty()
    {
        if(top == -1)
            return true;
        return false;
    }
    public void push(Listnode val)
    {
        arr[++top] = val;
    }
    public Listnode pop()
    {
        if(isEmpty())
            return null;
        Listnode temp = arr[top];
        top--;
        return temp;
    }
    public void create()
    {                                                        //      1
        Listnode temp = new Listnode(1);                     //     / \
        this.root = temp;                                    //    2   3
        temp.left = new Listnode(2);                         //    /\  /\
        temp.right = new Listnode(3);                        //   4  5 6 7
        temp.left.left = new Listnode(4);
        temp.left.right = new Listnode(5);
        temp.right.left = new Listnode(6);
        temp.right.right = new Listnode(7);
    }
    public void preorder(Listnode root)
    {
        if(root == null)
            return;
        push(root);
        while(!isEmpty())
        {
            Listnode temp = pop();
            System.out.print(temp.data+" ");
            if(temp.right != null)
                push(temp.right);
            if(temp.left != null)
                push(temp.left);
        }
    }
    public void postorder(Listnode root)
    {
        if(root == null)
            return;
        Listnode curr = root;
        while(!isEmpty() || curr != null)
        {
                if(curr != null)
                {
                    push(curr);
                    curr = curr.left;
                }
                else
                {
                    Listnode temp = arr[top].right;
                    if(temp == null)
                    {
                        temp = pop();
                        System.out.print(temp.data+" ");
                        while(!isEmpty()&&temp==arr[top].right)
                        {
                            temp = pop();
                            System.out.print(temp.data+ " ");
                        }
                    }
                    else
                    {
                        curr = temp;
                    }
                }
        }
    }
    public void inorder(Listnode root)
    {
        if(root == null)
            return;
        Listnode temp = root;
        while(!isEmpty()||temp!=null)
        {
            if(temp != null)
            {
                push(temp);
                temp = temp.left;
            }
            else
            {
                temp = pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }
    public static void main(String[] args)
    {
        TreeIterate t = new TreeIterate();                                 
        t.create();
        System.out.print("Preorder: ");
        t.preorder(t.root);
        System.out.println();
        System.out.print("Postorder: ");
        t.postorder(t.root);
        System.out.println();
        System.out.print("Inorder: ");
        t.inorder(t.root);
    }

}