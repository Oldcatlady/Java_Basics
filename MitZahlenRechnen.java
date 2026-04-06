package Basics;

public class MitZahlenRechnen {
	public static void main(String[] args) {
		/*
		 * So, Ich möchte jetzt ein Programm schreiben, 
		 * dass zwei Zahlen als Variable speichert und 
		 * folgendes daraus berechnet: 
		 * 
		 * Eine Summe, 
		 * eine Differenz, 
		 * ein Produkt und 
		 * einen Quotienten. 
		 * 
		 * Das Programm soll die 
		 * Ergebnisse jeweils in einem 
		 * Satz ausgeben.
		 */
	

	        // Zwei Zahlen als Variablen, die kann ich so viel verändern, wie ich will
	        double zahl1 = 14.3;
	        double zahl2 = 2.5;

	        // Berechnungen
	        double summe = zahl1 + zahl2;
	        double differenz = zahl1 - zahl2;
	        double produkt = zahl1 * zahl2;
	        double quotient = zahl1 / zahl2;

	        // Ergebnisse ausgeben
	        System.out.println("Sollte ich " + zahl1 + " mit " + zahl2 + " addieren, ist mein Ergebnis " + summe + ".");
	        System.out.println("Die Differenz von " + zahl1 + " und " + zahl2 + " ist " + differenz + ".");
	        System.out.println("Die Zahl " + zahl1 + " mal " + zahl2 + " ergibt als Ergebnis " + produkt + ".");
	        System.out.println("Wenn ich " + zahl1 + " durch " + zahl2 + " teile, ergibt das " + quotient + ".");

	}

}
