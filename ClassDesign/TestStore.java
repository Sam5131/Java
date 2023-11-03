/*2.1 Write java implementation for a class named ‘Item’ which encapsulates the details of items to be purchased by the customer of the XYZ shop. The class Item is described as follows: 

Attributes description:
a)	itemName: String [Name of  the ordered Item of the Customer]
b)	itemidNo: String [unique identification number of  the ordered Item of the Customer]
c)	 itemQuantity: int [quantity of  the ordered Item of the Customer]
d)	 itemPrice: double [price of  the ordered Item of the Customer]

Methods description:
The class supplies the methods(s) as per the following specification:
a)	Any Item instance can be created either by supplying the value for all the instance fields in the order of itemName, itemidNo, itemQuantity and itemPrice OR by supplying the value for itemName, itemidNo and itemQuantity fields only OR by supplying the value for itemName, and itemidNo fields only . If an Item instance is created by providing the value for itemName, itemidNo and itemQuantity fields only then value for itemPrice is by default initialized to 500. If an Item instance is created by providing the value for itemName and itemidNo fields only then value for itemPrice is by default initialized to 500 and value for itemQuantity is by default initialized to 1.
b)	Accessor and mutator methods are provided for every instance field.
c)	All instance field(s) have a private visibility and all methods have a public visibility.

2.2 Write the java implementation for a class named ‘Customer’ which encapsulates the details of registered customers of the XYZ shop who buy Items (class is described above in 2.1) online. The class Customer is described as follows:

Attributes description:
a)	name:String [ Name of  the Customer]
b)	idNo:String [unique identification number of the Customer]
c)	balance:double [balance amount of the Customer]
d)	item: Item [item purchased by the Customer]

Methods description:
The class supplies the methods(s) as per the following specification:
a)	Any Customer instance can be created either by supplying the value for all the instance fields in the order of name, idNo and balance OR by supplying the value for name and idNo fields only. If an Customer instance is created by providing the value for name and idNo fields only then value for balance is by default initialized to 5000.
b)	Accessor methods(s) are provided for every instance field.
c)	Mutator methods(s) are provided for the instance field name and idNo.
d)	Method print() to print the details of item (itemName, itemidNo, iemQuantity and itemPrice) purchased by the customer and balance amount of the customer after purchasing the item.
e)	A method named buyItem(Item item) is supplied. This operation displays details of the item bought and the current balance, if the customer has sufficient balance and the quantity specified by the user is greater than or equal to one. If the customer don’t have the sufficient balance, this method displays the message “Insufficient balance” .If the quantity specified by the user is less than one, this method displays the message “Order is not valid”.
f)	All the field(s) have private visibility and all methods have a public visibility.

2.3 Write a Test class named TestStore.java which 
a)	Creates one Customer instance. [Take input from the user [using Scanner object] for name, idNo and balance fields]
b)	Creates any two Item instances. [Take input from the user [using Scanner object] for itemName, itemidNo, iemQuantity and itemPrice fields]
c)	 Display the details of the Items ordered by the customer and customer balance after order.

Note: Assume only one item (any number of quantities) can be ordered at a time by the customer.
 */
import java.util.*;

class Item {
    private String itemName;
    private String itemidNo;
    private int itemQuantity;
    private double itemPrice;

    public Item(String itemName, String itemidNo) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = 1;
        this.itemPrice = 500.0;
    }

    public Item(String itemName, String itemidNo, int itemQuantity) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = 500.0;
    }

    public Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    // Accessor methods
    public String getItemName() {
        return itemName;
    }

    public String getItemId() {
        return itemidNo;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    // Mutator methods
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemId(String itemidNo) {
        this.itemidNo = itemidNo;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}

class Customer {
    private String name;
    private String idNo;
    private double balance;
    private Item item;

    public Customer(String name, String idNo) {
        this.name = name;
        this.idNo = idNo;
        this.balance = 5000.0;
    }

    public Customer(String name, String idNo, double balance) {
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getIdNo() {
        return idNo;
    }

    public double getBalance() {
        return balance;
    }

    public Item getItem() {
        return item;
    }

     // Mutator methods
     public void setName(String name) {
         this.name = name;
     }
 
     public void setIdNo(String idNo) {
         this.idNo = idNo;
     }
 
     // Other methods
     public void buyItem(Item item) {
         if (item.getItemPrice() * item.getItemQuantity() <= balance && item.getItemQuantity() >= 1) {
             balance -= item.getItemPrice() * item.getItemQuantity();
             System.out.println("Item bought: " + item.getItemName());
             System.out.println("Current balance: " + balance);
             this.item = item; 
         } else if (item.getItemPrice() * item.getItemQuantity() > balance) {
             System.out.println("Insufficient balance");
         } else if (item.getItemQuantity() < 1) {
             System.out.println("Order is not valid");
         }
     }
 
     public void print() {
         System.out.println("Customer Name: " + name);
         System.out.println("Customer ID: " + idNo);
         System.out.println("Item Name: " + item.getItemName());
         System.out.println("Item ID: " + item.getItemId());
         System.out.println("Item Quantity: " + item.getItemQuantity());
         System.out.println("Item Price: " + item.getItemPrice());
         System.out.println("Balance: " + balance);
     }
}

public class TestStore {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         // Create a Customer instance
         System.out.println("Enter customer name:");
         String name = sc.nextLine();
         
         System.out.println("Enter customer ID:");
         String id = sc.nextLine();
         
         System.out.println("Enter customer balance:");
         double balance = sc.nextDouble();
         
         Customer customer = new Customer(name, id, balance);

         // Create two Item instances
         for (int i=0; i<2; i++) {
             System.out.println("Enter item name:");
             String itemName = sc.next();
             
             System.out.println("Enter item ID:");
             String itemId = sc.next();
             
             System.out.println("Enter quantity:");
             int quantity = sc.nextInt();
             
             System.out.println("Enter price:");
             double price = sc.nextDouble();
             
             Item item = new Item(itemName, itemId, quantity, price);
             
             customer.buyItem(item);
             
             customer.print();
          }
          sc.close();
      }
}