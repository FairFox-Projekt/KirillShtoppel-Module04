abstract class TransportFactory {
    public abstract ITransport createTransport();
}

class CarFactory extends TransportFactory {
    public ITransport createTransport() {
        return new Car();
    }
}
class MotorcycleFactory extends TransportFactory {
    public ITransport createTransport() {
        return new Motorcycle();
    }
}
class PlaneFactory extends TransportFactory {
    public ITransport createTransport() {
        return new Plane();
    }
}
class BikeFactory extends TransportFactory {
    public ITransport createTransport() {
        return new Bike();
    }
}