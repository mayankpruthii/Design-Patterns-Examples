package Factory;

public class ChickenPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Chicken Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Chicken Pizza");
    }
}
