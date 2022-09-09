package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

public class PairWordTranslation {
        String wordTranslation;
        String word;
        String translation;

    public PairWordTranslation(String wordTranslation) {
        this.wordTranslation = wordTranslation;
        this.word = wordTranslation.substring(0, wordTranslation.indexOf("-"));
        this.translation = wordTranslation.substring(wordTranslation.indexOf("-") + 2,  wordTranslation.length());
    }

    public static PairWordTranslation[] writeNewPairs(String content) {
            String[] pairs1 = content.split("\n");//делим строку на элементы массива построчно
            int size = pairs1.length;
            PairWordTranslation[] filled = new PairWordTranslation[size];
            for ( int i = 0; i < size; i++ ) {
                filled[i] = new PairWordTranslation(pairs1[i]);
            }
            return filled;
        }
    }

