package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        /* 
        Creational Pattern
        Its a factory of factories
                      DAOProducer
                          |
                    DAOAbstractFactory
                    /               \
             XMLDaoFactory       DBDaoFactory


                        DAO
                     /       \
               XMLEmpDAO    DBEmpDAO
               XMLDeptDAO   DBDeptDAO         
        */
        
        // create an XML Factory
        DaoAbstractFactory xml_daf = DaoFactoryProducer.produce("XML");

        Dao xml_emp_dao = xml_daf.createDao("emp");
        xml_emp_dao.save();

        Dao xml_dept_dao = xml_daf.createDao("dept");
        xml_dept_dao.save();

        // create a DB Factory
        DaoAbstractFactory db_daf = DaoFactoryProducer.produce("DB");

        Dao db_emp_dao = db_daf.createDao("emp");
        db_emp_dao.save();

        Dao db_dept_dao = db_daf.createDao("dept");
        db_dept_dao.save();
    }
}
