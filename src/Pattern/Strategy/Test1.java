package Pattern.Strategy;

import Pattern.Adapter.Test;

/**
 * Created by fly on 2018/3/19.
 */
public class Test1 {
    private Calculation calculation;
    public Test1(Calculation _calculation) {
        this.calculation = _calculation;
    }

    public int aaa(int a, int b) {
        return this.calculation.exec(a, b);
    }
}
