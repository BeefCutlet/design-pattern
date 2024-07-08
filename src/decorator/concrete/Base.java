package decorator.concrete;

import decorator.abst.IBeverage;

public class Base implements IBeverage {
    @Override
    public int getTotalPrice() {
        return 0;
    }
}
