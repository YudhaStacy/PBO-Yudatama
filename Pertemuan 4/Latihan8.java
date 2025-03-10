/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

interface Kendaraan{
    void berjalan();
}

class Mobil implements Kendaraan{
    public void berjalan(){
        System.out.println("Mobil berjalan dengan roda 4");
    }
}

class Motor implements Kendaraan{
    public void berjalan(){
        System.out.println("Motor berjalan dengan roda 2");
    }
}


public class Latihan8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Kendaraan kendaraan1 = new Mobil();
       Kendaraan kendaraan2 = new Motor();
       
       kendaraan1.berjalan();
       kendaraan2.berjalan();
    }
}
