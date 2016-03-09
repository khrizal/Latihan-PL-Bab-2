package latihan.constuctor.dan.instance.method;

public class Lapangan {
    private String nama_mahasiswa, pemenang;
    private int jumlah_mahasiswa, nim, jumlah_putaran, jumlah_waktu, panjang_lapangan,
            lebar_lapangan, jarak;
    
    public void Lapangan(int n, String nm, int jp, int jw){
        this.nim = n;
        this.nama_mahasiswa = nm;
        this.jumlah_putaran = jp;
        this.jumlah_waktu = jw;
    }
    public int GetJarak(int keliling_lapangan){
        return jarak = keliling_lapangan * jumlah_putaran;
    }
    public String GetNama_mahasiswa(){
        return nama_mahasiswa;
    }
}
