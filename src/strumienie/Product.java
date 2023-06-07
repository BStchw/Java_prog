package strumienie;

public class Product {
    String name;
    String category;
    int price;

    Product(String name, String category, int price)    {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
