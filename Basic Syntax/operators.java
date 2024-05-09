/* 
  Operators in Java are used for various purposes.
  Java has multiple operators such as Assignment Operators, Arthemetic Operators,Comparison Operators,Logical and Bitwise Operators
 */

public class operators {
    public static void main(String[] args){
        //Assignment operators
        int num = 5;
        int num2 = num;
        System.out.println(num2);
        //Assignment operators can also be used as shorthand operators in updating a variable
        num += 7;
        num2 -= 3;
        System.out.println(num);
        System.out.println(num2);
    }
}
