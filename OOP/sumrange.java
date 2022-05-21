import java.util.*;
class addition 
{
    int m, n;

    addition() 
    {
        // Default constructor
        m = 0;
        n = 0;
    }

    addition(int x, int y) 
    {
        // parameterized constructor
        m = x;
        n = y;
    }
    public int printsum() 
    {
        int sum = 0;
        for (int i = m; i <= n; i++) 
        {
            sum += i;
        }
        return sum;
    }
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the staring and the ending value");
        this.m = sc.nextInt();
        this.n = sc.nextInt();
        sc.close();
    }
}

public class sumrange 
{
    public static void main(String[] args) 
    {
        addition ob = new addition();
        ob.input();
        int s = ob.printsum();
        System.out.println("The sum is " + s);
    }

}