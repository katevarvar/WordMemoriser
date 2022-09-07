package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

import java.util.Scanner;

public class WordMemoriseApp {

    public static void training(String content) {
        PairWordTranslation[] filled1 = PairWordTranslation.writeNewPairs(content);
        filled1 = Mixer.smash(filled1);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to repeat now?");
        int quantity =  Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            int first = filled1[i].wordTranslation.indexOf("-");
            int end = filled1[i].wordTranslation.indexOf(";") + 1;
            if (i % 2 == 0) {
                System.out.println("\n" + filled1[i].wordTranslation.substring(0, first));
            } else {
                System.out.println("\n" + filled1[i].wordTranslation.substring(first + 2 , filled1[i].wordTranslation.length()));
            }
            Scanner userTranslation = new Scanner(System.in);
            System.out.println("Your translation:  " + userTranslation.nextLine());
            System.out.println("Check:" + filled1[i].wordTranslation);
        }
    }

    public static void main(String[] args) {
        String content = """
                somehow - как нибудь;
                boring - скучный;
                to bother - беспокоить отвлекать;
                to annoy - раздражать;
                to_worry - переживать;
                domestic violence - домашнее_насилие;
                yet - еще (все еще);
                despite - не смотря на;
                consider - по поводу учитывать;
                consequence - последовательность следствие псследствие;
                survey - опрос исследование;
                attitude - отношение поведение;
                indifference - безразличие;
                justifiable - оправдываемый, законный, позволительный;
                to be used to - быть привыкшим к чему_либо;
                to get used to - привыкнуть к чему_либо;
                to disclose - раскрыть разоблачить;
                to offence - оскорблять;
                however - однако, как бы то ни было;
                fair - честный; """
                ;
        WordMemoriseApp.training(content);
    }
}



