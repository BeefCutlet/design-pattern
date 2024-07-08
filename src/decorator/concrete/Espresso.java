package decorator.concrete;

import decorator.abst.AbstAdding;
import decorator.abst.IBeverage;

public class Espresso extends AbstAdding {

    static protected int espressoCount = 0;

    public Espresso(final IBeverage material) {
        super(material);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + getAddPrice();
    }

    private static int getAddPrice() {
        espressoCount += 1;
        int addPrice = 100;

        if (espressoCount > 1) {
            addPrice = 70;
        }

        return addPrice;
    }
}
