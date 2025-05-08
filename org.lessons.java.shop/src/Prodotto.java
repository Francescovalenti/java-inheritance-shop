import java.util.Random;

// inserimento attributi
public class Prodotto {
   public String Nome;
   public String Marca;
   public int Codice;
   public double prezzo;
   public double iva;

   // creazione del costruttore
   public Prodotto(String Nome, String Marca, int Codice, double prezzo, double iva) {
      this.Nome = Nome;
      this.Marca = Marca;
      Random rand = new Random();
      this.Codice = rand.nextInt(90000) ;
      this.prezzo = prezzo;
      this.iva = iva;
   }

   // Inserimento metodo prezzo base
   public String getPrezzoFormattato() {
      return String.format("%.2f ", prezzo);
   }

   // Inserimento metodo iva
   public String getPrezzoIvaFormattato() {
      double prezzoIvato = prezzo + (prezzo * iva / 100.0);
      return String.format("%.2f ", prezzoIvato);
   }

   // inserimento stringa codice prodotto piu nome del Prodotto
   public String venduta() {
      return this.Codice + "-" + this.Nome;
   }

   // inserimento metodo per la marca
   public String getMarca() {
      return Marca;
   }
}