import java.util.ArrayList;
import java.util.List;

/**
 * @author yangtengfei
 * @date 2020/3/22 3:55 下午
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public double getCost(){
        double cost = 0.0d;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : itemList) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
