package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

import java.util.Arrays;
import java.util.Random;

//In Java, Singleton is a design pattern that ensures that a class can only have one object.
//        To create a singleton class, a class must implement the following properties:
//
//        Create a private constructor of the class to restrict object creation outside of the class.
//        Create a private attribute of the class type that refers to the single object.
//        Create a public static method that allows us to create and access the object we created. Inside the method, we will create a condition that restricts us from creating more than one object.

 class Mixer {
     private static Mixer MixerObject;
     private Mixer() {
     }

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


