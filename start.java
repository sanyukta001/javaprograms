import java.util.*;
class start
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = 0.0f;
        c=a*b;
        System.out.printf("The result if = %.3f\n",c);
        sc.close();
    }
}