import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductManagement {

    private ArrayList<ProductInterface> allProducts= new ArrayList<>();

    public ProductManagement(){}

    protected boolean addProduct(ProductInterface product){return  true;}
    protected boolean deleteProduct(ProductInterface product){return true;}

    private void CSVReaderProduct()
    {


    }
}
