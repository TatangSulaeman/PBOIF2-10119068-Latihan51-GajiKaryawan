/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.gajikaryawan.tugas;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Gaji Karyawan
 * 
 */
public class Main {
    public static void main(String[]args){
        Manager datMan = new Manager();
        Scanner inKey = new Scanner(System.in);
        
        String nik,nama,jabatan;
        int kehadiran,golongan;
        
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        
        //input user NIK
        System.out.print("Masukkan NIK : ");
        nik = inKey.nextLine();
        datMan.setNik(nik);
        
        //input user Nama
        System.out.print("Masukkan Nama : ");
        nama = inKey.nextLine();
        datMan.setNama(nama);
        
        //input user Golongan
        System.out.print("Masukkan Golongan (1/2/3) : ");
        golongan = inKey.nextInt();
        datMan.setGolongan(golongan);
        
        //input user Jabatan
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        jabatan = inKey.next();
        datMan.setJabatan(jabatan);
        
        //input user jumlah kehadiran
        System.out.print("Masukkan Jumlah Kehadiran : ");
        kehadiran = inKey.nextInt();
        datMan.setKehadiran(kehadiran);
        
        System.out.println();
        //output/tampilan
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK : " + datMan.getNik());
        System.out.println("Nama : " + datMan.getNama());
        System.out.println("GOLONGAN : " + datMan.getGolongan());
        System.out.println("JABATAN : " + datMan.getJabatan());
        
        System.out.println();
        
        System.out.println("TUNJANGAN GOLONGAN\t : " + datMan.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN\t : " + datMan.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN\t : " + datMan.tunjanganKehadiran(kehadiran));
        
        System.out.println();
        
        System.out.println("GAJI TOTAL\t : " + datMan.gajiTotal());
    }
}
