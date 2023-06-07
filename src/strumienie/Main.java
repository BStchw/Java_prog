package strumienie;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args)  {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Pen", "School", 2));
        list.add(new Product("Bread", "Food", 5));
        list.add(new Product("Water 1L", "Food", 3));
        list.add(new Product("Soap", "Bathroom", 5));
        list.add(new Product("Jacket", "Clothes", 68));
        list.add(new Product("Hat", "Clothes", 20));

        Map<String, Double> categoryAvarage = list.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

        List<Map.Entry<String, Double>> sortedCategory = categoryAvarage.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());

        for (Map.Entry<String, Double> entry : sortedCategory) {
            System.out.println("Category: " + entry.getKey() + ", Avarage: " + entry.getValue());
        }
    }
}
