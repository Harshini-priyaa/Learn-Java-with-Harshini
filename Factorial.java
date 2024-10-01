//A program to find the factorial of a number

class Factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int fact = 1;
        int num = obj.nextInt();
        if(n < 0){
            System.out.println("Negative Number");
        }
        else{
            for(int i = 1; i <=num; ++i){
                fact *= i;
            }
              System.out.println("The factorial is:" + fact);
        }
      
    }
}
