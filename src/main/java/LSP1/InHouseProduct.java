package LSP1;

public class InHouseProduct extends Product {

    @Override
    public int getDiscount() {
        this.getExtraDiscount();
        return discount;
    }

    public void getExtraDiscount() {
        discount = discount*2;
    }
}
