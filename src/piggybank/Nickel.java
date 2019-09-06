package piggybank;

public class Nickel extends AbstractBank
{
    private double value = 0.05;
    private String coinName = "Nickel";
    private int quantity;

    public Nickel(int quantity)
    {
        this.quantity = quantity;
    }

    public Nickel()
    {
        this.quantity = 1;
    }

    public void setName(String coinName)
    {
        this.coinName = coinName;
    }

    public void setQuanity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setBalance(int quantity)
    {
        this.balance = this.quantity * this.value;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
   
    public double getBalance()
    {
        return quantity * value; 
    }
    
    @Override
    public String toString()
    {
        return quantity + " " + coinName;
    }

    @Override
    public String getCoinName()
    {
        return coinName;
    }
}