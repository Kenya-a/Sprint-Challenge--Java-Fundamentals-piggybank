package piggybank;

public abstract class AbstractBank 
{
    String coinName;
    int quantity;
    double balance;
    double value;
    
    public String getCoinName()
    {
        return coinName;
    }

    public AbstractBank(int quantity)
    {
        this.quantity = quantity;
    }

    public AbstractBank()
    {
        quantity = 1;
    }

    public int getQuanity()
    {
        return quantity;
    }

    public double getBalance()
    {
        return value * quantity;
    }

    public double getValue()
    {
        return value;
    }


}