package DependencyInjection;

import DIP.ProductCatalog;
import DIP.ProductFactory;
import DIP.ProductRepository;

public class DIProductApplication {
    public static void main(String args[]) {
        ProductRepository repository = ProductFactory.createInstance();
        ProductCatalog catalog = new ProductCatalog(repository);
        catalog.listAllProducts();
    }
}
