package model;

import generics.IGenericCar;

import java.util.ArrayList;

public class StockCar<T extends IGenericCar>{

    private ArrayList<T> carros =  new ArrayList<T>();

    public void addStockCar(T car){
        this.carros.add(car);
    }

    public void listCars(){
        for(T car : carros){
            System.out.println(car.toString());

        }
    }

}
