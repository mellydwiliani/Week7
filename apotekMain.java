public class apotekMain {
    public static void main(String[] args) {
        ObatCair paracetamol = new ObatCair(
            "OC001", 
            "Paracetamol Sirup", 
            15000, 
            60
        );

        ObatTablet amoxicillin = new ObatTablet(
            "OT001", 
            "Amoxicillin", 
            25000, 
            10
        );

        System.out.println("Informasi Obat:");
        paracetamol.deskripsi();
        paracetamol.aturanPakai();
        paracetamol.takaran();

        System.out.println("\n");

        amoxicillin.deskripsi();
        amoxicillin.aturanPakai();
        amoxicillin.takaran();
    }
}