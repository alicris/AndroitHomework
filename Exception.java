import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner reader = new Scanner(System.in);  
     
            int a = reader.nextInt(); 
            
            int b = reader.nextInt();
           
           if(b==0)
                throw  new ArithmeticException("/ by zero");
            else
                System.out.println(a/b);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
