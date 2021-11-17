package com.company;

public class Kontrak extends Karyawan{
    private int time;

    public Kontrak(String name, int time, double gajiDasar){
        super(name, gajiDasar);
        this.time = time;
    }
    public void display(){
        super.display();
        System.out.println("Waktu : " + time);
    }
}
