import java.util.Scanner;

public class WordCounter {
    

    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println("Word Counter");
        System.out.println("Enter your paragraph");
        int counter = 0;
        try (Scanner sc = new Scanner(System.in)) {
            String paragraph = sc.nextLine();
            for (int i = 0; i < paragraph.length(); i++) {
                if (paragraph.charAt(i) == ' ') {
                    counter++;
                }
            }
        }
        System.out.println("The total number of words in your paragraph is " + (counter + 1));
    }
}
