package rocks.zipcode.assessment2.collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
List<String> strings;
Map<String , Integer> map;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strings = strings;
        this.map = new TreeMap<>();
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.map = new TreeMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer amount = 1;
        if (!this.map.containsKey(item)){
            this.map.put(item, amount);
        }
        else {
            this.map.put(item, amount + 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        this.map.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return this.map.get(item);
    }
}
