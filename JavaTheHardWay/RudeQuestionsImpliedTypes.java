import java.util.Scanner;

public class RudeQuestionsImpliedTypes {
public static void main( String[] args ) {
keyboard = new Scanner(System.in);

System.out.print( "Hello. What is your name? ");
name = keyboard.next();

System.out.print("Hi, " + name + "! How old are you? ");
age = keyboard.nextInt();
/*the program will not "blow up" if integer is entered becuase it is
not integer but it is converted to a double */
System.out.println("So you're " + age + ", eh? That's not very old.");
System.out.print("How much do you weigh, " + name + "? ");
weight = keyboard.nextDouble();
/*The program accepts a double and integer into a string */
System.out.println( weight + "! Better keep that quiet!!");
System.out.print("Finally, what's your income, " + name + "? ");
income = keyboard.nextDouble();
/*Question 1 blows up with a letter; Question 2 blows entered a letter at age

*/
System.out.print("Hopefully that is " + income + " per hour");
System.out.println(" and not per year!");
System.out.print("Well, thanks for answering my rude questions, ");
System.out.println(name + ".");
/*Question 3 blows up with a letter; Question 4 blows entered a letter at age

*/

System.out.print("Josh asking Question. How many times u skydive:: ");
int skydive = keyboard.nextInt();
System.out.println(skydive + ".");
  }

}
