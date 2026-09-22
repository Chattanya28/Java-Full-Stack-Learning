public class VariableArguements {
    public static void main(String[] args){
        System.out.println(add(1,2,3,4));
        System.out.println(avg(5,6,7,9));
        System.out.println(avg());
    }
    static int add(int... numbers){ //here we use three dots (...) this is called ellipses and this method is called variable arguement.
        System.out.println(numbers);
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
    static double avg(double ... numbers){
        double sum =0;
        if(numbers.length==0){
            return 0;
        }
        for(double number : numbers){
            sum += number;

        }
        return sum/numbers.length;
    }
}

