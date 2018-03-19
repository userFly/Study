package Pattern.Prototype;

import java.util.Hashtable;

/**
 * Created by fly on 2018/3/19.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangele rectangle = new Rectangele();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
