import java.util.*;
class demo1{
    int EmpID;
    double salary;
    String name, depart;
    static int count=0;

    public demo1(){
        this(0,"Unknown", "Unknown", 0.0);
        System.out.println("defult constructor called");
    }
    public demo1(int id, String name) {
        this(id, name, "Unknown", 0.0);
        System.out.println("constructor with 2 parameters called");
    }
    public demo1(int EmpID, String name, String depart, double salary){
        this.EmpID = EmpID;
        this.name = name;
        this.depart = depart;
        this.salary = salary;
        count++;
        System.out.println("constructor with 4 parameters called");
    }
    public void display() {
        System.out.println("====================================");
        System.out.println("ID: " + this.EmpID);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.depart);
        System.out.println("Salary: " + this.salary);
        System.out.println("====================================");
    }
    public static void main(String[] args) {
        demo1 e1 = new demo1();
        demo1 e2 = new demo1(101, "Alice");
        demo1 e3 = new demo1(102, "Bob", "HR", 50000);
        e1.display();
        e2.display();
        e3.display();
        System.out.println("Total employees created: " + demo1.count);
    }
}