package creational.factory_method.test;

import creational.factory_method.Transport;
import creational.factory_method.TransportFactory;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void test() {
        TransportFactory transportFactory = new TransportFactory();
        Transport transportCar = transportFactory.getTransport("Car");
        Transport transportShip = transportFactory.getTransport("Ship");

        transportCar.deliver();
        transportShip.deliver();
    }
}
