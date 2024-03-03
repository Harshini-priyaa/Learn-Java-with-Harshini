/*
  As already discussed the "System.out.println()" statement is used for printing 
  Syntax Explanation => the print statement used is the "System.out.println"
  Where System -> Standard class of Java
        out -> object to display output
        println -> method to print the statement
  This is used to print string, numbers, special characters and what not!
  There is also an exciting thing in this we can also do arthemetic operations in this print statement
 */

 /*
   This "System.out.println()" is the statement that prints the statements preceeding in new line => "ln" represents new line
   Whereas the "System.out.print()" is the statement used to print things in the same line
  */
public class example_printing {
    public static void main(String[] args) {
        //Addition
        System.out.println(22 + 51);
        //Subtraction
        System.out.println(51 - 22);
        //Multiplication
        System.out.println(22 * 51);
        //Division
        System.out.println(22/2);
        //Modulus
        System.out.println(10 % 5);
      
        System.out.println((((10 - 8) + 16) * 12 ) /2 );
        //Example of "System.out.print()" statement

        System.out.print("This is an example of System.out.print() function");
        System.out.print("  I got printed in the same line");

        /*
          This print function can also used to print the both text and numbers on the same line 
          for concatinating "+" operator is used
         */
        //Example
        System.out.println("My favourite number is " + 2);
        //as discussed earlier we can perform arthemetic operation in the same way
        System.out.println("The addition of 3 and 8 is " + (3 + 9));// here the first "+" is used for concatination and second one is used as addition operator
        
    }
}
