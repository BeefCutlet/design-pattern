package decorator.concrete;

import decorator.abst.AbstAdding;
import decorator.abst.IBeverage;

public class Milk extends AbstAdding {

    public Milk(final IBeverage material) {
        super(material);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }
}
