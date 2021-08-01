package model.factory.impl;

import model.Bicycle;
import model.Scooter;
import model.factory.VehicleFactory;
import model.impl.MechanicalBicycle;
import model.impl.MechanicalScooter;

public class MechanicalTypeFactory implements VehicleFactory {
    @Override
    public Bicycle createBicycle() {
        return new MechanicalBicycle();
    }

    @Override
    public Scooter createScooter() {
        return new MechanicalScooter();
    }
}
