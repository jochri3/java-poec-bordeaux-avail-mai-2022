package exos;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=clavier.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=clavier.nextLine();

        System.out.print("Votre age : ");
        byte age=clavier.nextByte();

        System.out.printf("Vous appelez %s %s et vous avez %d ans",prenom,nom,age);
    }
}
