package game;

import java.util.Scanner;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion AvocatCommisDOffice
 *
 */

public abstract class Affichage {
    private static Scanner scanner;

    public static int lireInt() {
        if (scanner != null) {
            return scanner.nextInt();
        }else{
            scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
    }

    public static void close(){
        scanner.close();
    }
}
