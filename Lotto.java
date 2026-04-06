package Basics;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * Ich simuliere eine Lottoziehung von 6 Zahlen aus 49 plus einer
		 * Zusatzzahl. Anschließend gebe ich die sechs Zahlen aus, wobei die Zusatzzahl 
		 * besonders gekennzeichnet ist.
		 */
		
		int anzahl=7;
		int[] lottozahlen= new int[anzahl];
		lottozahlen[0]=8;
		lottozahlen[1]=19;
		lottozahlen[2]=35;
		lottozahlen[3]=6;
		lottozahlen[4]=17;
		lottozahlen[5]=44;
		lottozahlen[6]=9;
		/*
		 * Diese Lottozahlen habe ich mir jetzt einfach ausgedacht und festgehalten.
		 * Jetzt habe ich ein Array von Zahlen angelegt und alle Werte bestimmt.
		 */
		System.out.println("Es folgen die Lottozahlen");
		System.out.println(lottozahlen[0]);
		/*
		 * Hier bestimme ich jetzt, was ausgegeben wird. Der Wert in der runden Klammer
		 * wird ausgegeben.
		 */
		System.out.println(lottozahlen[1]);
		System.out.println(lottozahlen[2]);
		System.out.println(lottozahlen[3]);
		System.out.println(lottozahlen[4]);
		System.out.println(lottozahlen[5]);
		System.out.println("Die Superzahl lautet: "+lottozahlen[6]);
		
		
		

	}

}
