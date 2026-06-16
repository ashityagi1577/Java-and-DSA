class BankAccount{
    private
    int balance;

    public
    void Deposit(int amount){
        if(amount>0){
        balance+=amount;
    }
    else{
        System.out.println("Invalid");
    }
}
    //setter function
    public void Withdrawn(int amount){
        if(amount<0){
            System.out.println("Invalid Amount");
        }
        else if(amount>balance){
             System.out.println("Insufficient fund");
        }
        else{
            balance=balance+amount;

        }
    }



   // getter function
    public
    int getbalance(){
        return balance;
    }
}

public class EncapsulationBankAccount {
    public static void main(String[] args){
    BankAccount b1=new BankAccount();
    b1.Deposit(-5000);
    System.out.println(b1.getbalance());

    BankAccount b2=new BankAccount();
    b2.Deposit(3000);
    System.out.println(b2.getbalance());

    b2.Withdrawn(500);
    System.out.println(b2.getbalance());


}


}     
