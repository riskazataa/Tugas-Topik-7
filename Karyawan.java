package com.company;

public class Karyawan {
    protected String name;
    protected double gajiDasar;

    public Karyawan(String name, double gajiDasar){
        this.name =name;
        this.gajiDasar = gajiDasar;
    }
    public void display(){
        System.out.println("Nama : " + name);
        System.out.println("Gaji Dasar : " + gajiDasar);
    }
}
