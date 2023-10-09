package sdp2;

public abstract class CondimentDecorator implements Coffee{
    protected Coffee coffee;
    public CondimentDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}

