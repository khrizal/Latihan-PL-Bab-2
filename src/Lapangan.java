package latihan.constuctor.dan.instance.method;

//class     :
//Object    :
//Method    :
//Atribut   :


public class Lapangan {
    private String nama_mahasiswa, pemenang;
    private int jumlah_mahasiswa, nim, jumlah_putaran, jumlah_waktu, panjang_lapangan,
            lebar_lapangan, jarak;
    private double kecepatan;
    public void Lapangan(int n, String nm, int jp, int jw){
        nim = n;
        nama_mahasiswa = nm;
        jumlah_putaran = jp;
        jumlah_waktu = jw;
    }
    public int GetJarak(int keliling_lapangan){
        return jarak = keliling_lapangan * jumlah_putaran;
    }
    public String GetNama_mahasiswa(){
        return nama_mahasiswa;
    }
    public double GetPemenang(){
        return kecepatan = jarak / jumlah_waktu;
    }
}
