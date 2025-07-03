import java.util.*;
class calc{
    public static void main(String args[]){
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter two values i and j : ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        if(a==1){
            System.out.println("Addition of two numbers are : "+(i+j));
        }
        if(a==2){
            System.out.println("Subtraction of two numbers are : "+(i-j));
        }
        if(a==3){
           System.out.println("Multiplication of two numbers are : "+(i*j)); 
        }
        if(a==4){
            System.out.println("Division of two numbers are : "+(i/j));
        }
        
    }
}