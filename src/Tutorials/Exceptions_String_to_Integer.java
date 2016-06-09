import java.io.*;
import java.util.*;

public class Exceptions_String_to_Integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch(NumberFormatException ex) {
            System.out.println("Bad String");
        }
   }
}
