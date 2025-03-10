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
    
    void makan(){
        System.out.println(nama+" sedang makan");
    }
}

class Kucing extends Hewan{
    void suara(){
        System.out.println(nama+" miw miw augggg");
    }
}

public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Tom";
        kucing1.makan();
        kucing1.suara();
    }
}
