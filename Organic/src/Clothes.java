import java.util.ArrayList;

public class Clothes implements ProductInterface {
    private String name;
    private double price;
    private String size;
    private String gender;
    private String[] tag;
    private ArrayList<String> content;
    private int numOfProduct;

    private ArrayList<String> features;


    public Clothes(String name, double price, String size, String gender, String[] tag, ArrayList<String> content, int numOfProduct ) {

        this.name = name;
        this.price = price;
        this.size = size;
        this.gender = gender;
        this.tag = tag;
        this.content = content;
        this.numOfProduct = numOfProduct;

        features = new ArrayList<>();

        addFeatures(name,price,size,gender,tag,content,numOfProduct);

    }

    public void addFeatures(String name, double price, String size, String gender, String[] tag, ArrayList<String> content, int numOfProduct){

        features.add(name);
        features.add( String.valueOf(price) );
        features.add(size);
        features.add(gender);

        for ( String next : tag )
            features.add(next);

        for ( String nextContent : content )
            features.add(nextContent);

        features.add( String.valueOf(numOfProduct) );

    }


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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    public void setNumberOfProduct(int number){this.numOfProduct=number;}
    public int getNumberOfProduct(){return numOfProduct;}

    @Override
    public ArrayList<String> getContent() {
        return content;
    }

    public void setContent(ArrayList<String> content) {
        this.content = content;
    }
}
