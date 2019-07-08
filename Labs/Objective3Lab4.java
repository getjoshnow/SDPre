import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your first name?");
    firstName  = input.next();
    System.out.println("What is your last name?");
    lastName = input.next();
    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.print("First Name: "+firstName+", ");
    System.out.print("Last Name: "+lastName+", ");
    System.out.println("Age: "+age);

    input.close();
  }
}
