package Testing;
public class ClubBouncer {
public static void main( String[] args ) {
int age = 22;
boolean onGuestList = false; double allure = 7.5;
String gender = "F";
if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) { System.out.println("You are allowed to enter the club.");
else {
}
	System.out.println("\"C-C-C-COMBO BREAKER\"");
            System.out.println("You are not allowed to enter the club.");
        }
}
}
//It does not compile. beucase you cannot put a statement in between an if/else statement.
