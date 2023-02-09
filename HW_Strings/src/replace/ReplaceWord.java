package replace;

import java.util.Arrays;

public class ReplaceWord {
    public ReplaceWord() {
    }

    public void replaceWordInString(String sentence, String replace, String whatFind){

        System.out.println(sentence.replace(whatFind,replace));










        /*

        String[] countIn = sentence.split();

        int i = 0;
        for (String s : countIn) {
            StringBuffer buffer = new StringBuffer(s);
            String word = String.valueOf(buffer);
            i++;
            if (i % 2 == 0){
                System.out.println("замена");
            }

        }
        System.out.println(i);

         */
    }
}
