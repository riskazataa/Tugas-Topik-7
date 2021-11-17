package com.company;

public class Main {

    public static void main(String[] args) {
	Departemen keuangan = new Departemen("keuangan");

	Karyawan keuangan1 = new Tetap("Riska Zata Amani", 30000000, 4000000);
	Karyawan keuangan2 = new Tetap("Zata Amani", 20000000, 3000000);

	Karyawan keuangan3 = new Kontrak("Muhammad", 5, 3500000);
	Karyawan keuangan4 = new Kontrak("Suhardi",3,4500000);

	keuangan.addKaryawan(keuangan1);
	keuangan.addKaryawan(keuangan2);
	keuangan.addKaryawan(keuangan3);
	keuangan.addKaryawan(keuangan4);

	keuangan.displayAll();
	keuangan.displayKontrak();
	keuangan.displayTetap();
    }
}
