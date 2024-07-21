package DIP;

public class SQLProdRepository implements ProductRepository{
    @Override
    public void getAllProducts() {
        System.out.println("Printing all products");
    }
}
