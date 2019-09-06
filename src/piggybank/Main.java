package piggybank;

import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        //creating an ArrayList that is the PiggyBank

        ArrayList<AbstractBank> bank = new ArrayList<AbstractBank>();

        bank.add(new Dime());
        bank.add(new Dime(7));

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

        System.out.println("Total: " + total);

        
    }
}