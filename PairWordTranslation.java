package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

public class PairWordTranslation {
    String wordTranslation;

    public PairWordTranslation(String wordTranslation) {
        this.wordTranslation = wordTranslation;
    }

    public static PairWordTranslation[] writeNewPairs(String content) {
        String[] pairs1 = content.split(";");//делим строку на элементы массива построчно
        int size = pairs1.length;
        PairWordTranslation[] filled = new PairWordTranslation[size];
        int i = 0;
        for ( String n: pairs1) {
            filled[i] = new PairWordTranslation(pairs1[i]);
            i++;
        }
        return filled;
    }
}
