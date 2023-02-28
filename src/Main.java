import java.util.Random;
import java.util.Scanner;
public class Main {

    private static String SayiBulma(int randomSayi){
        while (true) {
            String message = ".";
            Scanner myObj = new Scanner(System.in);
            System.out.println("Guess my number: ");
            String typedNumber = myObj.nextLine();
            int guessedNumber = Integer.parseInt(typedNumber);
            if (guessedNumber != randomSayi) {
                if (guessedNumber > randomSayi) {
                    message = "try guessing a lower number";
                } else if (guessedNumber < randomSayi) {
                    message = "try guessing a higher number";
                }
            } else if (guessedNumber == randomSayi) {
                var endMessage = ("Well done! You guessed my number!: " + randomSayi);
                return (endMessage);
            }

            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        System.out.println("Hello there! Welcome to my game called 'Guess my number'! Try to guess the number which is between 1 and 100 ");
        System.out.println(SayiBulma(answer));
    }
}