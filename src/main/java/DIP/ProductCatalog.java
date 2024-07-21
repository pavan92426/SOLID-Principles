package DIP;

public class ProductCatalog {
    ProductRepository repository;
    //Dependency Injection
    public ProductCatalog(ProductRepository repository) {
        this.repository = repository;
    }

    public void listAllProducts() {
       // ProductRepository repository = ProductFactory.createInstance();
        repository.getAllProducts();
    }
}
