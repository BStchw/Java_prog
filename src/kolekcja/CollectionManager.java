package kolekcja;
import java.util.*;

public class CollectionManager<T> {
    private List<T> collection;

    public CollectionManager() {
        collection = new LinkedList<>();
    }

    public void addItem(T item) throws DuplicateItemException {
        if (collection.contains(item)) {
            throw new DuplicateItemException("Obiekt już istnieje w kolekcji.");
        }
        collection.add(item);
    }

    public void removeItem(T item) throws ItemNotFoundException {
        if (!collection.contains(item)) {
            throw new ItemNotFoundException("Obiekt nie został znaleziony w kolekcji.");
        }
        collection.remove(item);
    }

    public List<T> getAllItems() {
        return new LinkedList<>(collection);
    }
}

