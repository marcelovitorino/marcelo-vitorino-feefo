package normaliser;

import java.util.Scanner;
import java.util.logging.Logger;


import normaliser.manager.Normaliser;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Normaliser object
        Normaliser normaliser = new Normaliser();

        // Prompt the user to enter a job title
        logger.info("Enter a job title: ");
        String jobTitle = scanner.nextLine();

        // Normalize the input job title
        String normalizedTitle = normaliser.normalise(jobTitle);

        // Print the normalized job title
        logger.info("Normalized title: " + normalizedTitle);

        // Close the scanner
        scanner.close();
    }
}
