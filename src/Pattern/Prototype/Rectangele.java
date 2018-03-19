package Pattern.Prototype;

import Pattern.Factory.Rectangle;

/**
 * Created by fly on 2018/3/19.
 */
public class Rectangele extends Shape{

    @Override
    public void draw() {
        System.err.println("Inside Rectangle::draw() method.");
    }

    public Rectangele() {
        type = "Rectangle";
    }
}
