/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10119011";
        mhs.nama = "Reihan Wiyanda";
        mhs.perkenalkanDiri(mhs.nama, mhs.nim);
        
        System.out.println();
        
        mhs.nim = "10119000";
        mhs.nama = "Mancung";
        mhs.perkenalkanDiri(mhs.nama, mhs.nim);
    }
    
}
