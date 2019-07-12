import java.util.Scanner;

public class ForgetfulMachine {

   public static void main( String[] args ) {
     Scanner keyboard = new Scanner(System.in);

 System.out.println( "What city is the capital of France?" );
 keyboard.next();

 System.out.println( "What is 6 multiplied by 7?" );
 keyboard.nextInt();
/*  typed 3f
 Exception in thread "main" java.util.InputMismatchException
 	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
 	at java.base/java.util.Scanner.next(Scanner.java:1594)
 	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
 	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
 	at ForgetfulMachine.main(ForgetfulMachine.java:12) */

 System.out.println( "Enter a number between 0.0 and 1.0." );
 keyboard.nextDouble();
/*typed 33ff
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at ForgetfulMachine.main(ForgetfulMachine.java:15)*/
 System.out.println( "Is there anything else you would like to say?" );
 keyboard.next();
 }
}
