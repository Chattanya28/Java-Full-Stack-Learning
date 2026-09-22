public class TwoDimensionalArray {
    public static void main(String[] args){
        String[] fruits= {"orange", "apple","mango","guava"};
        String[] colors= {"red", "green", "blue","white"};
        String[] names= {"Shreya","Rohan","Fuloo","Chaitu"};

        String[][] categories= {fruits,colors,names};
        for(String[] category:categories){
            for(String categoryName:category){
                System.out.print(categoryName + " ");
            }
            System.out.println();
        }
    }
}
