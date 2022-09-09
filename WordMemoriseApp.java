package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WordMemoriseApp {
    public static void training() throws IOException {
        Path textWithNewVocabulary
                = Path.of("src/PolishedTasksOneByOne/EqualsHashCodeAndToString/wordMemoriser/Text");
        // Now calling Files.readString() method to
        // read the file
        String content = Files.readString(textWithNewVocabulary);
        PairWordTranslation[] filled1 = PairWordTranslation.writeNewPairs(content);
        filled1 = Mixer.smash(filled1);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to repeat now?");
        int quantity =  Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            if (i % 2 == 0) {
                System.out.println("\n" + filled1[i].word);
            } else {
                System.out.println("\n" + filled1[i].translation);
            }
            Scanner userTranslation = new Scanner(System.in);
            System.out.println("Your translation:  " + userTranslation.nextLine());
            System.out.println("Check:" + filled1[i].wordTranslation);
        }
    }

    public static void main(String[] args) throws IOException {
        WordMemoriseApp.training();
    }
}




