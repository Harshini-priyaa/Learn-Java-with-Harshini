/* 
  Operators in Java are used for various purposes.
  Java has multiple operators such as Assignment Operators, Arithmetic Operators,Comparison Operators, Logical and Bitwise Operators
  Each operator designated with different purposes 
 */

public class operators {
    public static void main(String[] args){
        //Assignment operators
        int num = 5;
        int num2 = num;
        int num3 = 7;
        int num4 = 20;
        System.out.println(num2);
        //Assignment operators can also be used as shorthand operators in updating a variable
        num += 7;
        num2 -= 3;
        num3 *= 4;
        num4 /= 2;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }
}
