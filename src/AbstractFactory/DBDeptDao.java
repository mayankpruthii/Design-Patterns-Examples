package AbstractFactory;

public class DBDeptDao implements Dao {
    public void save() {
        System.out.println("Saving department to DB");
    }
}
