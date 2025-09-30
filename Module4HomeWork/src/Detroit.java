abstract class VehicleFactory {
    public abstract IVehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    private String brand;
    private String model;
    private String fuelType;
    public CarFactory(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }
    public IVehicle createVehicle() {
        return new Car(brand, model, fuelType);
    }
}
class MotorcycleFactory extends VehicleFactory {
    private String type;
    private int engineCapacity;
    public MotorcycleFactory(String type, int engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }
    public IVehicle createVehicle() {
        return new Motorcycle(type, engineCapacity);
    }
}
class TruckFactory extends VehicleFactory {
    private int loadCapacity;
    private int axes;
    public TruckFactory(int loadCapacity, int axles) {
        this.loadCapacity = loadCapacity;
        this.axes = axles;
    }
    public IVehicle createVehicle() {
        return new Truck(loadCapacity, axes);
    }
}
class BusFactory extends VehicleFactory {
    private int seats;
    private String route;
    public BusFactory(int seats, String route) {
        this.seats = seats;
        this.route = route;
    }
    public IVehicle createVehicle() {
        return new Bus(seats, route);
    }
}