package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

import java.util.Scanner;
public class WordMemoriseApp {
    String content;
    int[] counter;

    public void setContent(String content) {
        this.content = content; //конструктор
    }

    public static Pairs[] writeNewPairs(String content) {
        String[] pairs1 = content.split("/n");//делим строку на элементы массива построчно
        int size = pairs1.length;
        Pairs[] filled = new Pairs[size];
        int i = 0;
        for (Pairs n: filled) {
            filled[i].wordTranslation = pairs1[i];
            filled[i].numbers = i;
            i++;
        }
        return filled;
    }

    public static void training(String content) {
        Pairs[] filled = writeNewPairs(content);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to repeat now?");
        int quantity =  Integer.parseInt(sc.nextLine());
        System.out.println("");
        for (int i = 0; i < quantity; i++) {
            int first = filled[i].wordTranslation.indexOf("-");
            int end = filled[i].wordTranslation.indexOf("\n");
            if (i % 2 == 0) {
                System.out.println(filled[i].wordTranslation.substring(0, first));
            } else {
                System.out.println(filled[i].wordTranslation.substring(first, end));
            }
            Scanner userTranslation = new Scanner(System.in);
            System.out.println("Your translation" + userTranslation.nextLine());
            System.out.println("Check:" + filled[i].wordTranslation);
        }
    }

    public static void main(String[] args) {
        String content = "somehow - как_нибудь\n" +
                "boring - скучный\n" +
                "to_bother - беспокоить_отвлекать\n" +
                "to_annoy - раздражать\n" +
                "to_worry - переживать\n" +
                "domestic_violence - домашнее_насилие\n" +
                "yet - еще_(все_еще)\n" +
                "despite - не_смотря_на\n" +
                "consider - по_поводу_учитывать\n" +
                "consequence - последовательность_следствие_псследствие\n" +
                "survey - опрос_исследование\n" +
                "attitude - отношение_поведение\n" +
                "indifference - безразличие\n" +
                "justifable - оправдываемый_законный_позволительный\n" +
                "to_be_used_to - быть_привыкшим_к_чему_либо\n" +
                "to_get_used_to - привыкнуть_к_чему-либо\n" +
                "to_disclose - раскрыть_разоблачить\n" +
                "to_offence - оскорблять\n" +
                "however - однако_как_бы_то_ни_было\n" +
                "fair - честный\n";
        WordMemoriseApp.training(content);
    }
}



