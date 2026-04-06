package Basics;
/*
 * Projekt-Mappe oder Arbeitsodner
 * Package-Unterodner oder Kategorie
 * Class-Blatt oder Dokument
 */
public class ÜbungsArrays {
	public static void main(String[] args) {
		
		/*
		 * Die main Methode ist der Einstiegspuntk des Programs.
		 * public - die Methode ist von überall aufrufbar.
		 * static - die Methode gehört zu zur Class, nicht zu einem Objekt.
		 * void - die Methode gibt keinen Wert zurück. 
		 * main - Name der Startmethode, von Java festgelegt.
		 * String[] args - Übergabe von Eingabeparametern beim Programmstart. 
		 */
		
		int anzahl=10;
		/* 
		 * Ein int speichert ganze Zahlen, keine Kommazahlen oder so.
		 * Ich erstelle eine Ganzzahl-Variable namens anzahl mit dem Wert 10
		 */
		int[] zahlen = new int[anzahl];
		/* 
		 * int[] - jetzt entsteht ein Array aus ganzen Zaheln.
		 * zahlen - Name des Array.
		 * new int [] - es wird ein neues Array, deren Anzahl von Plätzen
		 * in der Klammer eingefügt wird.
		 * Ich füge "anzahl" in die Klammer ein. Das ich die int anzahl zuvor festgelegt habe,
		 * erhalte ich jetzt 10 Speicherplätze. So kann ich Später die 
		 * Anzahl der Speicherplätze verändern.
		 */
		    
		    zahlen[0] = 0 * 0;  
		    zahlen[1] = 1 * 1;  
		    zahlen[2] = 2 * 2;  
		    zahlen[3] = 3 * 3;  
		    zahlen[4] = 4 * 4;  
		    zahlen[5] = 5 * 5;  
		    zahlen[6] = 6 * 6;  
		    zahlen[7] = 7 * 7;  
		    zahlen[8] = 8 * 8;  
		    zahlen[9] = 9 * 9;  
		    /*
		     * Ich weise jedem Element des Arrays "zahlen" das Quadrat seines Indexes zu.
		     */
		    
		    System.out.println(zahlen[9]);
	        System.out.println(zahlen[8]);
	        System.out.println(zahlen[7]);
	        System.out.println(zahlen[6]);
	        System.out.println(zahlen[5]);
	        System.out.println(zahlen[4]);
	        System.out.println(zahlen[3]);
	        System.out.println(zahlen[2]);
	        System.out.println(zahlen[1]);
	        System.out.println(zahlen[0]);
	        /*
	         * system.out.println - Gib etwas auf der Konsole aus und mache danach einen Zeilenumbruch.
	         * Ich durchlaufe das Array hier manuell rückwärts 
	         * und gebe jedes Element einzeln aus.
	         */

	}



}
