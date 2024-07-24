package abstractfactory.type1.sam;

import abstractfactory.type1.abst.BikeFactory;
import abstractfactory.type1.abst.Body;
import abstractfactory.type1.abst.Wheel;

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
