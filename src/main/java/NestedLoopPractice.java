import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) throws InterruptedException {
//        for(int i = 1; i <= 3; i++){
//            for(int j = 1; j<= 10;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the rows: ");
        rows =scanner.nextInt();
        System.out.print("Enter the columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol you wanna use: ");
        symbol = scanner.next().charAt(0);
        for(int i = 0; i < rows; i++){
            for(int j = 0 ; j < columns; j++){
                System.out.print(symbol);
                Thread.sleep(1000);
            }
            System.out.println();
        }
    }
}
