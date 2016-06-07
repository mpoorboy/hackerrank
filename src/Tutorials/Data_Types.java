import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Data_Types {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int line1 = scan.nextInt();
        double line2 = scan.nextDouble();
        scan.nextLine();
        String line3 = scan.nextLine();

        System.out.println(i+line1);
        System.out.println(d+line2);
        System.out.println(s + line3);
        scan.close();
    }
}
