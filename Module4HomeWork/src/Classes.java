interface IVehicle {
    void drive();
    void refuel();
}

class Car implements IVehicle {
    private String brand;
    private String model;
    private String fuelType;
    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }
    public void drive() {
        System.out.println("Vroom-Vroom on " + brand + " " + model);
    }
    public void refuel() {
        System.out.println("Refueling car with " + fuelType);
    }
}
class Motorcycle implements IVehicle {
    private String type;
    private int engineCapacity;
    public Motorcycle(String type, int engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }
    public void drive() {
        System.out.println("Vroom-Vroom " + type + " motorcycle with " + engineCapacity + "engine");
    }
    public void refuel() {
        System.out.println("Refueling motorcycle");
    }
}
class Truck implements IVehicle {
    private int loadCapacity;
    private int axes;
    public Truck(int loadCapacity, int axles) {
        this.loadCapacity = loadCapacity;
        this.axes = axes;
    }
    public void drive() {
        System.out.println("DRIVING IN MY TRUCK RIGHT AFTER A COFFEE, HEY MY CAPACITY IS: " + loadCapacity + " TONS AND " + axes + " AXES");
    }
    public void refuel() {
        System.out.println("Refueling bergentrück");
    }
}
class Bus implements IVehicle {
    private int seats;
    private String route;
    public Bus(int seats, String route) {
        this.seats = seats;
        this.route = route;
    }
    public void drive() {
        System.out.println("Vroom-Vrooming bus with " + seats + " seats on route " + route);
    }
    public void refuel() {
        System.out.println("Refueling bus");
    }
}