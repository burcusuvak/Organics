import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Guest extends User {
    private ArrayList<String>  filtre= new ArrayList<>();
    private String address;
    private Basket userBasket= new Basket();
    private Wallet userWallet= new Wallet();

    public Guest(){super();}
    public Guest(String name, String surname, String username, String password, String email,char type) {
        super(name,surname,username,password,email,type);
    }

    public boolean upDateFilter(String str)
    {
        return true;
    }

    public void updateInfo()
    {

    }
    public void updateBasket()
    {

    }


    public boolean signUP()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name: ");
        setName(scan.nextLine());
        System.out.println("Enter a surname: ");
        setSurname(scan.nextLine());
        System.out.println("Enter a username: ");
        setUserName(scan.nextLine());
        System.out.println("Enter a password: ");
        setPassword(scan.nextLine());
        System.out.println("Enter a email: ");
        setEmail(scan.nextLine());
        return  true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) &&
                Objects.equals(getSurname(), user.getSurname()) &&
                Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getEmail(), user.getEmail());
    }
}

