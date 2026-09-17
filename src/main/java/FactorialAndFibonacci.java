import java.util.Scanner;
public class FactorialAndFibonacci {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your desired number: ");
       int number = scanner.nextInt();
       int result = factorial(number);
       System.out.println("Factorial of " + number + " is " + result);
       System.out.print("Fibonacci series: ");
       for(int i = 0; i < 10; i++){
           System.out.print(fibonacci(i) + " ");
       }
       System.out.println();
       scanner.close();


    }
    static int factorial(int number){
        if(number == 0)
        return 1;
        else
        return number * factorial(number-1);
    }
    static int fibonacci(int number){

            // edge cases
            if(number == 0) return 0;
            if(number == 1) return 1;

            int a = 0;
            int b = 1;
            int next = 0;

            for(int i = 2; i <= number; i++){
                next = a + b;   // compute next
                a = b;          // shift a forward
                b = next;       // shift b forward
            }
            return b;   // or next — think about which one!

    }

}
