package piggybank;

public class Penny extends AbstractBank
{
    private double value = 0.01;
    private String coinName = "Penny";
    private int quantity;

    public Penny(int quantity)
    {
        this.quantity = quantity;
    }

    public Penny()
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
        return quantity + " Pennies ";
    }

    @Override
    public String getCoinName()
    {
        return coinName;
    }
}