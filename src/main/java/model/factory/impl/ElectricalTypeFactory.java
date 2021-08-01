package model.factory.impl;

import model.Bicycle;
import model.Scooter;
import model.factory.VehicleFactory;
import model.impl.ElectricalBicycle;
import model.impl.ElectricalScooter;

public class ElectricalTypeFactory implements VehicleFactory {
    @Override
    public Bicycle createBicycle() {
        return new ElectricalBicycle();
    }

    @Override
    public Scooter createScooter() {
        return new ElectricalScooter();
    }
}
