//This is an if condition that checks for zero division exception 

import java.util.*;

public class if_example {
        public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
 
        if (b == 0) {
            System.out.println("infinity");  
            return;
        }


        System.out.println(a / b);
    }
}
