import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;

class Car {
    String type;
    int tires;
    int cc;

    public Car(String type, int tires, int cc) {
        this.type = type;
        this.tires = tires;
        this.cc = cc;
    }

    public void display() {
        System.out.println("Model: " + type);
        System.out.println("Tyres: " + tires);
        System.out.println("CC: " + cc);
    }
}

public class Main {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        System.out.println("Current Local Time: " + time1);

        ArrayList<Car> cars = new ArrayList<>();
     
        cars.add(new Car("SUV", 4, 2000));
        cars.add(new Car("Sedan", 4, 1800));
        cars.add(new Car("MPV", 4, 2200));
        cars.add(new Car("Hatch", 4, 1500));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car model to search: ");
        String model = sc.nextLine();
        boolean found = false;

        for (Car car : cars) {
            if (car.type.equalsIgnoreCase(model)) {
                car.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Car model not found.");
        }

        LocalTime time2 = LocalTime.now();
        System.out.println("Current Local Time: " + time2);
        sc.close();
    }
}