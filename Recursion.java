
package recursion;

import java.util.Scanner;
public class Recursion {

    
    public static void main(String[] args) {
        int number;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number you want:");
        number = num.nextInt();
        System.out.print(number+"! = ");
        System.out.println(factorial(number));
    }
    public static int factorial(int N){
        if(N<=1){
            return 1;
        }else {
            return(N*factorial (N-1));
        }
    }
    
}
