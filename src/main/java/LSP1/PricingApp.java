package LSP1;

import java.util.ArrayList;
import java.util.List;

public class PricingApp {

    public static void main(String args[]) {
        Product p1 = new Product();
        Product p2 = new InHouseProduct();
        Product p3 = new Product();
        List<Product> products =  new ArrayList<Product>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        for( Product prod : products){
            /*if(prod instanceof InHouseProduct){
                ((InHouseProduct)prod).getExtraDiscount();
            }*/
            System.out.println("Product:"+prod.getDiscount());
        }
    }
}
