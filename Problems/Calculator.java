
public class Calculator
{
    private boolean switchButton;
    Calculator(){
        this.switchButton = false;
    }
    public void toggle(){
        this.switchButton = !this.switchButton;
    }
    public boolean getStatus(){
        return this.switchButton;
    }
	public static void main(String[] args) {
	    Calculator cal1 = new Calculator();
	    cal1.toggle();
		System.out.println(cal1.getStatus());
	}
}
