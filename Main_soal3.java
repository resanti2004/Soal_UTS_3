
class Ksatria extends Penduduk {
    public Ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak() {
        return getPendapatan() * 0.18;
    }

    public double bayar() {
        double totalPajak = pajak();
        double totalBayar = getPendapatan() - totalPajak;
        return totalBayar;
    }
//    public double pajak(int pendapatan, double persenPajak) {
//        return pendapatan * persenPajak;
//    }
//
//    public double bayar() {
//        double totalPajak = pajak(getPendapatan(), 0.18);
//        double totalBayar = getPendapatan() - totalPajak;
//        return totalBayar;
//    }
}

class Pedagang extends Penduduk {
    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak() {
        return getPendapatan() * 0.12;
    }

    public double bayar() {
        double totalPajak = pajak();
        double totalBayar = getPendapatan() - totalPajak;
        return totalBayar;
    }
}

class Petani extends Penduduk {
    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak() {
        return getPendapatan() * 0.03;
    }

    public double bayar() {
        double totalPajak = pajak();
        double totalBayar = getPendapatan() - totalPajak;
        return totalBayar;
    }
}

class PandaiBesi extends Penduduk {
    public PandaiBesi(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak() {
        return getPendapatan() * 0.06;
    }

    public double bayar() {
        double totalPajak = pajak();
        double totalBayar = getPendapatan() - totalPajak;
        return totalBayar;
    }
}



public class Main_soal3 {
    public static void main(String[] args) {
        Penduduk[] penduduk = new Penduduk[4];
        penduduk[0] = new Ksatria("Joko", 1000000);
        penduduk[1] = new Pedagang("Rudi", 800000);
        penduduk[2] = new Petani("Rusman", 500000);
        penduduk[3] = new PandaiBesi("Hajiman", 400000);

        for (Penduduk pdd : penduduk) {
            System.out.println(pdd.toString());
        }
    }
}
