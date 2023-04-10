public class Penduduk {
    private String nama;
    private int pendapatan;

    public Penduduk(String nama, int pendapatan) {
        this.nama = nama;
        this.pendapatan = pendapatan;
    }

    public String getNama() {
        return nama;
    }

    public int getPendapatan() {
        return pendapatan;
    }

    @Override
    public String toString() {
        return "Penduduk dengan nama " + nama + " dengan pendapatan " + pendapatan + " harus membayar " + bayar();
    }

    public double bayar() {
        return 0;
    }
}
