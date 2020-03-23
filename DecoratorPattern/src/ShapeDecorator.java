/**
 * @author yangtengfei
 * @date 2020/3/22 8:44 下午
 *
 *
 * Shape的抽象装饰类  具备Shape的功能
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

}
