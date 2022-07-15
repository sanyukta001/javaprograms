public class book1 extends Books
{
    public void input()
    {
        System.out.println("*********Enter the details of book1*********");
        chapters();
        pages();
        genre();
        
    }
    public void display()
    {
        System.out.println("\n*********The details of book1 are********* \n");
        System.out.println("There are "+ x +" number of chapters in book1");
        System.out.println("There are "+ y +" number of pages in book1");
        System.out.println("Genre of book1 is "+z);
    }
    
}
class book2 extends Books
{
    public void input1()
    {
        System.out.println("\n*********Enter the details of book2*********\n");
        chapters();
        pages();
        genre();
       
    }
    public void display1()
    {
        System.out.println("\n*********The details of book2 are********* \n");
        System.out.println("There are "+ x +" number of chapters in book2");
        System.out.println("There are "+ y +" number of pages in book2");
        System.out.println("Genre of book2 is "+z);
    }

}
class book3 extends Books
{
    public void input2()
    {
        System.out.println("\n*********Enter the details of book3*********\n");
        chapters();
        pages();
        genre();
    }
    public void display2()
    {
        System.out.println("\n*********The details of book3 are********* \n");
        System.out.println("There are "+ x +" number of chapters in book3");
        System.out.println("There are "+ y +" number of pages in book3");
        System.out.println("Genre of book3 is "+z);
    }
}
