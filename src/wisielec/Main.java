package wisielec;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        ArrayList<String> wordList = new ArrayList<>(List.of("Ala", "ma", "kota", "xd"));
        Wisielec w = new Wisielec(wordList);
        w.play();
    }
}
