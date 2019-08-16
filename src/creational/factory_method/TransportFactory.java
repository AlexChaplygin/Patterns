package creational.factory_method;

public class TransportFactory {

    public Transport getTransport(String type) {
        switch (type.toUpperCase()) {
            case "SHIP":
                return new Ship();
            case "CAR":
                return new Car();
        }
        return null;
    }
}
