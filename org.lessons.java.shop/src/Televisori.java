public class Televisori extends Prodotto {
    private int Dimensioni;
    private boolean Smart;
    // // richiamo al costruttore prodotto e inizio costruttore Televisori

    public Televisori(String Nome, String Marca, int Codice, double prezzo, double iva, int Dimensioni, Boolean smart) {
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
}
