package Template;

public class CSVRenderer extends DataRenderer {
    
    @Override
    public String read() {
        String data = "CSV data";
        return data;
    }

    @Override
    public String process(String csvString) {
        String data = "Processing " + csvString;
        return data;
    }
}
