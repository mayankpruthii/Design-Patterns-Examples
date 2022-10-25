package Iterator;

public class ProductIterator implements Iterator {
    Product[] products;
    int pos = 0;

    public ProductIterator(Product[] products) {
        this.products = products;
    }
    
    @Override
    public boolean hasNext() {
        if(pos >= products.length || products[pos] == null) {
            return false;
        } 
        return true;
    }

    @Override
    public Object next() {
        return products[pos++];
    }
       
}
