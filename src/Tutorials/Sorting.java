import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int numberOfSwaps = 0;
        int temp = 0;
    
        for (int i = 0; i < N; i++) {
           a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 1; j < (a.length - i); j++) {
                
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    numberOfSwaps++;
                }
               
            }
            
            if (numberOfSwaps == 0) {
                break;
            }
           
        }
        
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }
    
}
