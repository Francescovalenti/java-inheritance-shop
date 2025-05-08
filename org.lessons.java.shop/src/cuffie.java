public class Cuffie extends Prodotto {
    private String Colore;
    private String suono;

    public Cuffie(String Nome, String Marca, int Codice, double prezzo, double iva,String Colore,String suono) {
        super(Nome, Marca, Codice, prezzo, iva);
        this.Colore = Colore;
        this.suono = suono;
    }

    public String getColore() {
        return this.Colore;
    }
    public String getSuono(){
        return this.suono;
    }
}
