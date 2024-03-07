package bank;
public class Bank{
   private CheckingAccount accountOne;
   private CheckingAccount accountTwo;

   public Bank(){
     accountOne = new CheckingAccount("Aries",0, "1");
     accountTwo = new CheckingAccount("Blanca", 0 , "2");
   }

   public static void main(String[] args){
     Bank bankOfGods = new Bank();
     System.out.println("Balance account1"+bankOfGods.accountOne.getBalance());
     bankOfGods.accountOne.setBalance(0);
     //5 consignments
     System.out.println(bankOfGods.accountOne.getBalance());
     //System.out.println(bankOfGods.accountOne.getMonthlyInterest());
     bankOfGods.accountOne.consignar(1000);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.consignar(5000);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.consignar(600);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.consignar(8000);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.consignar(16000);
     System.out.println(bankOfGods.accountOne.getBalance());
        
     bankOfGods.accountOne.retirar(900);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.retirar(5000);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.retirar(800);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.retirar(6000);
     System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.retirar(4100);
     System.out.println(bankOfGods.accountOne.getBalance());
   
     //account2
     System.out.println("account2"+bankOfGods.accountTwo.getBalance());
     bankOfGods.accountTwo.setBalance(0);
     System.out.println(bankOfGods.accountTwo.getBalance());
     //System.out.println(bankOfGods.accountOne.getMonthlyInterest());
     bankOfGods.accountTwo.consignar(16000);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.consignar(6000);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.consignar(100);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.consignar(400);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.consignar(1500);
     System.out.println(bankOfGods.accountTwo.getBalance());
        
     bankOfGods.accountTwo.retirar(400);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.retirar(200);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.retirar(8000);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.retirar(9000);
     System.out.println(bankOfGods.accountTwo.getBalance());
    
     bankOfGods.accountTwo.retirar(20000);
     System.out.println(bankOfGods.accountTwo.getBalance());
   }
}

