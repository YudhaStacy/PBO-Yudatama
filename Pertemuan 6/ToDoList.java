/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Yudaaa
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            System.out.println("=== MENU TO DO LIST ===");
            System.out.println("1. Tambah tugas");
            System.out.println("2. Lihat semua tugas");
            System.out.println("3. Hapus tugas");
            System.out.println("99. Keluar");        

            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    list.add(scanner.nextLine());
                    System.out.println("Tugas berhasil ditambahkan!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("=== DAFTAR TUGAS ===");
                    if(list.isEmpty()){
                        System.out.println("Tugas kosong");
                    }else{
                        for(int i = 0; i<list.size(); i++){
                            System.out.println((i+1)+". "+ list.get(i));
                        }
                        System.out.println();                    
                    }
                    break;
                case 3:
                    System.out.print("Masukkan no tugas yang ingin di hapus: ");
                    int hapus = scanner.nextInt();
                    scanner.nextLine();
      
                    
                    if(hapus > 0 && hapus <= list.size()) {
                        list.remove(hapus-1);
                        System.out.println("Tugas berhasil dihapus!");
                        System.out.println();

                    }else{
                        System.out.println("No tugas tidak valid!");
                    }
                    break;                    
                case 99:
                    System.out.println("To Do List berakhir");
                    scanner.close();
                    System.exit(0);                    
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println();
                    break;
            }
        }
        
    }
}
