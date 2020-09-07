/**
 * 桥接实现类
 */
public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int r) {
        System.out.println("Circle color: Red 半径："+r);
    }
}
