
public class AufgabenArray {
	public static void main(String[] args) {
	
	/* Ich muss int nehmen, weil es um ganze Zahlen geht. 
	 * In dieser Schreibweise bekommt mein Array 
	 * so viele Plätze wie ich ihm zuweise.
	 * So kann ich die Anzahl einfach verändern.
	 */
	int anzahl=10;
	/* Array soll 10 Plätze haben
	 * 
	 */
	int[] zahlen = new int[anzahl];
	/* Array wird erzeugt
	 * 
	 */
	
	/* i ist eine Variable, die nur innerhalb meiner
	 * Schleife vorkommt. Darf ich schon Schleifen machen? i steht für Index.
	 * int i=0 - startet bei Null
	 * i < zahlen.length → gehe bis zum letzten Index 
	 * -also heißt das, es geht bis zum Ende des Index?
	 * i++ → erhöhe i um 1 nach jedem Durchlauf - macht irgendwie Sinn. 
	 * zahlen[i] = i * i → speichere das Quadrat von i an der Stelle i 
	 * -ah ja cool, mal sich selbst, ok.
	 * for ist eine Schleife – sie wiederholt einen Codeblock mehrmals, 
	 * bis eine Bedingung erfüllt ist. -Startwert, Bedingung, Schrittweite
	 * for (int i = 0; i < zahlen.length; i++) {
	    zahlen[i] = i * i; - Aber eine Schleife darf ich noch nicht benutzen.
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
	     * Das Sternchen nimmt mal. So bekomme ich das mit dem zum Quadrat hin.
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
	    
	
	}
	}
	
