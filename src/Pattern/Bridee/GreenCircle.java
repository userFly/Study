package Pattern.Bridee;

/**
 * Created by fly on 2018/3/19.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.err.println("Drawing Circle[ color : green, radius" + radius
                + ", x:" + x +", y:" + y + "]");
    }
}
