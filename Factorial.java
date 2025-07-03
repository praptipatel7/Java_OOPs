import java.util.*;
class Factorial{
	public static void main(String args[]){
	    System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int facto=1;
        for(int i=2 ; i<=n ; i++){
            facto = facto*i;
        }
        System.out.print(facto);
	}
}