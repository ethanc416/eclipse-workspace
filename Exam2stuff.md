```java
import java.util.*;
public class stuff {
	public static void main(String[] args) {
		System.out.println("Here are my name, age and shoe size:");
		int age = 21;
		double shoeSize = 10.5;
		String name = "Ethan";
		System.out.println("My name is " + name + ".\nI am " + age + " years old.\nMy shoe size is " + shoeSize + ".");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String yourName = sc.nextLine();
		String upperName = name.toUpperCase();
		String upYourName = yourName.toUpperCase();
		if (upYourName.equals(upperName))
			System.out.println("We share the same name! Nice to meet you!");
		else {
			System.out.println("Nice to meet you " + yourName + ".");
		}
		
		Scanner input = new Scanner(System.in);
		// Write print statement for input of side length
		System.out.println("Enter the side: ");
		// input of side length
		double side = input.nextDouble();
		// calculate area using side length
		double area = ((6*Math.pow(side, 2))/(4*Math.tan(Math.PI/6)));
		// Print statement for area of hexagon
		System.out.printf("The area of a hexagon is %.2f\n", area);
		
		int coinToss = (int)(Math.random()*2);
		int tails = 0;
		int heads = 1;
		if (coinToss == heads) {
			System.out.println("The coin landed on heads!");}
		else {
			System.out.println("The coin landed on tails!");
		}
		int randomNum = 1 + (int)(Math.random()*1000);
		System.out.print(randomNum);
	}
}
```
