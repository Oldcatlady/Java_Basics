package Basics;

public class NichtNurMain {
	/*
	 * Normalerweise, fange ich bislang mit "public static void main(String[] args)" an. 
	 * "main" ist dabei die Methode, mit der das Programm startet.
	 * Mit Methoden wird Code strukturiert, Aufgaben 
	 * werden getrennt. Man kann Teile wiederverwenden und
	 * Programme werden professionell aufgebaut, sagt GPT.
	 * 
	 */
	 public static void main(String[] args) {
		 /*
		  * Diese Methode ist der Einstiegspunkt (main).
		  * Ohne main startet nichts.
		  * main ist der offizielle Einstiegspunkt eines 
		  * eigenständig gestarteten Programms.
		  * Ohne main weiß die JVM nicht, wo sie beginnen soll.
		  */

	        double zahl1 = 10;
	        double zahl2 = 5;
	        
	        /*
	         * Das hier sind meine Variablen, also zahl1 und zahl2. 
	         * Die Werte wie 5 und 10 kann ich nun immer verändern.
	         */

	        double summe = berechneSumme(zahl1, zahl2);
	        double differenz = berechneDifferenz(zahl1, zahl2);
	        
	        /*
	         * Aha, da kann ich also einfach "berechner-irgendwas" 
	         * reinschreiben, und es passiert? Ich könnte es auch Pizza nennen, aber 
	         * dann könnte ich mir schlecht merken, was es macht.
	         */

	        System.out.println("Summe: " + summe);
	        System.out.println("Differenz: " + differenz);
	    }

	    public static double berechneSumme(double a, double b) {
	        return a + b;
	    }
	    /*
	     * Die { } definieren Blöcke.
	     * Alles zwischen { und } gehört zur Methode.
	     * Ohne diese Struktur wüsste Java nicht:
	     * wo eine Methode beginnt
	     * wo sie endet
	     * welcher Code wohin gehört
	     * Die Mothodenblöcke müssen nur unter main sein, sonst braucht es keine hirarchie. 
	     * Aber die geschwungenen Klammern sind wichtig.
	     */

	    public static double berechneDifferenz(double a, double b) {
	        return a - b;
	        /*
	         * Eine Methode besteht aus:
	         * SICHTBARKEIT static RÜCKGABETYP NAME (PARAMETER) {
	         * CODE
	         * return WERT;
	         *     }
	         */

	    
	    }
	}

