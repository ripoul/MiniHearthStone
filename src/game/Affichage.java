package game;

import java.util.Scanner;

public class Affichage {
    Scanner scanner;

    public Affichage(){
        scanner = new Scanner(System.in);
    }

    public int lireInt(){
        return scanner.nextInt();
    }

    public void close(){
        scanner.close();
    }
}
