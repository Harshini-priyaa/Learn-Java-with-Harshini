import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = 0;
    for(int i = 2;i<=n/2;i++){
        if(n%i == 0){
            temp = 1;
            break;
        }
    }
    if(temp == 0){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not a prime number");
    }
  }
}