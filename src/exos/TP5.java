package exos;

public class TP5 {
    public static void main(String[] args) {
        double a=1,b=4,c=1,x1,x2;
        double delta=Math.pow(b,2)-4*a*c;
        if(delta>0){
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.printf("x1 = %f , x2 = %f",x1,x2);
        }else if(delta==0){
            x1=-b/2*a;
            x2=x1;
            System.out.printf("x1 = x2 = %f",x1);
        }else{
            System.out.println("L'équation n'admet aucune racine réelle.");
        }
    }
}
