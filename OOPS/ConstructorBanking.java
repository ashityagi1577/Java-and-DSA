class AccountInfo{
    String acHolder;
    float deposit;
    long acNo;
    int dob;

    public AccountInfo(String h,float dt,long no,int d){
        acHolder=h;
        deposit=dt;
        acNo=no;
        dob=d;
    }

    void display(){
        System.out.println("Account Holder:" + acHolder +"||Deposit "+ deposit + " ||Account Number" + acNo +" || Date of birth" + dob );
    }
}
public class ConstructorBanking {
    public static void main(String[] args){
        AccountInfo ac1=new AccountInfo( "Ashi",  2500, 123456789,  15_07_2007);
        
        ac1.display();

        AccountInfo ac2=new AccountInfo( "B",  1200, 1234555579,  21_05_2009);
        
        ac2.display();
    }
    
}

