
public class Operators
{
	public static void main(String[] args) {
	    int a = 10, b= 5;
	    
	    //Arthemetic
	    System.out.println("Addition: " + (a+b));
	    
	    //Relational
	    System.out.println("Greater than: " + (a > b));
	    
	    //Logical
	    System.out.println("Logical AND: " + ((a > 5) && (b < 10)));
	    System.out.println("Logical OR: " + ((a > 5) || (b < 10)));
	    
	    //Bitwise
	    System.out.println("Bitwise AND: " + (a & b));
	    System.out.println("Bitwise OR: " + (a | b));

	}
}
