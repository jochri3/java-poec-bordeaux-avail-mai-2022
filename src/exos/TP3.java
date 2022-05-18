package exos;

public class TP3 {
    public static void main(String[] args) {
        // a=51,b=876 et c=235;
        // a=235(c), b = 51(a) et c = 876(b)

        short a=51;
        short b=876;
        short c=235;
        System.out.printf("Before : a = %d, b = %d, c = %d\n",a,b,c);

        short temp=b;
        b=a;//b = 51,a=51,c=235, temp=b(876)
        a=c;
        c=temp;
        System.out.printf("After : a = %d, b = %d, c = %d\n",a,b,c);

    }
}
