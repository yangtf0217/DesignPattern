/**
 * @author yangtengfei
 * @date 2020/3/22 3:51 下午
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
