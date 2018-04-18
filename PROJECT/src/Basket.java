import java.util.ArrayList;

public class Basket {


    private ArrayList<String> sepet= new ArrayList<>();

    public Basket(){}
    public Basket(ArrayList<String> sepet) {
        this.sepet = sepet;
    }

    public ArrayList<String> getSepet() {
        return sepet;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "sepet=" + sepet +
                '}';
    }
}
