import java.util.Objects;

public class Company extends User {
    private String name;
    private Wallet companyWallet=new Wallet();

    public Company() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getCompanyWallet() {
        return companyWallet;
    }

    public void setCompanyWallet(Wallet companyWallet) {
        this.companyWallet = companyWallet;
    }

    public boolean addProduct(ProductInterface pro){
        return true;
    }
    public boolean deleteProduct(ProductInterface pro){
        return true;
    }
    public boolean stockProduct(ProductInterface pro){
        return true;
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
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", companyWallet=" + companyWallet +
                '}';
    }
}
