import java.util.ArrayList;

public class Cosmetics implements ProductInterface {

    private String name;
    private double price;
    private boolean gender;
    private String[] tag;
    private ArrayList<String> content;
    private int numOfProduct;

    public Cosmetics() {}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    @Override
    public ArrayList<String> getContent() {
        return content;
    }

    public void setContent(ArrayList<String> content) {
        this.content = content;
    }

    public void setNumberOfProduct(int number){this.numOfProduct=number;}
    public int getNumberOfProduct(){return numOfProduct;}
}
