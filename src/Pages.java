import java.util.InputMismatchException;
import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minPages;
        int age = -1;
        boolean validAnswer = false;
        System.out.println("There is a folk rule stating the number of pages you should read before giving up on a book is 100 - your age. Do you want to know how many pages you should read?\nThen enter your age below:");
        while (!validAnswer) {
            try{
                age = scanner.nextInt();
                if (age > 0) {
                    validAnswer = true;
                }
                /*else {
                    System.out.println("Please input a valid age.");
                    scanner.nextLine();
                }*/
                throw new InputMismatchException();
            }
            catch (InputMismatchException e) {
                System.out.println("Please input a valid age.");
                scanner.nextLine();
            }

        }
        if (age > 100) {
            System.out.println("Your age exceeds 100. That means, you are either:\n1. Very old\n2. Trolling me.\nEither way, you're probably too illiterate to read a book.");
        }
        else {
            minPages = 100 - age;
            System.out.println(age + " year olds should read at least " + minPages + " pages before giving up on a book");
        }
    }
}
