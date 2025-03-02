/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

abstract class Kendaraan{
    String nama;
    int jumlahRoda;
    
    public Kendaraan(String nama, int jumlahRoda){
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }
    
    abstract void bergerak();
    
    public void info(){
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }
}

class Mobil extends Kendaraan{
    public Mobil(String nama){
        super(nama, 4);
    }
    @Override
    void bergerak(){
        System.out.println(nama + " bergerak dengan mesin bensin pertamax.");
    }
}

class SepedaMotor extends Kendaraan{
    public SepedaMotor(String nama){
        super(nama, 2);
    }
    @Override
    void bergerak(){
        System.out.println(nama + " bergerak dengan mesin bensin pertalite.");
    }
}

interface KendaraanListrik{
    void isiDaya();
}

class MobilListrik extends Mobil implements KendaraanListrik{
    public MobilListrik (String nama){
        super(nama);
    }
    @Override
    void bergerak(){
        System.out.println(nama + " bergerak dengan motor listrik");
    }
    @Override
    public void isiDaya(){
        System.out.println(nama + " sedang isi daya");
    }
}

public class Latihan1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan motor = new SepedaMotor("Honda");
        MobilListrik tesla = new MobilListrik("Tesla Model 3");
        
        mobil.info();
        mobil.bergerak();        
        motor.info();
        motor.bergerak();
        
        System.out.println();
        
        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}
