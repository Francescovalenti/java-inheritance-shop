public class Smartphone extends Prodotto {
    private String Imei;
    private int Memoria;

    // richiamo al costruttore prodotto e inizio costruttore Smartphone

    public Smartphone(String Nome, String Marca, int Codice, double prezzo, double Iva, String Imei, int Memoria) {
        super(Nome, Marca, Codice, prezzo, Iva);
        this.Imei = Imei;
        this.Memoria = Memoria;
    }

    // fase di richiamo nel main di Imei e Memoria
   public String getImei() {
        return this.Imei;
    }

    public int getMemoria() {
        return this.Memoria;
    }
}