import java.util.*;
public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create vehicle:");
        System.out.println("1 - Car");
        System.out.println("2 - Motorcycle");
        System.out.println("3 - Truck");
        System.out.println("4 - Bus");
        int vehicleinsert = Integer.parseInt(scanner.nextLine()); //с парсом оно получше работает, вроде как

        VehicleFactory factory = null;

        switch (vehicleinsert) {
            case 1:
                System.out.print("Brand: ");
                String brand = scanner.nextLine();
                System.out.print("Model: ");
                String model = scanner.nextLine();
                System.out.print("Fuel type: ");
                String fuelType = scanner.nextLine();
                factory = new CarFactory(brand, model, fuelType);
                break;
            case 2:
                System.out.print("Type: ");
                String motoType = scanner.nextLine();
                System.out.print("Capacity: ");
                int engineCapacity = Integer.parseInt(scanner.nextLine());
                factory = new MotorcycleFactory(motoType, engineCapacity);
                break;
            case 3:
                System.out.print("Capacity: ");
                int loadCapacity = Integer.parseInt(scanner.nextLine());
                System.out.print("Axes: ");
                int axles = Integer.parseInt(scanner.nextLine());
                factory = new TruckFactory(loadCapacity, axles);
                break;
            case 4:
                System.out.print("Seats: ");
                int seats = Integer.parseInt(scanner.nextLine());
                System.out.print("Route: ");
                String route = scanner.nextLine();
                factory = new BusFactory(seats, route);
                break;
            default:
                System.out.println("Not that.");
                break;
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();
    }
}