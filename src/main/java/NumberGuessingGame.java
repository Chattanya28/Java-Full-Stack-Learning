
import java.util.Scanner;


class NumberGuessingGame {
    public static void main(String[] args) throws InterruptedException{
       Scanner scanner = new Scanner(System.in);
        System.out.println("Choose you countdown number?");
        int start = scanner.nextInt();
        for(int i = start; i> 0;i--){
            if(i == 3){
                continue;
            }
            System.out.println(i);
            Thread.sleep(900);
        }
        System.out.println("Tada Happy wednesday ");



    }
}
