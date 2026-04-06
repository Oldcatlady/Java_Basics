/*
Geometry Practice Task
For this exercise, I am writing a small Java program to practice 
working with formulas, user input, and simple program structure.
First, I create a menu that allows the user to choose between three geometric shapes: 
a cuboid, a sphere, or a cylinder. Depending on the user's choice, 
the program will perform the appropriate calculations.
If the user selects a cylinder, I ask for the radius and the height. 
With these values, I calculate both the volume and the surface area of the cylinder.
If the user chooses a sphere, I only need the radius r. Using this value, 
I calculate the sphere’s circumference, volume, and surface area.
If the user selects a cuboid, I ask for the three side lengths a, b, and c. From these values, 
I calculate the volume, the surface area, the length of the space diagonal, and the total length of all edges.
For the calculations involving circles or spheres, I use Math.PI where necessary.
To control which calculation is performed, I evaluate the menu selection using if-else statements.
*/

import java.util.Scanner;
public class AufgabeGeometrie {
  
  public static void main(String[] args){
      Scanner sc = new Scanner (System.in);

      System.out.println("  ");
      System.out.println("Hallo! Hier kannst du dir das Volumen und die\nOberfläche verschiedener Geometrischer Formen\nberechnen lassen. ");
      System.out.println("Bitte wähle zwischen: \n Quader = 1\n Kugel = 2\n Zylinder = 3");
      System.out.println("Bitte beachte, wenn du eine Kommazahl eingibst,\nmusst du anstelle des Kommas einen Punkt setzen.\nDankeschön.");
      System.out.println("Deine Eingabe: ");

      /*
     Here I use int because only 1,2 or 3 will be entered.
       */

      int auswahl = sc.nextInt();

      /*
      Here comes my loop with 3 possibilities.
       */

      if (auswahl == 1){

          /*
         When option 1 is selected, the program performs the calculations for the cuboid. 
         The user is prompted to enter the side lengths.
           */

          System.out.println("Bitte gib mir die Maße der Seiten a,b und c an: ");

          /*
          The “a” appears immediately. After a number is entered, 
          the next prompt appears automatically.
           */

          System.out.print("a: ");
          double a = sc.nextDouble();

          System.out.print("b: ");
          double b = sc.nextDouble();

          System.out.print("c: ");
          double c = sc.nextDouble();

/*
In this part I define the calculations. By assigning something like "volume", 
I can reference the calculation later. You can see this a bit 
further below, for example when I write + volume.
 */

          double volumen = a * b * c;

          double oberflaeche = 2 * (a*b + a*c + b*c);

          double raumdiagonale = Math.sqrt(a*a + b*b + c*c);

          double kanten = 4 * (a + b + c);

          /*
          The output string has nothing to do with the calculation. 
          It is simply the text that is displayed for the user to read.
           */

          System.out.println("Volumen: " + volumen);
          System.out.println("Oberfläche: " + oberflaeche);
          System.out.println("Raumdiagonale: " + raumdiagonale);
          System.out.println("Gesamtlänge aller Kanten: " + kanten);

      }

      else if(auswahl == 2){

          System.out.println("Bitte nenne mir den Radius (r)");
          System.out.print("r: ");
          double r = sc.nextDouble();

          double oberflaeche = 4 * Math.PI * Math.pow(r, 2);
          double volumen = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

          System.out.println("Oberfläche: " + oberflaeche);
          System.out.println("Volumen: " + volumen);


      }

      else if(auswahl == 3){
          System.out.println("Bitte nenne mir nun den Radius (r) und die Höhe (h).");

          System.out.print("r: ");
          double r = sc.nextDouble();

          System.out.print("h: ");
          double h = sc.nextDouble();

          double volumen = Math.PI * r * r * h;
          double oberflaeche = 2 * Math.PI * r * (r + h);

          System.out.println("Volumen: " + volumen);
          System.out.println("Oberfläche: " + oberflaeche);

      }


  }

}
