package AbstractFactory;

public class XMLDeptDao implements Dao {
    public void save() {
        System.out.println("Saving department to XML");
    }
}
