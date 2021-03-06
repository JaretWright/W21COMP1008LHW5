import java.util.ArrayList;

public class Purchases {
    private ArrayList<GroceryItem> purchases;

    public Purchases() {
        this.purchases = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem item)
    {
        purchases.add(item);
    }

    public double getTotalPrice()
    {
        double total = 0;
        for (GroceryItem groceryItem : purchases)
        {
            total += groceryItem.getPrice();
        }
        return total;
    }

    public String getGroceryNames()
    {
        String groceries = "";
        for (GroceryItem groceryItem:purchases)
        {
            groceries += groceryItem.getName() + ", ";
        }
        return groceries.substring(0,groceries.length()-2);
    }

    public String getCategories()
    {
        String groceries = "";
        for (GroceryItem groceryItem:purchases)
        {
            groceries += groceryItem.getCategory() + ", ";
        }
        return groceries.substring(0,groceries.length()-2);
    }

    public String toString()
    {
        return String.format("The grocery list has %d items with a total cost of $%.2f",
                            purchases.size(), getTotalPrice());
    }

}
