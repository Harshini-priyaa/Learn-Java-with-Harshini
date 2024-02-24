/*
  This is a the first program in any programming language so as in Java
   
  In java things are all defined within class  and so here to print "Hello World" the helloworld class is defined
  The main function is declared so the things to get started
  And to print the "Hello World!" the print statement used is the "System.out.println"
  Where System -> Standard class of Java
        out -> object to display output
        println -> method to print the statement

  */
  

public class helloworld{
   /* Every java file must contain a main() method from which every other methods are invoked
      Siganature of the main method is that -> public static void main(String[] args) 
      that accepts single argument => array of elemets od type string
     */
  public static void main(String[] args){
      // each statement in java gets terminated with a semicolon
        System.out.println("Hello World!"); 
        // Not only for hello world which is string even for printing numbers we do follow the same syntax
        System.out.println(8);
       

    }
}

