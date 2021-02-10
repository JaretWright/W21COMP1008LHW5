import java.util.Arrays;
import java.util.List;

public class GroceryItem {
    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("name must have at least 2 characters");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=0 && price<=150)
            this.price = price;
        else
            throw new IllegalArgumentException("price must be 0-150");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        List<String> categories = Arrays.asList("vegetable","fruit","meat","fish","dairy","bread",
                                                   "condiments");
        if (categories.contains(category.toLowerCase()))
            this.category = category;
        else
            throw new IllegalArgumentException(category + " is not valid. Use one of :"+categories);
    }

    public String toString()
    {
        return String.format("%s, category: %s, price: $%.2f",name,category,price);
    }
}
