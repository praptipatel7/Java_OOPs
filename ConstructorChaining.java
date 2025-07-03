import java.util.*;
class ConstructorChaining{
    private int i, j;
    public ConstructorChaining(){
        this(5);
    }
    public ConstructorChaining(int i){
        this(5,10);
        System.out.print("A = "+ i);
    }
    public ConstructorChaining(int i, int j){
        System.out.println("Continue Chaining");
        System.out.println("B = " + i*j);
    }
    public static void main(String args[]){
     ConstructorChaining obj = new ConstructorChaining();
        
    }   
}