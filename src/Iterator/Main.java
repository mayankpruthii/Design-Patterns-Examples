package Iterator;

public class Main {
    /*
     * Iterator Pattern is a relatively simple 
     * and frequently used design pattern. There 
     * are a lot of data structures/collections 
     * available in every language. Each collection 
     * must provide an iterator that lets it iterate 
     * through its objects. However while doing so it 
     * should make sure that it does not expose its 
     * implementation. Suppose we are building an 
     * application that requires us to maintain a list 
     * of notifications. Eventually, some part of your 
     * code will require to iterate over all notifications
     */
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.addProduct(new Product("iphone"));
        products.addProduct(new Product("ipad"));
        products.addProduct(new Product("macbook"));

        Iterator it = products.createIterator();
        while(it.hasNext()) {
            Product product = (Product) it.next();
            System.out.println(product.getName());
        }
    }
}
