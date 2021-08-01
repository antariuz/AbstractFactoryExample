import model.factory.VehicleFactory;
import model.factory.impl.ElectricalTypeFactory;
import model.factory.impl.MechanicalTypeFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        VehicleFactory electricalFactory = new ElectricalTypeFactory();
        VehicleFactory mechanicalFactory = new MechanicalTypeFactory();

        List<Object> list = new ArrayList<>(Arrays.asList(electricalFactory.createScooter(),
                electricalFactory.createBicycle(),mechanicalFactory.createScooter(),
                mechanicalFactory.createBicycle()));
        list.forEach(System.out::println);
    }
}
