
import java.net.InterfaceAddress;
import javax.print.attribute.Size2DSyntax;

public class IntegerStack{

    int value;
    int top;
    int size;

    public void push(int value){
        if(top == size - 1){
            System.out.println("Stack is empty");
        }
    }

    public void pop(int value){

    }
    public void top(int value){

    }

    public static void main(String[] args) {
        
        IntegerStack stack = new IntegerStack(size:5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop(30);
    }

}
