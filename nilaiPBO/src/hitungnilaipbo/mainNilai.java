/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungnilaipbo;
import java.util.Scanner;
/**
 *
 * @author Deodatuss
 */
public class mainNilai {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input total inputan : ");
        int tot = input.nextInt();
        int[] nilai = new int[tot];
        for(int i = 0; i < tot; i++){
            System.out.print("Input nilai : ");
            nilai[i] = input.nextInt();
        }
        NilaiPBO tampil = new NilaiPBO();
        tampil.daftarNilai(nilai,tot);
    }
}
