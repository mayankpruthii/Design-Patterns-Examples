package AbstractFactory;

public class XMLEmpDao implements Dao {
    public void save() {
        System.out.println("Saving employee to XML");
    }
}
