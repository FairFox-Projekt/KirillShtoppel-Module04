interface ITransport {
    void move();
    void fuelUp();
}

class Car implements ITransport {
    public void move() {
        System.out.println("Car vroom-vroom.");
    }
    public void fuelUp() {
        System.out.println("Refueling car.");
    }
}
class Motorcycle implements ITransport {
    public void move() {
        System.out.println("Moto vroom-vroom.");
    }
    public void fuelUp() {
        System.out.println("Refueling motorcycle.");
    }
}
class Plane implements ITransport {
    public void move() {
        System.out.println("Plane is vroom-vroo-wait, no. It's flying.");
    }
    public void fuelUp() {
        System.out.println("Refueling plane");
    }
}
class Bike implements ITransport {
    public void move() {
        System.out.println("Bike is vroom-vroom, just depressingly slow.");
    }
    public void fuelUp() {
        System.out.println("Refueling bike... Oh. It uses no fuel for it. Forget it. Should have use another interface...");
    }
}

//я честно просто не успел подсмотреть изначальный код на самой паре из-за того что
//промаялся с практикой модуля 4
//так что за несоответствия извините

//хотя я итак всё через java пропускаю...