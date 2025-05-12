
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prodotto[] Carrello = new Prodotto[3];
        for (int i = 0; i < Carrello.length; i++) {
            System.out.println("Inserisci la tipologia del prodotto acquistato:");
            String TipoProdotto = scanner.nextLine().trim();

            if (TipoProdotto.equalsIgnoreCase("Smartphone")) {
                System.out.println("Nome:");
                String Nome = scanner.nextLine().trim();
                System.out.println("Marca:");
                String Marca = scanner.nextLine().trim();

                Carrello[i] = new Smartphone("Galaxy S24", "Samsung", 0, 500, 22, "b0123456789", 128);

            }

            else if (TipoProdotto.equalsIgnoreCase("Televisori")) {
                System.out.println("Nome:");
                String Nome = scanner.nextLine().trim();
                System.out.println("Marca:");
                String Marca = scanner.nextLine().trim();
           

                Carrello[i] = new Televisori("Bravia X90", "Sony", 0, 1499, 22, 55, true);
            } else if (TipoProdotto.equalsIgnoreCase("Cuffie")) {
                System.out.println("Nome:");
                String Nome = scanner.nextLine().trim();
                System.out.println("Marca:");
                String Marca = scanner.nextLine().trim();

                Carrello[i] = new Cuffie("AirPods", "Apple", 0, 199, 22, "Bianco", "wireless");

            } else {
                System.out.println("Tipologia non riconosciuta. Salto questo prodotto o ritorna indietro.");
            }
               System.out.println("\n--- CONTENUTO DEL CARRELLO ---");
        for (Prodotto Finale : Carrello) {
            if (Finale != null)
                System.out.println(Finale);
        }

        }
      
        scanner.close();
    }
}
