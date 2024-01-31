import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        int a;
        double b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextDouble();
        c=sc.nextDouble();
        Account account = new Account(a,b,c);
        int noOfYears = sc.nextInt();
        sc.close();
        double answer = calculateInterest(account,noOfYears);
        System.out.format("%.3f",answer);
    }
    public static double calculateInterest(Account account,int noOfYears){
        double temp = noOfYears*account.getInterestRate()/100;
        return (account.getBalance()*(account.getInterestRate()+temp)/100);

    }
}

class Account{
    private int id;
    private double balance;
    private double interestRate;
    Account(int id,double balance,double interestRate){
        this.id=id;
        this.balance=balance;
        this.interestRate=interestRate;

    }
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
}
