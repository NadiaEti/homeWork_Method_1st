package operators;

import java.util.Scanner;

public class Conditional {
    //If the condition is true than if block of code will execute
//  If the condition is false than if block of code will not execute
//  If the condition is true than else block of code will execute

   public static void main(String[] args) {


   int num = 50;
   int num2 = 40;
   int num3 = 60;

   if( num < num2 ){
      System.out.println("Emti is a good boy");
   } else {
      System.out.println("Emti loves his mom");
   }
   if (num <= num3) {
      System.out.println("I love Emti");
   } else {
      System.out.println("Emti loves me");
   }

//Step 2:

      // && And Conditional Operator: Multiple condition connect with each other
      // All the condition must have to true than it will execute if block of code

      // || OR Conditional Operator

if ( num < num2  && num <= num3) {  //first one false but last one true
   System.out.println("This is a operator");
} else {
   System.out.println("This is not Assignment");
}

if ( num < num2  || num <= num3) {   // one condition is true then if will execute otherwise else will execute
   System.out.println("This is pipe");
}
else {
   System.out.println("This is OR operator");
}

// Step 3:
      // here i want to connect this ADD && with scanner

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your age");
      // Here I put int type of variable // Now i want to work with Adult and minor

       int adultAge = scan.nextInt();
      System.out.println("Enter your gender");
      String gender = scan.next();  //This is string type of value

       // In this logic i will try to make a example with multiple condition

      if (gender.equals("female")   &&    adultAge>= 18) { //  I put condition and i use ADD operator for connecting both.
         System.out.println("Now you are Adult");
      }
      if (gender.equals("male")   &&  adultAge >= 18){
         System.out.println("Now you are Adult");
      }
      else {
         System.out.println("You are minor");
      }
}
}