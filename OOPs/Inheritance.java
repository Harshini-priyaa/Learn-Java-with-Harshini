// name , brand, color, engine typr-normal, raising
//behavoiur-> drive spped 100kmph
//racecar -> extend 200kmph
class Car{
    String name;
    String brand;
    String color;
    int speed = 100;

    public Car(String n, String b, String c){
        this.name = n;
        this.brand = b;
        this.color = c;
    
    }
    
    public void drive(){
        System.out.println(this.name + " of brand " + this.brand + " with color " + this.color + " can drive only to the max of " + this.speed + " km/hr");
    }
}

class Racecar extends Car{
    int speed = 200;
    public Racecar(String n, String b, String c){
        super(n, b, c);
    
    }
    public void race(){
        System.out.println(this.name + " of brand " + this.brand + " with color " + this.color + " can drive to the max of " + this.speed + " km/hr");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Car shark = new Car("Shark", "Volswogan", "red");
        shark.drive();
        Racecar f1 = new Racecar("Formula 1", "Ferrari", "blue");
        f1.race();
    }
}
