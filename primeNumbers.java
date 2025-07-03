import java.util.*;
class primeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num <= 1) {
            System.out.println("Enter Valid input i.e. positive integer"); 
        } else {
            int i;
            for(i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    break;
                }
            }
            if(i > num / 2) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}