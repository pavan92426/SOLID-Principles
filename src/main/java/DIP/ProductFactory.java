package DIP;

public class ProductFactory {

    public static ProductRepository createInstance() {
        return new SQLProdRepository();
    }
}
