//Problem in Java Preparation - Hackerrank 
//Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of 2 to 5, print Not Weird
// If  is even and in the inclusive range of 6 to 20, print Weird
// If  is even and greater than20 , print Not Weird



import java.util.*;

public class ifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2 != 0 ){
            System.out.println("Weird");     
        }
         if((n>=2 && n<=5)&& n%2 ==0){
            System.out.println("Not Weird");
         }
         if((n>=6 && n<=20) && n%2 ==0){
            System.out.println("Weird");
         }
         if(n>20 && n%2 ==0){
            System.out.println("Not Weird");
         }
        

        scanner.close();
    }
}
