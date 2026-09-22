import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        String[] questions = {"What is ip stands for",
                "Localhost address is?",
                "What is the main function of router",
                "Which part of the computer is considered the brain",
                "What year was Facebook launched?",
                "Who is known as the father of computer",
                "Who first right the bit system",
                "Who first design ip address?"};

        String[][] options = {
                // Q1: What is IP stands for
                { "Internet Protocol", "Internal Process", "Internet Provider", "Input Port" },

                // Q2: Localhost address is
                { "192.168.0.1", "127.0.0.1", "10.0.0.1", "255.255.255.0" },

                // Q3: Main function of router
                { "Store files", "Route data between networks", "Print documents", "Cool the CPU" },

                // Q4: Brain of the computer
                { "RAM", "Hard Disk", "CPU", "GPU" },

                // Q5: Facebook launched year
                { "2002", "2004", "2006", "2008" },

                // Q6: Father of computer
                { "Alan Turing", "Charles Babbage", "Bill Gates", "Steve Jobs" },

                // Q7: First wrote bit system
                { "Claude Shannon", "Alan Turing", "John von Neumann", "Tim Berners-Lee" },

                // Q8: First designed IP address
                { "Tim Berners-Lee", "Vint Cerf", "Linus Torvalds", "Dennis Ritchie" }
        };
        int[] answer= { 0, 1, 1, 2, 1, 1, 0, 1 };
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("____________________");
        System.out.println("Let's Play the quiz");
        System.out.println("____________________");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option :  options[i]){
                System.out.println(option);
            }
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            if(guess==answer[i]){
                System.out.println("Congratulations! You guessed correctly!");
                score++;
            }
            else{
                System.out.println("Wrong guess!");
            }

        }
        System.out.println("The score is " + score);
        scanner.close();

    }
}
