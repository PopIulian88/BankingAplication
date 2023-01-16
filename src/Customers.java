import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactionsList;

    public Customers(String name)
    {
        this.name = name;
        transactionsList = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void transaction(double amount)
    {
        transactionsList.add(amount);
        System.out.println("U transactionate: " + amount);
    }

    public void printTransaction()
    {
        System.out.println("Transaction list of " + name);
        for(int i = 0; i < transactionsList.size(); i++)
        {
            System.out.println((i + 1) + ". " + transactionsList.get(i));
        }
    }
}
