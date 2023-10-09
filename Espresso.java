package sdp2;

public class Espresso implements Coffee{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 650.0;
    }
}
