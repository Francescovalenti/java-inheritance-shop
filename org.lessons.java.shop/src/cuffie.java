public class Cuffie extends Prodotto {
    protected String Colore;
    protected String suono;
    // richiamo al costruttore prodotto e inizio costruttore Cuffie

    public Cuffie(String Nome, String Marca, int Codice, float prezzo, float iva, String Colore, String suono) {
        super(Nome, Marca, Codice, prezzo, iva);
        this.Colore = Colore;
        this.suono = suono;
    }
    // fase di richiamo nel main di Colore e Suono

    public String getColore() {
        return this.Colore;
    }

    public String getSuono() {
        return this.suono;
    }

    // concatenamento della stringa per il comando in main
    public String AccendiCuffie() {
        return "Le cuffie " + getNome() + " della " + getMarca() + " sono di colore " + getColore()
                + " e hanno la funzione " + getSuono() +
                "Le cuffie hanno un costo di " + getPrezzoIvaFormattato() + " e il suo codice barcode è " + getCodice();
    }

    // inserimento del override per la stampa nella classe carrello
   @Override
public String toString() {
    return "Cuffie " + super.toString() +
           ", colore: " + getColore() +
           ", tipo: " + getSuono();
}
}