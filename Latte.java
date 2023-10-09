package sdp2;

public class Latte implements Coffee{
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double cost() {
        return 500.0;
    }
}
