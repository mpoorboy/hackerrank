import java.lang.reflect.Method;

public class Generics {
//Start Code
  public static <E> void printArray(E[] arr) {
  
    for(E element: arr) {
       System.out.println(element);
    }
    
  }
//End Code
  public static void main(String args[]) {
  
    Integer[] intArray = { 1, 2, 3 };
    String[] stringArray = { "Hello", "World" };
    
    printArray( intArray  );
    printArray( stringArray );
        
    if (Generics.class.getDeclaredMethods().length > 2) {
      System.out.println("You should only have 1 method named printArray.");
    }
    
  }
  
}
