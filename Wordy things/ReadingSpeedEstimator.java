import java.util.Scanner;


public class ReadingSpeedEstimator {
    public static double ReadingSpeedEstimatorFunction(String paragraph, int expectedReadingSpeed) {
        WordCounter WCHolder = new WordCounter();
        int numWords = WCHolder.Resolver(paragraph);
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
                int expectedReadingSpeed = sc2.nextInt();
                double readingTime = ReadingSpeedEstimatorFunction(paragraph, expectedReadingSpeed);
                System.out.println("(Percise) Estimated reading time: " + readingTime + " seconds");
                int unprecisionReadingTime = (int) readingTime;
                int minutes = (int)(unprecisionReadingTime / 60);
                System.out.println("Estimated reading time in minutes: " + minutes);
            }
        }

    }
}
