package abstractfactory.type1.gt;

import abstractfactory.type1.abst.BikeFactory;
import abstractfactory.type1.abst.Body;
import abstractfactory.type1.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
