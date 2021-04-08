package JavaBasics;

import java.util.Locale;

public class CountOfVowelsAndConsonants {
    public static void main(String[] args) {

        //Counter variable to store the count of vowels and consonant
        int vcount=0,ccount=0,i;
        //Declare a string
        String str ="chandu prathi yasu";
        //Converting entire string to lower case to reduce the comparisons
        str=str.toLowerCase();
        for (i=0;i<str.length();i++) {
            //Checks whether a character is a vowel
            if (str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'|| str.charAt(i) == 'u')
            {

                //Increments the vowel counter
                vcount++;
            }
            else
                {
                    //Increments the consonant counter
                ccount++;
               }
        }
        System.out.println(vcount);
        System.out.println(ccount);

        }

    }

