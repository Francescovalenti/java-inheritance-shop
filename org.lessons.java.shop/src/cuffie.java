public class Cuffie extends Prodotto {
    private String Colore;
    private String suono;
 // richiamo al costruttore prodotto e inizio costruttore Cuffie

    public Cuffie(String Nome, String Marca, int Codice, double prezzo, double iva,String Colore,String suono) {
        super(Nome, Marca, Codice, prezzo, iva);
        this.Colore = Colore;
        this.suono = suono;
    }
    // fase di richiamo nel main di Colore e Suono

    public String getColore() {
        return this.Colore;
    }
    public String getSuono(){
        return this.suono;
    }
// concatenamento della stringa per il comando in main
    public String AccendiCuffie () {
        return "Le cuffie " + Nome + " della " + Marca + " sono di colore " + getColore() + " e hanno la funzione " + getSuono() +
        "Le cuffie hanno un costo di " + getPrezzoIvaFormattato() + "e il loro codice barcode è " + Codice;
    }
}
