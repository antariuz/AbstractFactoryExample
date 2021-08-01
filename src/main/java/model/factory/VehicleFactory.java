package model.factory;

import model.Bicycle;
import model.Scooter;

public interface VehicleFactory {
    Bicycle createBicycle();
    Scooter createScooter();
}
