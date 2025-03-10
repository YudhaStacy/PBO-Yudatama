/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

class Hewan{
    String nama;
    
    Hewan(String nama){
        this.nama = nama;
    }
    void info(){
        System.out.println("Nama: "+ nama);
    }
}

class Kucing extends Hewan{
    Kucing(String nama){
        super(nama);
    }
}

public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kucing kucing = new Kucing("Tom");
        
        kucing.info();
    }
}
