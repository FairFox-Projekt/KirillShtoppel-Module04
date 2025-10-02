import java.util.*;
public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fabricate new transport.");
        System.out.println("Choose the type: ");
        System.out.println("1 - Car");
        System.out.println("2 - Motorcycle");
        System.out.println("3 - Plane");
        System.out.println("4 - Bike, duh");
        int choice = scanner.nextInt();

        TransportFactory factory;
        switch (choice) {
            case 1: factory = new CarFactory(); break;
            case 2: factory = new MotorcycleFactory(); break;
            case 3: factory = new PlaneFactory(); break;
            case 4: factory = new BikeFactory(); break;
            default: System.out.println("Not that."); return;
        }

        ITransport transport = factory.createTransport();
        transport.move();
        transport.fuelUp();
    }
}