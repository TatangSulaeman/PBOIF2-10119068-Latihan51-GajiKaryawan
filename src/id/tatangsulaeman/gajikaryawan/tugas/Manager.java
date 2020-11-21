/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.gajikaryawan.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Gaji Karyawan
 * 
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan,tunjanganJabatan,tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran){
        return tunjanganKehadiran = kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        if("Manager".equals(jabatan)) {
            tunjanganJabatan = 2000000;
        } else if("Kabag".equals(jabatan)){
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0 ;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        tunjanganGolongan = switch (golongan) {
            case 1 -> 500000;
            case 2 -> 1000000;
            case 3 -> 1500000;
            default -> 0;
        };
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
