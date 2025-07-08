import java.util.*;
class DataClass {
    int intValue;
    float floatValue;
    double doubleValue;
    static String text = "This is static member.";

    public DataClass() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the int value: ");
        intValue = sc.nextInt();
        System.out.print("Enter the float value: ");
        floatValue = sc.nextFloat();
        System.out.print("Enter the double value: ");
        doubleValue = sc.nextDouble();
    }
}

class demo2 {
    public static void main(String[] args) {
        DataClass obj = new DataClass();
        
        // Access and print the three data members
        System.out.println("Integer value: " + obj.intValue);
        System.out.println("Float value: " + obj.floatValue);
        System.out.println("Double value: " + obj.doubleValue);
        System.out.println("String : " + DataClass.text);
    }
}