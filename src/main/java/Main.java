import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            int speedCar;
            System.out.println("Введите название машины №" + i + ":");
            String nameCar = scanner.next();

            while (true) {
                System.out.println("Введите скорость машины №" + i + " в диапозоне от 1 до 250 км/ч:");
                int speed = scanner.nextInt();
                if (speed > 250 || speed <= 0) {
                    System.out.println("Недопустимое значение скорости.");
                } else {
                    speedCar = speed;
                    break;
                }
            }
            carList.add(new Car(nameCar, speedCar));
        }
        scanner.close();
        System.out.println("Самая быстрая машина: " + Race.winner(carList));
    }
}