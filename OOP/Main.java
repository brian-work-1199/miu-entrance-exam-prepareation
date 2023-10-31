package OOP;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();
        car.go();
        car.display(5);
        car.display(5, "Toyota");
//        bike.go();
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
