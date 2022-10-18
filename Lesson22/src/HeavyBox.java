import java.util.Random;
public class HeavyBox {
    private double weight;
    public HeavyBox(){
        Random rdm = new Random();
        this.weight = Math.round((rdm.nextDouble(200)+200.0)*100.0)/100.0;
    }
    public HeavyBox(double weight){this.weight = weight;}

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    @Override
    public String toString() {return "Weight=" + weight;}
}