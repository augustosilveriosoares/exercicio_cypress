package model;

import generics.IGenericCar;

public class Toyota implements IGenericCar<Toyota> {


    private String nome;

    public Toyota(String nome){
        this.nome = nome;

    }
    @Override
    public void acelerar() {

    }

    @Override
    public void freiar() {

    }


    public String toString() {
        return  this.nome;
    }
}
