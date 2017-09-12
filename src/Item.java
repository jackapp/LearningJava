/**
 * Created by ankur on 23/8/17.
 */
public class Item {


    private double weight;
    private int cost;
    private int index;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "index=" + index +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }

}
