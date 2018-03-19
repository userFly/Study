package Pattern.Strategy;

/**
 * Created by fly on 2018/3/19.
 */
public class Test {
    public static void main(String[] args) {
        Test1 t = null;
        t = new Test1(new Add());
        System.err.println(t.aaa(1, 2));
        t = new Test1(new Sub());
        System.err.println(t.aaa(1, 2));
    }
}
