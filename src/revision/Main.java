package revision;

public class Main {
    public static void main(String[] args) {
        //Constructeur par défaut par défaut
        Employe chris=new Employe(1,"christian","lisangola");
        System.out.println("ID : "+chris.getId());
        System.out.println("Prenom : "+chris.getFirstName());
        System.out.println("Nom : "+chris.getLastName());

        chris.setLastName("Zozor");
        System.out.println("Nom : "+chris.getLastName());



        System.out.println(Employe.AGE_RETRAITE);
        Employe.calculateSalary(78);



        Validator.isEmail("jean@gmail.com");

    }
}
