import java.util.*;
public class Books
{
    int x,y;
    String z;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    public void chapters()
    {
        System.out.println("Enter the number of chapters");
        x = sc.nextInt();
    }
    public void pages()
    {
        System.out.println("Enter the number of pages");
        y = sc.nextInt();
    }
    public void genre()
    {
        System.out.println("Enter the genre of the book");
        z = sc1.nextLine();
    }
}