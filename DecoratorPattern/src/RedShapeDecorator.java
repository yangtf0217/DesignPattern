/**
 * @author yangtengfei
 * @date 2020/3/22 8:47 下午
 *
 * 装饰器的具体类 具备Shape的功能外，可以提供其他功能
 *
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        this.otherMethod();
    }

    public void otherMethod() {
        System.out.println("图个红色");
    }
}
