public class Televisori extends Prodotto {
    protected int Dimensioni;
    protected boolean Smart;
    // // richiamo al costruttore prodotto e inizio costruttore Televisori

    public Televisori(String Nome, String Marca, int Codice, float prezzo, float iva, int Dimensioni, Boolean smart) {
        super(Nome, Marca, Codice, prezzo, iva);
        this.Dimensioni = Dimensioni;
        this.Smart = smart;
    }

    // fase di richiamo nel main della dimensione
    public int getDimensioni() {
        return this.Dimensioni;
    }

    // fase di metodo del boolean smart

    public boolean isSmart() {
        return this.Smart;
    }

    public void setSmart(boolean smart) {
        this.Smart = smart;

    }

    public String getSmartDescription() {
        return Smart ? "è una smart TV" : "non è una smart TV";
    }

    // concatenamento della stringa per il comando in main
    public String accendiTv() {
        return "La Tv " + Nome + " della " + Marca + "con codice barcode che è " + Codice + " ha un prezzo di "
                + getPrezzoIvaFormattato() + " La Tv " + Nome + " ha la dimensione di " + getDimensioni()
                + " pollici ed " + getSmartDescription();
    }
}
