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
		//calcolo prezzo biglietto
		if(anniPasseggero < 18) {
			scontoMinorenni = prezzoBiglietto * 0.2f;
			System.out.println("Normalmente il prezzo del biglietto sarebbe: " + prezzoBiglietto + " euro");
			System.out.println("Ma verrá applicato un sconto del 20% riservato ai minorenni. Il prezzo del biglietto é quindi:");
			System.out.println(scontoMinorenni + " euro");
		}else if(anniPasseggero > 65) {
			scontoOver65 = prezzoBiglietto * 0.4f;
			System.out.println("Normalmente il prezzo del biglietto sarebbe: " + prezzoBiglietto + " euro");
			System.out.println("Verrá applicato uno sconto del 40% riservato agli over 65. Il prezzo del biglietto é quindi:");
			System.out.println(scontoOver65 + " euro");
		}else {
			System.out.println("Il prezzo del biglietto é: " + prezzoBiglietto);
		}
		
		scan.close();

	}

}
