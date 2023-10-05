package ch7_Classes_and_Objects;

// Account class that contains a name instance variable
// and methods to set and get its value.
public class Account {
    private String name; // instance variable
    private double balance; // instance variable

    // constructor initializes name with parameter name
    public Account(String name, double balance) { // constructor name is class name
        this.name = name;
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance += depositAmount; // add it to the balance
        }
    }
    // method returns the account balance
    public double getBalance() {
        return balance;
    }
    // method to set the name in the object
    public void setName(String name) {
        this.name = name; // store the name
    }

    // method to retrieve the name from the object
    public String getName() {
        return name; // return value of name to caller
    }


}
