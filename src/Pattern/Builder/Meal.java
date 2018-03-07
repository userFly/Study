package Pattern.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fly on 2018/3/7.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.err.print("Item :" + item.name());
            System.err.print(", Packing : " + item.packing().pack());
            System.err.println(", Price : " + item.price());
        }
    }
}
