package com.company;
import java.util.ArrayList;

public class Departemen {

    private  String name;
    private ArrayList<Karyawan> karyawan = new ArrayList<>();

    public Departemen (String name){
        this.name = name;
    }
    public void addKaryawan (Karyawan a){
        karyawan.add(a);
    }
    public void displayAll(){
        for (Karyawan a : karyawan){
            a.display();
        }
    }
    public void displayKontrak(){
        for (Karyawan a : karyawan){
            if (a instanceof Kontrak){
                a.display();
            }
        }
    }
    public void displayTetap(){
        for (Karyawan a : karyawan){
            if (a instanceof Tetap){
                a.display();
            }
        }
    }
}
