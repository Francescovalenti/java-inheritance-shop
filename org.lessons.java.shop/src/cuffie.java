public class Cuffie extends Prodotto {
    private String Colore;
    private Boolean suono;

    public Cuffie(String Nome, String Marca, int Codice, double prezzo, double iva,String Colore,Boolean suono) {
        super(Nome, Marca, Codice, prezzo, iva);
        this.Colore = Colore;
        this.suono = suono;
    }

}
