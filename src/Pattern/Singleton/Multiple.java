package Pattern.Singleton;

/**
 * Created by fly on 2018/3/6.
 */
public class Multiple {
    private Integer i = 0;
    public void test() {
        this.i++;
        System.err.println("第" + this.i + "次进入");
    }
}
