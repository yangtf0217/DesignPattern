public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape red = new Circle(new RedCircle(),5);
        Shape green = new Circle(new GreenCircle(),10);

        red.draw();
        green.draw();
    }
}
