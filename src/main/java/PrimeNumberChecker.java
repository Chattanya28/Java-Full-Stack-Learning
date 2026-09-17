public class PrimeNumberChecker {
    public static void main(String[] args){
        int number = -5;
        if(isPrime(number)){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }

    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i= 2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
