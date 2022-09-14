package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WordMemoriseApp {
//    private static Object Exception;
    private static int quantity;

    public static void training() throws IOException, MyException {
        Path textWithNewVocabulary
                = Path.of("src/PolishedTasksOneByOne/EqualsHashCodeAndToString/wordMemoriser/Text");
        // Now calling Files.readString() method to
        // read the file
        String content = Files.readString(textWithNewVocabulary);
        PairWordTranslation[] filled1 = PairWordTranslation.writeNewPairs(content);
        filled1 = Mixer.smash(filled1);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to repeat now?");
        try {
            quantity = Integer.parseInt(sc.nextLine());
            if (quantity > filled1.length) {
                throw new MyException("Max number of words is " + filled1.length);
            }
            if (quantity == 0) {
                throw new MyException ("The number can't be equal to zero");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            if (quantity != 0 || quantity < filled1.length) {
                printWordsGetResults(filled1);
            } else {
                quantity = filled1.length;
                printWordsGetResults(filled1);
            }
        }
    }

    private static void printWordsGetResults(PairWordTranslation[] filled1) {
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

    public static void main (String[]args) throws IOException, MyException {
            training();
        }
    }




