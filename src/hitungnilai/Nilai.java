/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package hitungnilai;

public class Nilai {
    private String nama;
    private String nim;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Nilai() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return nim;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    // rumus untuk menghitung nilai akhir
    // nilai akhir = (30% x nilai tugas) + (30% x nilai UTS) + (40% x nilai UAS)
    public double getNilaiAkhir() {
        double nilaiAkhir = ((0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS));
        return nilaiAkhir;
    }

    // nilai huruf
    // >= 85 - < 100   = A    
    // >= 80 - < 85    = AB    
    // >= 70 - < 80    = B    
    // >= 65 - < 70    = BC
    // >= 60 - < 65    = C
    // >= 50 - < 60    = D
    // >= 0 - < 50     = E
    public String getNilaiHuruf() {
        double nilaiAkhir = getNilaiAkhir();
        String nilaiHuruf;
        if (nilaiAkhir >= 85 && nilaiAkhir < 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 80 && nilaiAkhir < 85) {
            nilaiHuruf = "AB";
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 70) {
            nilaiHuruf = "BC";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }
}
