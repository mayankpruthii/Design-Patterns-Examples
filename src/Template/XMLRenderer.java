package Template;

public class XMLRenderer extends DataRenderer {
    @Override
    public String read() {
        String data = "XML data";
        return data;
    }

    @Override
    public String process(String xmlString) {
        String data = "Processing " + xmlString;
        return data;
    }
}
