import java.util.*;
class multi
{
    int x;
    multi()
    {
        //Default constructor
        x = 0;
    }
    multi(int k)
    {
        //Parameterized constructor
        x = k;
    }
    public void multiply()
    {
        System.out.println("The multiplication table of "+x+" is:");
        for (int i = 1; i <= 10 ; i++ ) 
        {
            System.out.println(x+"X"+i+"="+(x*i));
        }
    }
}

public class tables
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		multi ob = new multi(n);//parameterized constructor works
        multi ob2 = new multi(n);//default constructor works
		ob.multiply();
        ob2.multiply();
        sc.close();
	}
}