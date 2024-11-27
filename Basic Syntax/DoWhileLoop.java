public class DoWhileLoop {
    public static void main(String args[]){
        //  for(int i = 0; i<= 100; i+=1){
        //     if(i % 3 == 0 && i % 5 == 0){
        //         System.out.println("Fizzbuzz");
        //         continue;
        //     }
        //     else{
        //         System.out.println(i*2);
        //     }
        // }
        int i = 1; 
        while(i<=100){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                i += 1;
                continue;
            }
        
            System.out.println(i * 2);
  
            i += 1;
        }
    }
}
