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
    
    public Kendaraan(String nama){
        this.nama = nama;
    }
    
    abstract void bergerak();
    
    public void info(){
        System.out.println(nama + " adalah kendaran.");
    }
}


class Mobil extends Kendaraan{
    public Mobil(String nama){
        super(nama);
    }
    
    @Override
    void bergerak(){
        System.out.println(nama + " bergerak dengan roda.");
    }
}

class Kapal extends Kendaraan{
    public Kapal(String nama){
        super(nama);
    }
    @Override
    void bergerak(){
            System.out.println(nama + " bergerak di air.");
    }
}



public class Contoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan kapal = new Kapal("Titanic");
        
        mobil.info();
        mobil.bergerak();
        
        kapal.info();
        kapal.bergerak();
    }
}
