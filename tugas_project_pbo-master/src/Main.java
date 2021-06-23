import model.Pegawai;
import model.PegawaiMagang;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException) {

        // Object 1
        Pegawai PuteraPerdana = new Pegawai("KD-01", "A. Putera Perdana", "Direktur", "Banjarbaru", "20-06-2019", false);
        PuteraPerdana.absensiPegawai("A. Putera Perdana");
        PuteraPerdana.tampilkanData();
        PuteraPerdana.hitungGaji();

        System.out.println();

        // Object 2
        Pegawai maulana = new Pegawai("KD-02", "M.Maulana", "Staf", "Banjarmasin", "28-05-2018", true);
        maulana.tampilkanData();
        maualana.hitungGaji();

        System.out.println();

        // Object 3
        PegawaiMagang rizki = new PegawaiMagang("MG-01", "M. Rizki", "Banjarbaru", "POLTEKES", "10-06-2021", "17-09-2021");
        rizki.absensiPegawai("M. Rizki");
        rizki.tampilkanDataPegawaiMagang();
        rizki.hitungGajiMagang();

        System.out.println();

        // Object 4
        PegawaiMagang wahyu = new PegawaiMagang("MG-02", "A. wahyu", "Banjarbaru", "UNISKA", "19-06-2021", "21-07-2021");
        wahyu.tampilkanDataPegawaiMagang();
        wahyu.hitungGajiMagang();

        System.out.println();

        // Object 5
        Pegawai Zikri = new Pegawai("KD-03", "A. Zikri Zega", "zikri", "zikri");

        System.out.println();

        // Object 6
        Pegawai Jidan = new Pegawai("KD-04", "jidan akbar", "jidan", "jidan123");
    }

}
