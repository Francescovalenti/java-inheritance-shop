public class Main {
    public static void main(String[] args) throws Exception {
        Smartphone smart = new Smartphone("Galaxy S24", "Samsung", 0, 500, 22, "b0123456789", 128);
        Televisori Tv = new Televisori("Bravia X90", "Sony", 0, 1499, 22, 55, true);
        Cuffie Auricolari = new Cuffie("AirPods", "Apple", 0, 199, 22, "Bianco", "wireless");

        System.out.println(smart.accendismart());
        System.out.println(Tv.accendiTv());
        System.out.println(Auricolari.AccendiCuffie());

    }
}
