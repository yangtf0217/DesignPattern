/**
 * 桥接实现类
 */
public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int r) {
        System.out.println("Circle color: Green 半径："+r);
    }
}
