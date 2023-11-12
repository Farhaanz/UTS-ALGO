public class DataDiri {
    public static void main(String[] args) {
        // Data diri
        String nama = "Muhammad Faatih Farhaan";
        int umur = 19;
        double tinggi = 171.5;  // dalam sentimeter
        double beratBadan = 60;  // dalam kilogram
        String pekerjaan = "Programmer";
        boolean statusMenikah = false;

        // Menampilkan data diri
        System.out.println("Data Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggi + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Pekerjaan: " + pekerjaan);

        if (statusMenikah) {
            System.out.println("Status: Menikah");
        } else {
            System.out.println("Status: Belum Menikah");
        }
    }
}
