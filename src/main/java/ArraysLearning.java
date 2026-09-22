import java.util.Scanner;

public class ArraysLearning  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6};
        String[] fruits = {"Apple", "Banana", "Orange", "Strawberry"};
        boolean isFound=false;
        String target;

        while(!isFound){
            System.out.println("Enter the fruit: ");
            target = scanner.nextLine();

            for(int i = 0 ; i < fruits.length ; i++){
                if(fruits[i].equals(target)){
                    System.out.println("Element found at index: "+ i);
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                System.out.println("Element not found");
            }
        }
        scanner.close();

    }
}
