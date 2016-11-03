import java.util.*;
import java.text.*;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double payment = sc.nextDouble();
        sc.close();

        String us = NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment); // TODO: use Enum?
        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment);
        String france = NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment);
        
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
