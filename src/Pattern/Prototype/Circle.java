package Pattern.Prototype;

/**
 * Created by fly on 2018/3/19.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.err.println("Inside Circle::draw() method.");
    }
}
