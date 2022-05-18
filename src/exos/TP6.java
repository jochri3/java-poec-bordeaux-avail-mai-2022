package exos;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
        HashMap<Integer,String> mois=new HashMap<>();
//        Approche 1
//        mois.put(1,"janvier");
//        mois.put(2,"Fevrier");
//        mois.put(3,"Mars");
//        mois.put(4,"Avril");
//        mois.put(5,"Mai");
//        mois.put(6,"Juin");
//        mois.put(7,"Juillet");
//        mois.put(8,"Aout");
//        mois.put(9,"Septembre");
//        mois.put(10,"Octobre");
//        mois.put(11,"Novembre");
//        mois.put(12,"Decembre");

//        Approche 1
        String[] moisAnnee={"janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet",
                "Aout","Septembre","Octobre","Novembre","Decembre"};
        String[] abc=new String[30];

        for(int i=0;i<moisAnnee.length;i++){
            mois.put(i+1,moisAnnee[i]);
        }

        Scanner clavier=new Scanner(System.in);
        int valeurMois;

        while (true){
           try{
               System.out.print("Entrez un mois : ");
               valeurMois=clavier.nextInt();
               if(valeurMois>=1 && valeurMois<=12){//[1,12]
                   break;
               }
               System.out.println("Veuillez saisir une valeur entre 1 et 12");
           }catch (InputMismatchException e){
               System.out.println("Veuiller entrer un nombre");
               clavier.nextLine();
           }

        }
        System.out.println(mois.get(valeurMois));
    }
}
