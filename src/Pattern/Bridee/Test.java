package Pattern.Bridee;

/**
 * Created by fly on 2018/3/19.
 */
public class Test {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
