
import java.util.Scanner;
public class RainbowColors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character ");
        char color = in.next().charAt(0);
        switch (color){
            case 'V' | 'v':
                System.out.print("Violet ");
                System.out.println("is a color in Rainbow");
                break;
            case 'I' | 'i':
                System.out.print("Indigo ");
                System.out.println("is a color in Rainbow");
                break;
            case 'B' | 'b':
                System.out.print("Blue ");
                System.out.println("is a color in Rainbow");
                break;
            case 'G' | 'g':
                System.out.print("Green ");
                System.out.println("is a color in Rainbow");
                break;
            case 'Y' | 'y':
                System.out.print("Yellow ");
                System.out.println("is a color in Rainbow");
                break;
            case 'O' | 'o':
                System.out.print("Orange ");
                System.out.println("is a color in Rainbow");
                break;
            case 'R' | 'r':
                System.out.print("Red ");
                System.out.println("is a color in Rainbow");
                break;   
            default:
                System.out.println("Not a color in Rainbow");  
        }

        // if(color == 'V'){
        //     System.out.println("Violet");
        // }
        // else if(color == 'I'){
        //     System.out.println("Indigo");
        // }
        // else if(color == 'B'){
        //     System.out.println("Blue");
        // }
        // else if(color == 'G'){
        //     System.out.println("Green");
        // }
        // else if(color == 'Y'){
        //     System.out.println("Yellow");
        // }
        // else if(color == 'O'){
        //     System.out.println("Orange");
        // }
        // else if(color == 'R'){
        //     System.out.println("Red");
        // }
        // else{
        //     System.out.println("Not a color in Rainbow");
        // }
    }
}
