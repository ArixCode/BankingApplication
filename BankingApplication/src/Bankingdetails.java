import java.util.Scanner;

class Bankdetails{



    String name;
    String age;
    String gender;
    String accountnumber;
    double balance;

    Scanner sc = new Scanner(System.in);

// Method for creating an account

    public void openAccount(){
        System.out.println("Please enter your name: ");
        name = sc.next();
        System.out.println("Please enter your age: ");
        age = sc.next();
        System.out.println("Please enter your gender: ");
        gender = sc.next();
        System.out.println("Please enter your account number: ");
        accountnumber = sc.next();
        System.out.println("Please enter the amount you want to deposit: ");
        balance = sc.nextDouble();
    }

    // Method for displaying your account infos
    public void displayAccount(){
        System.out.println("Your name is: " +name);
        System.out.println("Your age is: "+age);
        System.out.println("Your gender is: "+gender);
        System.out.println("Your account no. is: "+accountnumber);
        System.out.println("Your account balance is: "+balance);
    }

    // Method to deposit money
    public void deposit(){
        double amount;
        System.out.println("Enter the amount you want to deposit: ");
        amount = sc.nextDouble();
        balance = balance + amount;
    }

    // Method to withdraw money
    public void withdraw(){
        double amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount = sc.nextDouble();
        if (balance>=amount){
            balance = balance - amount;
            System.out.println("Your current balance is: "+balance+ "$");
        }else{
            System.out.println("You don't have enough money in your account");
        }

    }

    //method to search an account number
    public boolean search(String accno) {
        if (accountnumber.equals(accno)) {
            displayAccount();
            return (true);
        }
        return (false);
    }
}