import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solve_Me_First {

static int solveMeFirst(int a, int b) {
    return a+b;
   }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = solveMeFirst(a, b);
    System.out.println(sum);
  }
 }
