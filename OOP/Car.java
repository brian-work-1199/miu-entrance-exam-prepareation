package OOP;

public class Car extends Vehicle{

    int doors = 4;

    @Override
    public void go() {
        System.out.println("Car is moving");
    }
    public void display(int speed, String model) {
        System.out.println("Speed: " + speed + "km/h");
        System.out.println("Model: " + model);
    }

    public void display(int speed) {
        System.out.println("Speed: "+ speed + "km/h");
    }


}
