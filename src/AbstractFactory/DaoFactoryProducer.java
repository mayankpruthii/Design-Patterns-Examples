package AbstractFactory;

public class DaoFactoryProducer {
    public static DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory daf = null;
        
        if(factoryType.equals("XML")) {
            daf = new XMLDaoFactory();
        } else if(factoryType.equals("DB")) {
            daf = new DBDaoFactory();
        }
        
        return daf;
    }
}
