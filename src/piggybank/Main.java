package piggybank;

import java.util.*;
import java.text.DecimalFormat;


public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("###,###.00");

        //creating an ArrayList that is the PiggyBank

        ArrayList<AbstractBank> bank = new ArrayList<AbstractBank>();

        bank.add(new Quarter());
        bank.add(new Dime());
        bank.add(new Dollar(5));
        bank.add(new Nickel(3));
        bank.add(new Dime(7));
        bank.add(new Dollar(1));
        bank.add(new Penny(10));
        

        //loop
        for(int i = 0; i < bank.size(); i++)
        {
            System.out.println(bank.get(i).toString());
        }

        //total
        double total = 0.0;

        for(int i = 0; i < bank.size(); i++)
            {
           total += bank.get(i).getBalance();
        }

        System.out.println("The piggy bank holds: " + fp.format(total));

        
    }
}