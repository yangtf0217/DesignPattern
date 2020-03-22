/**
 * @author yangtengfei
 * @date 2020/3/22 3:47 下午
 *
 * 汉堡
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
