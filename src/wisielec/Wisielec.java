package wisielec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.*;
import java.util.Scanner;

public class Wisielec {
    ArrayList<String> words;
    String randomWord;
    String hiddenWord;

    Wisielec(ArrayList<String> words)   {
        this.words = words;
        this.randomWord = getRandomElement();
        this.hiddenWord = getHiddenWord();;
    }
    public String getHiddenWord() {
        hiddenWord = "";

        for (int i = 0; i < randomWord.length(); i++) {
            hiddenWord = hiddenWord + "_";
        }
        return hiddenWord;
    }

    public String getRandomElement()    {
        Random randomGenerator = new Random();
        int randomIndex = randomGenerator.nextInt(words.size());

        return words.get(randomIndex);
    }
    public boolean checkLetter(char letter)   {
        boolean isInWord = false;
        for(char l: randomWord.toCharArray()) {
            if(letter==l)   {
                isInWord = true;
                break;
            }
        }
        return isInWord;
    }
    public void updateWord(char letter)  {
        for (int i = 0; i < randomWord.length(); i++) {
            if(randomWord.charAt(i) == letter && hiddenWord.charAt(i) == '_')   {
                char[] arrayHidden = hiddenWord.toCharArray();
                arrayHidden[i] = letter;
                System.out.println();
                hiddenWord = new String(arrayHidden);
            }
        }
    }
    public boolean checkIfComplete() {
        for (int i = 0; i < hiddenWord.length(); i++) {
            if(hiddenWord.charAt(i) == '_') {
                return false;
            }
        }
        return true;
    }

    public void play()  {
        int counter = 9;

        while(true)    {
            System.out.println("Oto słowo: " + hiddenWord);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę podaj literę: ");
            String l = scanner.next();

            if (l.length() > 1) {
                System.out.println("Musisz podać tylko jedną literę!");
                continue;
            }

            boolean contains = checkLetter(l.charAt(0));
            if(contains == true) {
                System.out.println("Udało się!");
                updateWord(l.charAt(0));
                if(checkIfComplete() == true) {
                    System.out.println("Wygrałeś!");
                    break;
                }
            }
            else {
                counter--;
                if(counter == 0)    {
                    System.out.println("Niestety przegrałeś");
                    break;
                }
                System.out.println("Źle!");
                System.out.println("Zostało Ci " + counter + " prób!");
            }


        }
    }




}
