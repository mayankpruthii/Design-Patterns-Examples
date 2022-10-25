package Template;

public abstract class DataRenderer {
    public void render() {
        String readString = this.read();
        System.out.println("Reading " + readString);
        String processString = this.process(readString);
        System.out.println(processString);

        System.out.println("Rendering " + readString);
    }

    public abstract String read();

    public abstract String process(String readString);
}
