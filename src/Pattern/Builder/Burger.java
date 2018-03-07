package Pattern.Builder;

/**
 * Created by fly on 2018/3/7.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
