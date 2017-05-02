/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Joe
 */
import java.util.Scanner;
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        Scanner masuk1 = new Scanner(System.in);
        Mahasiswa m;
        m = null;
        
        while(true){
            System.out.println("1. Input Mahasiswa");
            System.out.println("2. Output Mahasiswa");
            int opsi;
            opsi = masuk1.nextInt();
            if(opsi==1){
                String nama,kelas,nim;
                nama=masuk.nextLine();
                nim=masuk.nextLine();
                kelas=masuk.nextLine();
                m = new Mahasiswa(nama, nim, kelas);
                
            }
            else if(opsi==2){
                System.out.println(m.getNama()+" "+m.getNim()+" "+m.getKelas());
            }
        }
    }
    
}
