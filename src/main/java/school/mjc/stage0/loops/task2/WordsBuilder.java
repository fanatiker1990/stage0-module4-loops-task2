package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String stroka = "";
        while (counter < chars.length) {
            stroka += chars[counter++];

        }
        System.out.print(stroka);
    }

}
