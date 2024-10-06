class ObatCair extends ObatApotek implements CaraKonsumsi {
    private int volume;

    public ObatCair(String kode, String nama, double harga, int volume) {
        super(kode, nama, harga);
        this.volume = volume;
    }

    @Override
    public void deskripsi() {
        System.out.println("Informasi Obat Cair:");
        super.deskripsi();
        System.out.println("Volume: " + volume + " ml");
        System.out.println("Jenis: Obat Cair");
    }

    @Override
    public void aturanPakai() {
        System.out.println("Aturan pakai " + nama + ": Dikocok dahulu sebelum diminum.");
    }

    @Override
    public void takaran() {
        System.out.println("Takaran " + nama + ": 1 sendok teh 3 kali sehari.");
    }
}