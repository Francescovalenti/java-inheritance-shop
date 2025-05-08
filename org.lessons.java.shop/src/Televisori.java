public class Televisori extends Prodotto {
   private int Dimensioni;
   private boolean smart;

   public Televisori (String Nome,String Marca,int Codice,double prezzo,double iva, int Dimensioni, boolean smart){
    super(Nome, Marca, Codice, prezzo, iva);
    this.Dimensioni=Dimensioni;
    this.smart=smart;
   }
    
}
