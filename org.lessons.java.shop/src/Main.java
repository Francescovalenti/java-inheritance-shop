public class Main {
    public static void main(String[] args) throws Exception {
        Smartphone smart = new Smartphone("Galaxy S24","Samsung",0,500.00,22,"b0123456789",128);
        Televisori Tv = new Televisori("Bravia X90","Sony",0,1499.50,22,55,true);
        Cuffie Auricolari = new Cuffie("AirPods","Apple",0,199.99,22,"Bianco","wireless");

        System.out.println("Numero imei dello smartphone " + smart.Nome +" è " + smart.getImei() + " con capacita di memoria " + smart.getMemoria() + "gb" );
        System.out.println("la " + Tv.Nome + " ha la dimensione di " + Tv.getDimensioni() + " pollici ed è una televisione con funzione " + Tv.isSmart());
        System.out.println("Le cuffie " + Auricolari.Nome + " della " + Auricolari.Marca + " sono di colore " + Auricolari.getColore() + " e hanno la funzione " + Auricolari.getSuono());

    }
}
