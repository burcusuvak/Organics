public class Wallet {
    private int ID;
    private double amount;

    public Wallet() {}

    public Wallet(int ID, double amount) {
        this.ID = ID;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "ID=" + ID +
                ", amount=" + amount +
                '}';
    }
}
