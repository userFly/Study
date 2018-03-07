package Pattern.Builder;

/**
 * Created by fly on 2018/3/7.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
