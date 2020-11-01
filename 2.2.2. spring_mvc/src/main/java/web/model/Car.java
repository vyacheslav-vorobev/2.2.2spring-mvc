package web.model;

public class Car {
    private final String model;
    private final int maxSpeed;
    private final long price;
    public Car(String model, int maxSpeed, long price){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    @Override
    public String toString() {
        return "model: "+ model + "\n"
                + "maxSpeed:"+ maxSpeed + "\n"
                + "price: "+ price + "\n";
    }
    public String getModel(){
        return model;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public long getPrice() {
        return price;
    }
}
