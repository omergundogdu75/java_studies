package ch7_Classes_and_Objects;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account("ÖMER",1);
        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // prompt for and read name
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // read a line of text
        myAccount.setName(theName); // put theName in myAccount

        System.out.println(); // outputs a blank line

        // display the name stored in object myAccount
        System.out.printf("Name in object myAccount is:%n%s%n",
                myAccount.getName()
        );

// create two Account objects
        Account account1 = new Account("Jane Green",1);
        Account account2 = new Account("John Blue",1);

        // display initial value of name for each Account
         System.out.printf("account1 name is: %s%n", account1.getName());
         System.out.printf("account2 name is: %s%n", account2.getName());

    }

}
