import java.util.ArrayList;

public class Bank {
    private ArrayList<Branches> branchesList;

    public Bank()
    {
        branchesList = new ArrayList<Branches>();
    }

    public void addBranche(String name)
    {
        Branches branches = new Branches(name);
        branchesList.add(branches);
    }

    public void addCustomerTo(String brancheName, String customerName)
    {
        int index = find(brancheName);
        if(index >= 0)
        {
            Branches myBranche = branchesList.get(index);
            myBranche.addCustomer(customerName);
        }else
        {
            System.out.println("Branche not found");
        }
    }

    public void transaction(String brench, String name, double amount)
    {
        int index = find(brench);
        if(index >= 0)
        {
            Branches myBranch = branchesList.get(index);
            myBranch.transaction(name, amount);
        }else
        {
            System.out.println("Brench not found");
        }
    }

    private int find(String name)
    {
        for(int i = 0; i < branchesList.size(); i++)
        {
            if(branchesList.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public void printBranch()
    {
        System.out.println("BANK has " + branchesList.size() + " branches: ");
        for(int i = 0; i < branchesList.size(); i++)
        {
            System.out.println((i + 1) + ". " + branchesList.get(i).getName());
        }
    }

    public void printBranch(String branchName)
    {
        int index = find(branchName);
        if(index >= 0)
        {
            Branches myBranche = branchesList.get(index);
            myBranche.printCustomerList();
        }else
        {
            System.out.println("Branch not found");
        }
    }

    public void printBranch(String branchName, String customerName)
    {
        int index = find(branchName);
        if(index >= 0)
        {
            Branches myBranch = branchesList.get(index);
            index = myBranch.foud(customerName);
            if(index >= 0)
            {
                Customers myCustomer = myBranch.getCustomerList().get(index);
                myCustomer.printTransaction();
            }else {
                System.out.println("Name not found");
            }
        }else
        {
            System.out.println("Branch not found");
        }
    }
}
