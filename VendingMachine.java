package VendingMachine;

import java.util.Scanner;

public class VendingMachine {
    int item_id;
    double amountPaid;
    double balanceAmount=0;
    double amountInVendingMachine=0;

    public void menuCard(){
        System.out.println("-----Welcome to Foodie--------");
        System.out.println("Item_id----- Item----- Rate");
        System.out.println("1.Chocolate---10");
        System.out.println("2.IceCream---30");
        System.out.println("3.Burger---140");
        System.out.println("4.Pizza---210");
        System.out.println("5.Sandwich---50");
        userOrder();
    }

    public void userOrder(){
        String nextOrder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item_id");
        item_id = sc.nextInt();
        System.out.println("Enter amount paid");
        amountPaid = sc.nextDouble();
        balanceAmountCalculation();
        System.out.println("Do you want to go for another order? Type yes or no");
        nextOrder = sc.next();
        if(nextOrder.equals("yes"))
            menuCard();
       else
            System.out.println("Thank you !!! visit again Foodies !!!");
    }

    public void balanceAmountCalculation(){
        if (amountPaid>0) {
            switch (item_id) {
                case 1: {
                    if (amountPaid > 10)
                        balanceAmount = amountPaid - 10;
                        System.out.println("Balance amount given to user:" + balanceAmount);
                    System.out.println("Dispensing Chocolate");
                    amountInVendingMachine=amountInVendingMachine+10;
                    System.out.println("Total amount in the Vending machine :" + amountInVendingMachine);
                    break;
                }
                case 2: {
                    if (amountPaid > 30)
                        balanceAmount = amountPaid - 30;
                    System.out.println("Balance amount given to user:" + balanceAmount);
                    System.out.println("Dispensing IceCream");
                    amountInVendingMachine=amountInVendingMachine+30;
                    System.out.println("Total amount in the Vending machine :" + amountInVendingMachine);
                    break;
                }
                case 3: {
                    if (amountPaid > 140)
                        balanceAmount = amountPaid - 140;
                    System.out.println("Balance amount given to user:" + balanceAmount);
                    System.out.println("Dispensing Burger");
                    amountInVendingMachine=amountInVendingMachine+140;
                    System.out.println("Total amount in the Vending machine :" + amountInVendingMachine);
                    break;
                }
                case 4: {
                    if (amountPaid > 210)
                        balanceAmount = amountPaid - 210;
                    System.out.println("Balance amount given to user:" + balanceAmount);
                    System.out.println("Dispensing Pizza");
                    amountInVendingMachine=amountInVendingMachine+210;
                    System.out.println("Total amount in the Vending machine :" + amountInVendingMachine);
                    break;
                }
                case 5: {
                    if (amountPaid > 50)
                        balanceAmount = amountPaid - 50;
                    System.out.println("Balance amount given to user:" + balanceAmount);
                    System.out.println("Dispensing Sandwich");
                    amountInVendingMachine=amountInVendingMachine+50;
                    System.out.println("Total amount in the Vending machine :" + amountInVendingMachine);
                    break;
                }
                default:
                    System.out.println("Wrong Item_id");
            }
        }

    }

    public static void main(String[] args) {
        VendingMachine cust1 = new VendingMachine();
        cust1.menuCard();

    }
}
