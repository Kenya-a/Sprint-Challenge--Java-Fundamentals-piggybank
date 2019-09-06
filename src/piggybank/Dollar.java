package piggybank;

public class Dollar extends AbstractBank
{
    private double value = 1.0;
    private String coinName = "Dollar";
    private int quantity;

    public Dollar(int quantity)
    {
        this.quantity = quantity;
    }

    public Dollar()
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
        return "$ " + quantity ;
    }

    @Override
    public String getCoinName()
    {
        return coinName;
    }
}