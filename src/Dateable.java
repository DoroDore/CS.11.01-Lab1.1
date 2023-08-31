import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float minDateAge;
        System.out.println("Would you like to know what's the lowest age you can date someone according to folk rules?\nThen enter your age below:");
        double age = scanner.nextDouble();
        minDateAge = (float) (age/2+7);
        System.out.println(age + " year olds should date somebody who is at least " + minDateAge + " years old");
    }
}
