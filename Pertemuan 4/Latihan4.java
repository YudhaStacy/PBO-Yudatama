/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

interface Hewan{
    void makan();
}

interface Mamalia{
    void menyusui();
}

class Kucing implements Hewan, Mamalia{
    @Override
    public void makan(){
        System.out.println("Kucing makan ikan");
        
    }
    @Override
    public void menyusui(){
        System.out.println("Kucing menyusui anaknya");
    } 
}

public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Kucing kucing = new Kucing();
        
        kucing.makan();
        kucing.menyusui();
    }
}
