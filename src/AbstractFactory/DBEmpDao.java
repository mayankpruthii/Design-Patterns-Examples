package AbstractFactory;

public class DBEmpDao implements Dao {
    public void save() {
        System.out.println("Saving employee to DB");
    }
}
