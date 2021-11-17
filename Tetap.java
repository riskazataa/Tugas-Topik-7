package com.company;

public class Tetap extends Karyawan{
    private double tunjanganDasar;

    public Tetap(String name, double tunjanganDasar, double gajiDasar){
        super(name, gajiDasar);
        this.tunjanganDasar = tunjanganDasar;
    }
    public void display(){
        super.display();
        System.out.println("Tunjangan Dasar : " + tunjanganDasar);
    }
}
