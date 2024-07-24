package abstractfactory.type1;

import abstractfactory.type1.abst.BikeFactory;
import abstractfactory.type1.abst.Body;
import abstractfactory.type1.abst.Wheel;
import abstractfactory.type1.sam.SamFactory;

public class Main {

    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println("body: " + body.getClass());
        System.out.println("wheel: " + wheel.getClass());
    }
}
