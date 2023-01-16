import java.util.ArrayList;

public class Branches {
    private String name;
    private ArrayList<Customers> customerList;

    public Branches(String name)
    {
        this.name = name;
        customerList = new ArrayList<Customers>();
    }

    public ArrayList<Customers> getCustomerList() {
        return customerList;
    }

    public String getName() {
        return name;
    }

    public void addCustomer(String name)
    {
        Customers customer = new Customers(name);
        customerList.add(customer);
        System.out.println("Customer " + name + " added");
    }

    public void transaction(String name, double amount)
    {
        int index = foud(name);
        if(index >= 0) {
            Customers myCustomer = customerList.get(index);
            myCustomer.transaction(amount);
        }else
        {
            System.out.println("Name does not found");
        }
    }

    public int foud(String name)
    {
        for(int i = 0; i < customerList.size(); i++)
        {
            if(customerList.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public void printCustomerList()
    {
        System.out.println("Customer list of " + name);
        for(int i = 0; i < customerList.size(); i++)
        {
            System.out.println((i + 1) + ". " + customerList.get(i).getName());
        }
    }
}
