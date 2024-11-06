import java.util.*;
public class pattern
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0; i<=n;i++){
        for(int j = 0;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }

  }
}