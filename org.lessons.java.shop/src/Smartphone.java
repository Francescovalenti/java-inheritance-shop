public class Smartphone extends Prodotto {
    protected String Imei;
    protected int Memoria;

    // richiamo al costruttore prodotto e inizio costruttore Smartphone

    public Smartphone(String Nome, String Marca, int Codice, float prezzo, float Iva, String Imei, int Memoria) {
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

  
    // concatenamento della stringa per il comando in main
    public String accendismart() {
        return "Lo smartphone " + getNome() + " della " + getMarca() + " Ha un costo di " + getPrezzoIvaFormattato()
                + " e il suo codice barcode è " + getCodice() + " Numero Imei dello smartphone " + getNome() + " è " + getImei()
                + " con capacita di memoria " + getMemoria() + "gb";

    }
// inserimento del override per la stampa nella classe carrello
    @Override
     public String toString() {
         return "Il tuo Smartphone"+ getNome() + "della" + getMarca() + " con codice barcode: "+ getCodice() + " Numero Imei dello smartphone " + getNome() + " è " + getImei()
                 + " con capacita di memoria " + getMemoria() + "gb" + "con l'iva dell'" + getIva() + "ha un prezzo di:" + getPrezzoIvaFormattato();
     }
  
}