package kolekcja;
import java.util.*;

public class Main {
    public static void main(String[] args) throws DuplicateItemException, ItemNotFoundException {
        CollectionManager collectionManager = new CollectionManager<>();
        String s1 = "Ala";
        String s2 = "ma";
        String s3 = "kota";
        String s4 = "nie";

        collectionManager.addItem(s1);
        collectionManager.addItem(s2);
        collectionManager.addItem(s3);
        collectionManager.addItem(s4);

        collectionManager.removeItem(s4);

        LinkedList<String> items = (LinkedList<String>) collectionManager.getAllItems();

        System.out.println(items.toString());
    }
}
