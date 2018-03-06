package Pattern.Singleton;

/**
 * Created by fly on 2018/3/6.
 */
public class Test {
    public static void main(String[] args){
        Singleton singleton =  Singleton.getSingleton();
        singleton.test();
        Singleton singleton1 =  Singleton.getSingleton();
        singleton1.test();

        Multiple multiple = new Multiple();
        multiple.test();
        multiple.test();
        Multiple multiple1 = new Multiple();
        multiple1.test();
        multiple1.test();
    }
}
