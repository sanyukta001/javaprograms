import java.util.*;
public class stack
{
    private Listnode top;
    private int length;

    class Listnode 
    {
        private int data;
        private Listnode next;
        public Listnode()
        {
            this.data = 0;
            this.next = null;
        }
        public Listnode(int val)
        {
            this.data = val;
            this.next = null;
        }
    }

    stack()
    {
        top = null;
        length = 0;
    }
    public boolean isEmpty()
    {
        if(top == null)
            return true;
        else 
            return false;
    }
    public void push(int val)
    {
        Listnode temp = new Listnode(val);
        if(!isEmpty())
        {
            temp.next = top;
        }
        top = temp;
        length++;
    }
    public int pop()
    {
        if(isEmpty())
            return -9999;
        else 
        {
            int res = top.data;
            top = top.next;
            length--;
            return res;
        }
    }
    public void peek()
    {
        if(!isEmpty())
        {
            System.out.println(top.data);
        }
    }
    public static void main(String[] args)
    {
        stack st = new stack();
        st.push(10);
        st.push(15);
        st.push(20);
        st.peek();
        st.pop();
        st.peek();
    }
}

