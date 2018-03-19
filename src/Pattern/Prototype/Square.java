package Pattern.Prototype;

/**
 * Created by fly on 2018/3/19.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.err.println("Inside Square::draw() method.");
    }
}
