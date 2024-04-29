package midterm.tatia_iosebashvili_1.task3;

import java.util.ArrayList;
import java.util.List;

public class VMMS {
    private List<Vegetable> storage = new ArrayList<Vegetable>();
    // adds the vegetable to the online market
    public void addVegetable(Vegetable vegetable) {
        storage.add(vegetable);
    }
    // removes the vegetable from the market
    public boolean removeVegetable(Vegetable vegetable) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Vegetable v = storage.get(i);
            if (v.getName().equals(vegetable.getName()) && v.getPrice().equals(vegetable.getPrice())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }
    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for(Vegetable v: storage) {
                System.out.println(v.getPrice() + ", " + v.getName());
                System.out.println();
            }
        }
    }

}
