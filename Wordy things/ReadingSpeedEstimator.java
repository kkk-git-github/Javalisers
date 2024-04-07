import java.util.Scanner;


public class ReadingSpeedEstimator {
    public static double ReadingSpeedEstimatorFunction(String paragraph, double expectedReadingSpeed) {
        int numWords = WordCounter.Resolver(paragraph);
        double readingTime = numWords / expectedReadingSpeed;
        return readingTime;
    }

    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println("Enter your paragraph");
        try (Scanner sc = new Scanner(System.in)) {
            String paragraph = sc.nextLine();
            System.out.println("Enter your expected reading speed (WPS): ");
            try (Scanner sc2 = new Scanner(System.in)) {
                double expectedReadingSpeed = sc2.nextDouble();
                double readingTime = ReadingSpeedEstimatorFunction(paragraph, expectedReadingSpeed);
                System.out.println("(Percise) Estimated reading time: " + readingTime + " seconds");
                int minutes = (int)(readingTime / 60);
                System.out.println("Estimated reading time in minutes: " + minutes);
            }
        }

    }
}
