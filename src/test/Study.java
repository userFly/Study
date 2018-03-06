package test;

public class Study {

    private static final Study study = new Study();
    //限制产生多个对象
    private Study(){
    }
    //通过该方法获得实例对象
    public static Study getSingleton(){
        return study;
    }
    //类中其他方法，尽量是static
    public static void doSomething(){
    }
}
