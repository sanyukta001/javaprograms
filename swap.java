import java.util.Scanner;
public class swap 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping: a = "+a+" and b = "+b);
        int c = a;
        
        a = b;
        b = c;
        System.out.println("After Swapping: a = "+a+" and b = "+b);
        sc.close();
    }
    
}
