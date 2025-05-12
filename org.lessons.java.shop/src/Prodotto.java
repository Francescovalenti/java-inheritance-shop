import java.util.Random;

// inserimento attributi
public class Prodotto {
   private String Nome;
   private String Marca;
   private int Codice;
   private float prezzo;
   private float iva;

   // creazione del costruttore
   public Prodotto(String Nome, String Marca, int Codice, float prezzo, float iva) {
      this.Nome = Nome;
      this.Marca = Marca;
      this.Codice = Codice;
      this.prezzo = prezzo;
      this.iva = iva;
   }

   // Inserimento metodo prezzo base
   public String getPrezzoFormattato() {
      String PrezzoFormattato = String.format("%.2f ", prezzo);
      return PrezzoFormattato + " ";
   }

   // Inserimento metodo iva
   public String getPrezzoIvaFormattato() {
      float prezzoIvato = prezzo + (prezzo * iva / 100.0f);
      return String.format("%.2f", prezzoIvato);
   }

   // inserimento stringa codice prodotto piu nome del Prodotto
   public String venduta() {
      return this.Codice + "-" + this.Nome;
   }

   // inserimento metodo per marca e nome e codice
   public String getMarca() {
      return Marca;
   }

   public String getNome() {
      return Nome;
   }

   public int getCodice() {
      Random rand = new Random();
      return this.Codice = rand.nextInt(90000);
   }

   public float getIva() {
      return iva;
   }

}