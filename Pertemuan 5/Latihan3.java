/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

class BankAccount{
    private double saldo;
    
    public BankAccount(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double jumlah){
        if(jumlah >= 0){
            this.saldo = jumlah;
        }else{
            System.out.println("Saldo tidak bisa negatf");
        }
    } 
}

public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount(0);
        
        System.out.println("Saldo awal: "+ myAcc.getSaldo());
        myAcc.setSaldo(100000);
        System.out.println("Saldo setelah setoran: "+ myAcc.getSaldo());
        
        
    }
}
