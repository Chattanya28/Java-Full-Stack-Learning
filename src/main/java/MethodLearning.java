public class MethodLearning {
    public static void main(String[] args){
//        String name = "Shreya";
//
//        happyBirthdayMethod(name);
//        System.out.println(squarenumber(5));
//        System.out.println(getFullname("Rohan","Chaurasiya"));
        int age = 8;
        if(ageVerification(age)){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You have to attain an age of 18+ for verification.");
        }
    }
    static void happyBirthdayMethod(String nickname){
        System.out.printf("You are beautifull %s!\n", nickname);
        System.out.println("You are gorgeous");
        System.out.println("You are magnificant");
    }
    static double squarenumber(double number){
        return number * number;
    }
    static String getFullname(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static boolean ageVerification(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
