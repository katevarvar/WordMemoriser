package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

import java.util.Arrays;
import java.util.Random;

public class Mixer {
        public static PairWordTranslation[] smash(PairWordTranslation[] filled) {
            Random rand = new Random();
            for (int i = 0; i < filled.length; i++) {
                int randomIndexToSwap = rand.nextInt(filled.length);
                PairWordTranslation temp = filled[randomIndexToSwap];
                filled[randomIndexToSwap] = filled[i];
                filled[i] = temp;
            }
            System.out.println(Arrays.toString(filled));
            return filled;
        }
    }


