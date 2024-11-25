// intialize -> {this is a loop(check-run-increment)}

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 50; i+=1){
            if((i % 3 == 0)&& (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
        // //Even numbers till 50
        // for(int i = 0; i <= 50; i+=1){
        //     if(i%2 == 0){
        //         System.out.print(i + " ");
        //     }
        // }
    }
}
