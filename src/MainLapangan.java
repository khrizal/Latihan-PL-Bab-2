package latihan.constuctor.dan.instance.method;

import java.util.Scanner;

public class MainLapangan {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah_mahasiswa = in.nextInt();
        System.out.print("Panjang Lapangan : ");
        int panjang_lap = in.nextInt();
        System.out.print("Lebar Lapangan :");
        int lebar_lap = in.nextInt();
        Lapangan jumlah_mahasiswa1[] =new Lapangan[jumlah_mahasiswa];
        for (int i = 0; i < jumlah_mahasiswa1.length; i++) {
            jumlah_mahasiswa1[i] = new Lapangan();
            System.out.print("Nim : ");
            int n = in.nextInt();
            System.out.print("Nama : ");
            String nm = in.next();
            System.out.print("Jumlah Putaran : ");
            int jp = in.nextInt();
            System.out.print("Waktu (menit) : ");
            int jw = in.nextInt();
            jumlah_mahasiswa1[i].Lapangan(n, nm, jp, jw);
        }
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.print(jumlah_mahasiswa1[i].GetNama_mahasiswa()+" ");
            System.out.println(jumlah_mahasiswa1[i].GetJarak(2*panjang_lap + 2*lebar_lap));
        }
    }
}
