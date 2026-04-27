import java.util.Scanner;
public class BankAccount {
    Scanner sc=new Scanner(System.in);
    public String owner;
    public int balance;
    public String name;
    public void print(){
        System.out.println(owner+"'s balance is "+balance);
    }
    public int deposit(int balance){
        System.out.println("enter amount to add");
        int amount=sc.nextInt();
        balance+=amount;
        return balance;
    }
    public int withdraw(int balance){
        System.out.println("enter amount to withdraw");
        int amount=sc.nextInt();
        if (balance-amount<0){
            System.out.println("insufficient balance, action cancelled");
            return balance;
        }
        else {
            balance -= amount;
            return balance;
        }
    }
}
