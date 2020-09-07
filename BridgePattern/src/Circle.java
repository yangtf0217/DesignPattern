public class Circle extends Shape{

    int r;

    public Circle(DrawApi drawApi, int r) {
        super(drawApi);
        this.r = r;
    }

    @Override
    void draw() {
        drawApi.drawCircle(r);
    }
}
