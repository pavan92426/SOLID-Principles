package LSP;

public class RacingCar extends Vehicle{
    @Override
    public int interiorWidth() {
        return this.getCockpitWidth();
    }

    public int getCockpitWidth() {
        return 10;
    }
}
