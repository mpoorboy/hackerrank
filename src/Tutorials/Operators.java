import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double mealCost = scan.nextDouble();
    int tipPercent = scan.nextInt();
    int taxPercent = scan.nextInt();
    scan.close();
    double tc = mealCost + (((double) tipPercent/100) * mealCost) + (((double) taxPercent/100) * mealCost);
    int totalCost = (int) Math.round(tc);
    System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
