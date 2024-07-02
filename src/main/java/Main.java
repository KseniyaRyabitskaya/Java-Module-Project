import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            int speedCar;
            System.out.println("Введите название машины №" + i + ":");
            String nameCar = scanner.nextLine();

            while (true) {
                System.out.println("Введите скорость машины №" + i + " в диапозоне от 1 до 250 км/ч:");
                try {
                    speedCar = scanner.nextInt();
                    scanner.nextLine();
                    if (speedCar > 250 || speedCar <= 0) {
                        System.out.println("Недопустимое значение скорости.");
                    } else {
                        break;
                    }
                } catch (Exception e){
                    System.out.println("Введенные данные не являются числом.");
                    scanner.nextLine();

                }
            }
            carList.add(new Car(nameCar, speedCar));
        }
        scanner.close();
        System.out.println("Самая быстрая машина: " + Race.calculateWinner(carList));
    }
}