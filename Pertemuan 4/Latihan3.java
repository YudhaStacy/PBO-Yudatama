/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

class Hewan{
    void makan(){
        System.out.println("Hewan sedang makan");
    }
}

class Kucing extends Hewan{
    void suara(){
        System.out.println("MEOOOONGG!");
    }
}

class anjing extends Hewan{
    void suara(){
        System.out.println("GUK GUK");
    }
}

public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Kucing kucing = new Kucing();
       anjing anjing = new anjing();
       
       kucing.makan();
       kucing.suara();
       
       anjing.makan();
       anjing.suara();
    }
}
