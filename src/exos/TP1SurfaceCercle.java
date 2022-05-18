package exos;

import java.util.Scanner;

public class TP1SurfaceCercle {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("Entrer le diamètre : ");
        double diametre=clavier.nextDouble();

        double rayon=diametre/2;

        double surface=Math.pow(rayon,2)*Math.PI;
        System.out.println(surface);
    }
}
