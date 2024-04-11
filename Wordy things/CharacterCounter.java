import java.util.Scanner;

public class CharacterCounter {
    public static int CharacterCounterParagraphEscapedSpace(String paragraph) {
        int i = 0;
        int characters = 0;
        while (i < paragraph.length()) {
            if (paragraph.charAt(i)!=' ') {
                characters++;
            }
            i++;
        }
        return characters;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            String paragraph = sc.nextLine();
            int Counter = CharacterCounterParagraphEscapedSpace(paragraph) + WordCounter.Resolver(paragraph)-1;
            System.out.println(Counter);
        }
    }
}
