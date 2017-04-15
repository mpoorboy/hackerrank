import java.io.*;
import java.util.*;

public class A_Very_Big_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
         long sum = 0;
        
        for (int i = 0; i < T; i++) {
         long N = sc.nextLong();
         sum += N;
        }
        
        System.out.println(sum);
    }
}
