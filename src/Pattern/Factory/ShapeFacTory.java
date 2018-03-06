package Pattern.Factory;

/**
 * Created by fly on 2018/3/6.
 */
public class ShapeFacTory {

    public Shape getClass(String type) {
        if ("Square".equals(type)) {
            return new Square();
        } else if ("Rectangle".equals(type)) {
            return new Rectangle();
        }
        return null;
    }

    /**
     * 利用反射和多态实现
     */
    public static <T> T getClass(Class<?extends Shape> clazz) {
        T t = null;
        try {
            t = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }
}
