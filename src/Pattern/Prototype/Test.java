package Pattern.Prototype;

/**
 * Created by fly on 2018/3/19.
 */
public class Test {
    public static void main(String[] args) {
        SuperField sup = new SubField();
        System.err.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        SubField sub = new SubField();
        System.err.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() +
                ", sub.getSuperField() = " + sub.getSuperField());
    }
}
class SuperField {
    public static int field = 1;

    public int getField() {
        return field;
    }
}
class SubField extends SuperField {
    int field = 2;

    public int getField() {
        return field;
    }
    public int getSuperField() {
        return super.field;
    }
}

