package Pattern.Strategy;

/**
 * Created by fly on 2018/3/19.
 */
public class Sub implements Calculation {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
