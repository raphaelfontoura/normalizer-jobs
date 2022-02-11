import core.Normaliser;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Normaliser normaliser = new Normaliser();
        while (true) {
            System.out.println("Enter de job title (or q to quit)");
            var jobInput = scanner.next();
            if (jobInput.equalsIgnoreCase("q")) break;
            var result = normaliser.normalise(jobInput);
            System.out.println("The normalized job is " + result);
        }
    }
}
