
import java.util.Scanner;

/**
   A program that reads in an angle between 0 and 359,
      and prints out which quadrant it is in.
   For example, the input of 20 is in quadrant I, and
      similarly, the input of 330 is in quadrant IV.
   Use error validation to print out an error message
      if an input angle is not between 0 and 359 degrees.
*/
public class Quadrants
{
   public static void main (String[] args)
   {
    String quadrant = "Error";  
    do{  
    // Display prompt for degrees of angle
      System.out.print("Please enter the number of degrees of angle: ");

      // Read angle in degrees
      Scanner in = new Scanner(System.in);
      int angle = in.nextInt();
      
      // Determine and print out the quadrant for the angle as "I", "II", "III", or
      // "IV", or print the word "Error"
      if(angle >= 0 && angle < 90){
      quadrant = "I";  
        }
      // your work here
      if(angle >= 90 && angle < 180){
      quadrant = "II";  
        }

      if(angle >= 180 && angle < 270){
      quadrant = "III";  
        }
        
      if(angle >= 270 && angle <= 359){
      quadrant = "IV";  
        }
      if(angle < 0 || angle > 359){
      quadrant = "Error";  
        }
        
     
    System.out.println(quadrant);
    }while(quadrant != "Error");
}
}
