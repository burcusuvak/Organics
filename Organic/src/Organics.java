import java.util.ArrayList;
import java.io.*;

public class Organics {


    public QueueList<Basket> order= new QueueList<>();
    public ProductManagement productManagement= new ProductManagement();
    //public BinarySearchTree<ProductInterface>
    public KWPriorityQueue<ProductManagement> priorityProducts= new KWPriorityQueue<>();
    private LoginPanel p = new LoginPanel();

    public Organics(){
        
    }
    
    public void start(){
    	p.loginOrRegister();
    	
    }

    public void showProductWithPriority()
    {

    }




}
