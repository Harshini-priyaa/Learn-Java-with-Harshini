class Dog{
    //Attributes followed up with behaviour

    //Attributes
    String name;
    String breed;
    int age;

    //Constructor -> no need to give return type

    // this -> special keyword to access elements
    //Arguments are input to a method
    Dog(String n, String breed, int age){
        this.name = n;
        this.breed = breed;
        this.age = age;
    }
    //Behaviour
    public void bark(){
        System.out.println(this.name + " is barking which is of age " + this.age + " and belongs to the breed " + this.breed);
    }
}


public class ClassExample {
    public static void main(String[] args) {
        //object for the class
        // Dog tommy = new Dog();
        // //Atributes
        // tommy.name = "tommy";
        // tommy.breed = "Indie";
        // tommy.age = 4;
        //While using constructor

        Dog tommy = new Dog("tommy", "Indie", 4);
        //Invoke the behaviour bark
        tommy.bark();
    }
}
