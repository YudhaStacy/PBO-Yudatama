/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

class Hewan{
    void bersuara(){
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Meow meow!");
    }
}

class Anjing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Guk! Guk!");
    }
}

public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        
        hewan1.bersuara();
        hewan2.bersuara();
    }
}
