package revision;

public class Employe {
    private int id;
    private String firstName;
    private String lastName;
    public final static int AGE_RETRAITE=64;

    public Employe(int id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int calculateSalary(int baseBase){
        return 56;
    }


    public String toString(){
        return String.format("{ id : %d , nom : %s , prenom : %s }",this.id,this.lastName
                ,this.firstName);
    }


//    @Override
//    public String toString() {
//        return "Employe{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
}
