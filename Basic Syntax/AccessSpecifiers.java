//types -> public,private,protected
//by default all the properties are public
//private cant be accesses outside the class
//to access them we use getters and setters


//Learn-> Setters and Getters
class Dog{

    private String name;
    private String breed;
    private int age;

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


public class AccessSpecifiers {
    public static void main(String[] args) {
        Dog tommy = new Dog("tommy", "Indie", 4);

        tommy.bark();
    }
}

