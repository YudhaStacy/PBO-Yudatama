/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */
class kendaraan {
    String merk;
    String tipe;
    int kecepatan;

    kendaraan(String merk, String tipe, int kecepatan){
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    void tampilkanInfo(){
        System.out.println("Merk: "+ merk + ", Tipe: "+ tipe + ", Kecepatan: "+ kecepatan + "km/jam");
    }

    void tambahKecepatan(int km){
        this.kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi: "+ kecepatan +" km/jam");
    }
    
    void kurangiKecepatan(int km){
        this.kecepatan -= km;
        if(kecepatan < 0){
            kecepatan = 0;
        }
        System.out.println(merk + " mengurangi kecepatan menjadi: "+ kecepatan +" km/jam");
    }
    
    void berhenti(){
        this.kecepatan = 0;
        System.out.println("Kendaraan telah berhenti");
    }
}
public class Tugas1{
    public static void main(String args[]) {
        kendaraan kendaraan1 = new kendaraan("Toyota", "Mobil", 60);
        kendaraan kendaraan2 = new kendaraan("Yamaha", "Motor", 40);
        kendaraan kendaraan3 = new kendaraan("Honda", "Motor", 20);
        
        kendaraan1.tampilkanInfo();
        kendaraan1.tambahKecepatan(20);
        kendaraan1.kurangiKecepatan(30);
        kendaraan1.berhenti();
        kendaraan1.tampilkanInfo();
        
        System.out.println();
        
        kendaraan2.tampilkanInfo();
        kendaraan2.tambahKecepatan(30);
        kendaraan2.kurangiKecepatan(40);
        kendaraan2.berhenti();
        kendaraan2.tampilkanInfo();
        
        System.out.println("");
        
        kendaraan3.tampilkanInfo();
        kendaraan3.tambahKecepatan(10);
        kendaraan3.kurangiKecepatan(40);
        kendaraan3.berhenti();
        kendaraan3.tampilkanInfo();
        
    }
}

