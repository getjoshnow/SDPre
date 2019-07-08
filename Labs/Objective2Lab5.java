import java.lang.Math;

public class Objective2Lab5 {
  public static void main (String[] args){

      double side1 = 3, side2 = 4, hypotenuse;

      hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
      System.out.println("The hypotenuse of a triangle with sides "+side1+" and "+side2+" is "+hypotenuse);
  }
}
