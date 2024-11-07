import java.util.*;
class trendynumber
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
    int mid = (n/10)%10;
    int len = (int)Math.floor(Math.log10(n) + 1);
    if(len <= 3){
      if(mid % 3 == 0){
        System.out.println("Trendy Number");
      }
      else{
        System.out.println("Not a Trendy Number");
      }
    }
    else{
        System.out.println("Invalid Number");
    }
  }
}