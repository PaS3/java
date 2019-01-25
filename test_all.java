import java.net.*;
import java.io.*;

/* There be comments here captin...
*
*/

public class test_all
{
  public static void main(String[] args)
  {
    int a, b, z, n;
    a = 1;
    b = 1;
    n = 10; //month-year birthday

    do
    {
      while(a <= 12)
      {
        for(int c = 1; c <= 12; c = c + 1)
        {
          z = a + b;
          if(b == n + 1 || b == n - 2 || b == n - 1)
          {
            String textT = "Not cohabitor";
            System.out.println("Life: " + textT + "   number:  " + b ); //also commencts here.
            //boolean result = textT instanceof String;
            //System.out.println("\n" + result );
            a++;
            b++;
          }
          else
          {
            String textF = "Cohabitor";
            System.out.println("Life: " + textF + "   number:  " + b ); //also commencts here.
            //boolean result = textF instanceof String;
            //System.out.println("\n" + result );
            a++;
            b++;
          }
        }
      }
    }while(b <= 12);

    System.out.println("\n");
    int [] nomers = {10, 11 ,12, 1, 2 ,3 };
    char [] bukvi = {'A','B','C','D', 'E','F'};

    for(int x : nomers)
    {
      System.out.print( x + ", ");
    }
    for(char c : bukvi )
    {
      System.out.print(", " + c );
    }


    int[] result = new int[nomers.length];
    for (int i = 0, j = result.length - 1; i < nomers.length; i++, j--)
    {
            result[j] = nomers[i];
            System.out.println( result);
    }
    System.out.println("\n\n" + result);


    printArray(new int[]{3, 1, 2, 6, 4, 2});



  }

  public static void printArray(int[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      System.out.print(array[i] + " ");
    }
  }

  public static int[] reverse(int[] nomers)
  {
    int[] result = new int[nomers.length];
    for (int i = 0, j = result.length - 1; i < nomers.length; i++, j--)
    {
      result[j] = nomers[i];
    }
    return result;
   }





}
