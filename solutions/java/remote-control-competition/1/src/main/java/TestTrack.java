import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
      
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
           // Crear una copia de la lista para no modificar la original
    List<ProductionRemoteControlCar> sortedCars = new ArrayList<>(cars);
    Collections.sort(sortedCars);  // Usa el compareTo que implementaste
    return sortedCars;
    }
}
