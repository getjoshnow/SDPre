import java.util.Scanner;

public class BMICalculator {
public static void main( String[] args ) {
Scanner keyboard = new Scanner(System.in);
double f, i, kg = 0, bmi;


System.out.print("Your height (feet): ");
f = keyboard.nextDouble();
System.out.print("Your height in inches: ");
i = keyboard.nextDouble();
System.out.print("Your weight in pounds: ");
double pounds = keyboard.nextDouble();

double totalinches = (f*12) + i;

//System.out.println("Your weight in totalinches: "+totalinches);
double m = totalinches*0.0254; // equals meter

//System.out.println("Your weight in m: "+m);
//System.out.println("Your weight in kg: "+kg);
kg = 0.453592*pounds;

//System.out.println("Your weight in kg: "+kg);

bmi = kg / (m*m);
System.out.println("Your BMI is " + bmi );
}

}
