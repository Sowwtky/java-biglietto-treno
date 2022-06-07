package jana60;

import java.util.Scanner;

public class BigliettoTreno {

	public static void main(String[] args) {
		
		//variabili
		float numeroChilometri;
		int anniPasseggero;
		float scontoMinorenni;
		float scontoOver65;
		
		//inizializzo scanner
		Scanner scan = new Scanner(System.in);
		
		//chiedo input all'utente
		System.out.println("Chilometri da percorrere:");
		numeroChilometri = scan.nextFloat();
		
		System.out.println("Etá passeggero:");
		anniPasseggero = scan.nextInt();
		
		//dichiaro variabile prezzo biglietto
		float prezzoBiglietto = numeroChilometri * 0.21f;
		
		//controllo validitá dati inseriti dall'utente
		if (anniPasseggero >= 0 && numeroChilometri >= 1) {
			
			//calcolo sconto minorenni
			if (anniPasseggero < 18) {
				scontoMinorenni = prezzoBiglietto - (prezzoBiglietto * 0.2f);
				System.out.println("Normalmente il prezzo del biglietto sarebbe: " + prezzoBiglietto + " euro");
				System.out.println("Verrá applicato un sconto del 20% riservato ai minorenni. Il prezzo del biglietto é quindi:");
				System.out.println(scontoMinorenni + " euro");
				
			//calcolo sconto over 65
			} else if (anniPasseggero > 65) {
				scontoOver65 = prezzoBiglietto - (prezzoBiglietto * 0.4f);
				System.out.println("Normalmente il prezzo del biglietto sarebbe: " + prezzoBiglietto + " euro");
				System.out.println(
						"Verrá applicato uno sconto del 40% riservato agli over 65. Il prezzo del biglietto é quindi:");
				System.out.println(scontoOver65 + " euro");
			
			//prezzo in qualsiasi altro caso
			} else {
				System.out.println("Il prezzo del biglietto é: " + prezzoBiglietto);
			} 
			
		//messaggio in caso i dati inseriti non siano validi
		} else {
			System.out.println("L'etá o i chilometri inseriti non sono validi. Riprova");
		}
		
		//chiudo scan
		scan.close();

	}

}
