package exos;

import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        byte nombre=clavier.nextByte();
        boolean estPair=nombre%2==0;

        if(nombre>0){
            System.out.printf("%d est positif et %s",nombre,(estPair?"pair":"impair"));
        }else if(nombre<0){
            System.out.printf("%d est négatif et %s",nombre,(estPair?"pair":"impair"));
        }else{
            System.out.println("0 et pair");
        }
    }
}
