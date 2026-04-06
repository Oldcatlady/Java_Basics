import java.util.Scanner;
	package Basics;
 
	/*
	 * import bedeutet:
	 * „Ich möchte ein fertiges Werkzeug aus der Java-Bibliothek benutzen.“
	 * Also so, wie wenn ich meine Bohrmaschine mit zu meiner Freundin nehme.
	 * java.util.Scanner ist dieses Werkzeug.
	 * Es ermöglicht, Eingaben von der Tastatur zu lesen,
	 * also z. B. Namen oder Zahlen.
	 *  Ohne diese Zeile könnte Java nicht wissen, 
	 *  was Scanner ist, und dein Programm 
	 *  würde einen Fehler geben.
	 */

     public class WorkingWithTheScanner {
	 public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				/*
				 * 1. Scanner
				 * Das ist der Datentyp für mein Werkzeug.
				 * Ich sagen Java: „Ich möchte ein Scanner-Objekt verwenden.“
				 * 2. sc
				 * Das ist der Name der Variablen.
				 * Ich kann sie später benutzen, 
				 * um Eingaben zu lesen, z. B. sc.nextLine().
				 * 3. new Scanner(System.in)
				 * new erstellt ein neues Scanner-Objekt.
				 * System.in bedeutet: „Die Eingabe kommt von der Tastatur.“
				 */
		 
				System.out.println("Wie heißt du?");
				System.out.println("Name:");
				String name= sc.nextLine();
		 
				/*
				 * nextLine() liest eine ganze Textzeile ein.
				 * Perfekt für Namen oder Antworten wie „Hamburg“ etc.
				 */
		 
				System.out.println("Hallo, "+name+"! Schön dich kennen zu lernen. ");
				System.out.println("Sagst du mir, wie alt du bist?");
				int alter = sc.nextInt();
		 
				/*
				 * Wichtig: nextInt() liest nur die Zahl, nicht den Zeilenumbruch.
				 * Wenn danach nextLine() kommt, muss ich die Zeile leeren:
				 * sc.nextLine();
				 */
		 
				System.out.println("Und wie groß bist du?");
				double groesse = sc.nextDouble();
				sc.nextLine(); // Zeilenumbruch auffressen
				
		 		/*
				 * nextDouble() liest eine Zahl mit Komma/Punkt.
				 * Danach nextLine() aufrufen, 
				 * falls ich wieder Strings einlesen möchte.
				 */
				
				System.out.println("Danke, " + name + "!");
		        System.out.println("Du bist also " + alter + " Jahre alt und bist " + groesse + " groß.");
				
				sc.close();
				/*
				 * Hier schließe ich den Scanner, sonst kann das Programm meckern.
				 */
			}
			

		}


