class ObatTablet extends ObatApotek implements CaraKonsumsi {
    private int jumlahTablet;

    public ObatTablet(String kode, String nama, double harga, int jumlahTablet) {
        super(kode, nama, harga);
        this.jumlahTablet = jumlahTablet;
    }

    @Override
    public void deskripsi() {
        System.out.println("Informasi Obat Tablet:");
        super.deskripsi();
        System.out.println("Jumlah tablet: " + jumlahTablet);
        System.out.println("Jenis: Obat Tablet");
    }

    @Override
    public void aturanPakai() {
        System.out.println("Aturan pakai " + nama + ": Diminum setelah makan.");
    }

    @Override
    public void takaran() {
        System.out.println("Takaran " + nama + ": 1 tablet 2 kali sehari.");
    }
}