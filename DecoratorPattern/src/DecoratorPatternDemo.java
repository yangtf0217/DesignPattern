/**
 * @author yangtengfei
 * @date 2020/3/22 8:50 下午
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        ShapeDecorator circleShapeDecorator = new RedShapeDecorator(new Circle());
        circleShapeDecorator.draw();

        System.out.println("----------");

        ShapeDecorator rectangleShapeDecorator = new RedShapeDecorator(new Rectangle());
        rectangleShapeDecorator.draw();
    }
}
