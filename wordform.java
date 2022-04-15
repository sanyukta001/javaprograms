/*WAP to take a word as input from the user and form a new word following these steps: sort the word 
according to the frequency of the characters and if two characters have same frequency then sort it 
according to their alphabetical order. Assume all the characters are in lower case.
*/
import java.util.*;
public class wordform 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.next();
        int n = str.length();
        char arr[] = new char[n];
        
        for (int i = 0; i < n; i++) 
        {
           arr[i] = str.charAt(i);
        }
        
        int b[] = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++)
        {
            int c=0; int f=0;
             for(int j = 0; j < n; j++)
             {
                 if(arr[i] == arr[j])
                 c++;
                  if(c>1)
                   {
                    for(int l = j; l < n-1; l++)
                      arr[l] = arr[l+1];
                     n-=1;
                     f++;
                     c--;
                     j--;
                    }
              }
                b[k++] = c+f;
        }
        
        for (int i = 0; i < n; i++) 
        {
           for (int j = 0; j < n-1-i; j++) 
           {
              if(arr[j]>arr[j+1])
              {
                  char x=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=x;
                  int t=b[j];
                  b[j]=b[j+1];
                  b[j+1]=t;
                } 
            }
        }
        
        String nw="";
        for (int i = 0; i < n; i++) 
        {
            int max = 0; 
            int m=0;
            for (int j = 0; j < n; j++) 
            {
                if(max<b[j] )
                {
                max = b[j];
                m=j;
                }
            }
            nw=nw+arr[m];
            b[m] = 0;
        }
        System.out.println("The new word is: "+nw);
            sc.close();
    }
}
