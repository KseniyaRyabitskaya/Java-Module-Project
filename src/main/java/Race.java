import java.util.ArrayList;

public class Race {

    public static String winner(ArrayList<Car> carSet) {
        int distanceOfWinner = 0;
        String nameOfWinner = "";
        for (Car element : carSet) {
            if (distanceOfWinner < element.speedCar * 24) {
                nameOfWinner = element.nameCar;
                distanceOfWinner = element.speedCar * 24;
            }
        }
        return nameOfWinner;
    }
}