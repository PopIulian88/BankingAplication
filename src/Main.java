import java.util.Scanner;

public class Main {
    private static Bank bank = new Bank();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bank manu: ");
        bankManu();
        boolean flag = true;
        while(flag)
        {
            System.out.print("Type: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    flag = false;
                    break;

                case 1:
                    System.out.print("Name the new branch: ");
                    String branchName = scanner.nextLine();
                    bank.addBranche(branchName);
                    break;

                case 2:
                    bank.printBranch();
                    break;

                case 3:
                    System.out.print("New customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("To branch: ");
                    String customerBranchName = scanner.nextLine();
                    bank.addCustomerTo(customerBranchName, customerName);
                    break;

                case 4:
                    System.out.print("Type the branch: ");
                    String bankCustomers = scanner.nextLine();
                    bank.printBranch(bankCustomers);
                    break;

                case 5:
                    System.out.print("Your branch: ");
                    String branchTransaction = scanner.nextLine();
                    System.out.print("Your name: ");
                    String customerTransaction = scanner.nextLine();
                    System.out.println("How many: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    bank.transaction(branchTransaction, customerTransaction, amount);
                    break;

                case 6:
                    System.out.print("Type the branch: ");
                    String branchPrint = scanner.nextLine();
                    System.out.print("Type the name: ");
                    String customerPrint = scanner.nextLine();
                    bank.printBranch(branchPrint, customerPrint);
                    break;

                case 7:
                    bankManu();
                    break;

                default:
                    System.out.println("Not good man");
                    break;
            }
        }
    }


    public static void bankManu()
    {
        System.out.println("0. Close");
        System.out.println("1. Add branch");
        System.out.println("2. Print Branches");
        System.out.println("3. Add Customer");
        System.out.println("4. Print Customers");
        System.out.println("5. Transact");
        System.out.println("6. Print Transaction");
        System.out.println("7. Option list");
    }
}
