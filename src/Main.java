import generics.IGenericCar;
import model.StockCar;
import model.Tesla;
import model.Toyota;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String args[]){

        StockCar<IGenericCar> car = new StockCar<>();
        car.addStockCar(new Tesla("Model S"));
        car.addStockCar(new Toyota("Hilux SW4"));
        car.listCars();



    }
}
