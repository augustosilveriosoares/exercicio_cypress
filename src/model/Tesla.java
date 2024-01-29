package model;

import generics.IGenericCar;

public class Tesla implements IGenericCar<Tesla> {

    private String nome;

    public Tesla(String nome){
        this.nome = nome;

    }
    @Override
    public void acelerar() {

    }

    @Override
    public void freiar() {

    }
    public String toString() {
        return this.nome;
    }
}
