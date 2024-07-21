package LSP;

public class Car extends Vehicle{
    @Override
    public int interiorWidth() {
        return this.getCabinettWidth();
    }

    public int getCabinettWidth() {
        return 10;
    }
}
