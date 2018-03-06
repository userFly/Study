package Pattern.Singleton;

public class Singleton {
    private static final Singleton SINGLETON = new Singleton();
    private Integer i = 0;
    //限制产生多个对象
    private Singleton() {}

    //通过该方法获得实例对象
    public static Singleton getSingleton() {
        synchronized(Singleton.class) {
            return SINGLETON;
        }
    }
    //类中其他方法，尽量是static
    public void test() {
        this.i++;
        System.err.println("第" + this.i + "次进入");
    }
}
