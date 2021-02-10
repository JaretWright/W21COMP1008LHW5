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
}
