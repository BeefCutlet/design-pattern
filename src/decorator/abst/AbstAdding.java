package decorator.abst;

import decorator.abst.IBeverage;

public class AbstAdding implements IBeverage {

    private IBeverage base;

    public AbstAdding(final IBeverage base) {
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }
}
