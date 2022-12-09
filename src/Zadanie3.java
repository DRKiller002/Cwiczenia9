public class Zadanie3 {
    public void main(String[] args) {

        Account a1 = new Account("Pawel",1500,515151515);
        System.out.println("Witaj w przenosnym bankomacie");
        try {
            a1.withdrawal(2000);
        }
        catch (Account.NotEnoughMoneyException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public class Account{
        String owner;
        int Balance,AccountNumber,TransferAmmount;

        public Account(String owner,int Balance,int AccountNumber){
           this.owner=owner;
           this.Balance=Balance;
           this.AccountNumber=AccountNumber;
        }
        public void getOwner(String newOwner){
            owner=newOwner;
        }
        public String getOwner(){
            return owner;
        }
        public int getBalance(){
            return Balance;
        }
       public int GetWithdraw(){
            return TransferAmmount;
       }
       public void withdrawal(int transferAmmount) throws NotEnoughMoneyException{
            if(Balance>=transferAmmount){
                Balance=Balance-transferAmmount;
            }
            else{
                System.out.println("Not enough funds");
                throw new NotEnoughMoneyException("Not enough funds in the account");
            }
       }
        public static class NotEnoughMoneyException extends Exception {
            public NotEnoughMoneyException(String errorMessage) {
                super(errorMessage);
            }
        }


    }
}
