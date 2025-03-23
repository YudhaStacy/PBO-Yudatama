
import java.util.prefs.BackingStoreException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

class BankAccount{
    private String pemilikAkun;
    private double saldo;
    
    public BankAccount(String pemilikAkun, double saldoAwal){
        this.pemilikAkun = pemilikAkun;
        this.saldo = saldoAwal;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void deposit(double jumlah){
        if(jumlah > 0){
            saldo += jumlah;
            System.out.println("Deposit sebesar "+jumlah+" berhasil! Saldo sekarang: "+ saldo);
        }else{
            System.out.println("Jumlah deposit harus lebih dari 0");
        }
    }
    
    public void tarikSaldo(double jumlah){
        if(jumlah > 0 && jumlah <= saldo){
            saldo -= jumlah;
            System.out.println("Penarikan sebesar "+jumlah+" berhasil! Saldo tersisa: "+ saldo);
        }else{
            System.out.println("Penarikan saldo tidak mencukupi atau jumlah tidak valid");
        }
    }
}


public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BankAccount akun1 = new BankAccount("Yuda", 0);
        
        System.out.println("Saldo awal: "+akun1.getSaldo());
        
        akun1.deposit(100000);
        akun1.tarikSaldo(30000);
        
        //akun1.saldo = 9999999;
    }
}
