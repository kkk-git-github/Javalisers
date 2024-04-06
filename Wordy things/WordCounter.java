import java.util.Scanner;

public class WordCounter {
    
    public static int Resolver(String paragraph) {
        int counter = 0;
        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter + 1;
    }
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println("Word Counter");
        System.out.println("Enter your paragraph");
        try (Scanner sc = new Scanner(System.in)) {
            String paragraph = sc.nextLine();
            int numWords = Resolver(paragraph);
            System.out.println("The total number of words in your paragraph is " + numWords);
        }

    }
}
