package Pattern.Factory;

/**
 * Created by fly on 2018/3/6.
 */
public class Test {

    public static void main(String[] args) {
        ShapeFacTory sf = new ShapeFacTory();
        Shape s1 = sf.getClass("Square");
        Shape s2 = sf.getClass("Rectangle");
        s1.draw();
        s2.draw();

        Rectangle r = ShapeFacTory.getClass(Rectangle.class);
        Square a = ShapeFacTory.getClass(Square.class);
        r.draw();
        a.draw();
    }
}
