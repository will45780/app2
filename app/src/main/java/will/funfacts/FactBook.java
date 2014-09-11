package will.funfacts;

import java.util.Random;

/**
 * Created by User on 22/08/2014.
 */

    public class FactBook {

        //member variables (properties about the object)
        public String[] mFacts = {
                "There are more Barbie dolls in Italy than there are Canadians in Canada.",
                "Christian Bale has played two wealthy people; the good and the bad. Their names were only 1 letter different: Batman and Bateman.",
                "The person who would proof read Hitler's speeches was a grammar Nazi.",
                "It is physically impossible for pigs to look up into the sky.",
                "If you fart consistently for 6 years and 9 months, enough gas is produced to create explosion that is equal to an atomic bomb.",
                "To escape the grip of a crocodile's jaws, push your thumbs into its eyeballs - it will let you go instantly.",
                "In England, the Speaker of the House is not allowed to speak.",
                "Every continent begins and ends in the same letter.",
                "Every continent has a city called Rome.",
                "Two thirds of the world's eggplant is grown in New Jersey.",
                "The electric chair was invented by a dentist.",
                "It's not true that Right handed people live on average nine years longer than left handed people do, correlation from silly study!",
                "The sentence ‘the quick brown fox jumps over the lazy dog’ uses every letter in the English language.",
                "No president of the United States was an only child."
        };


    //method (things the object can do)

        public String getfact() {




            String fact = "";


            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mFacts.length);

            fact = mFacts[randomNumber];
            return fact;


        }
    }


