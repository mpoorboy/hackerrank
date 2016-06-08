import java.io.*;
import java.util.*;
//Begin code
public class Person {
    private int age;	
  
	public Person(int initialAge) {
    this.age = initialAge;
    }

	public void amIOld() {
        	if (age <= 0) {
         System.out.println("Age is not valid, setting age to 0.");
                System.out.println("You are young.");
                this.age = 0;
     }
  	else if (age >= 18) {
         System.out.println("You are old.");
     } else if (age >= 13) {
         System.out.println("You are a teenager.");
     } else {
        System.out.println("You are young.");
    }
        
	}

	public void yearPasses() {
  	this.age++;
	}
	//End code
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	
	for (int i = 0; i < T; i++) {
		int age = sc.nextInt();
		Person p = new Person(age);
		p.amIOld();
		
	  for (int j = 0; j < 3; j++) {
			p.yearPasses();
		}
		
		p.amIOld();
		System.out.println();
    }
	 sc.close();
  }
}
