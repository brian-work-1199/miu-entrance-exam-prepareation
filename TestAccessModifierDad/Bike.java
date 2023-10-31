package TestAccessModifierDad;

public class Bike {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setter("Mazda");

        System.out.println(vehicle.getter());
    }

}
