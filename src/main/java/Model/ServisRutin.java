package model;

public class ServisRutin extends LayananServis {
    private String merkOli;
    private double hargaOli;

    public ServisRutin(String kodeServis, String platNomor, String namaPelanggan, double biayaJasa, String merkOli, double hargaOli) {
        super(kodeServis, platNomor, namaPelanggan, biayaJasa);
        if (hargaOli < 0) {
            throw new IllegalArgumentException("Harga oli tidak boleh negatif.");
        }
        this.merkOli = merkOli;
        this.hargaOli = hargaOli;
    }

    public String getMerkOli() {
        return merkOli;
    }

    public double getHargaOli() {
        return hargaOli;
    }

    @Override
    public double hitungTotalBiaya() {
        return getBiayaJasa() + hargaOli;
    }

    @Override
    public String getKategoriServis() {
        return "Servis Rutin";
    }

    @Override
    public String getDetailLayanan() {
        return "Oli: " + merkOli + " (Rp " + hargaOli + ")";
    }
}