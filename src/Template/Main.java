package Template;

public class Main {
    public static void main(String[] args) {
        /*
        Behavioral Method
        Somewhat like Strategic Pattern
                    DataRenderer
                    - render()
                    - read()                      
                    - process()
                /               \
            CSVRenderer         XMLRenderer
            - read()            - read()
            - process()         - process()
        */

        DataRenderer xml_renderer = new XMLRenderer();
        xml_renderer.render();

        DataRenderer csv_renderer = new CSVRenderer();
        csv_renderer.render();
    }
}
