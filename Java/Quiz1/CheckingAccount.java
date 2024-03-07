package bank;
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

  public int getBalance(){
    System.out.println("su saldo es de:" + this.balance);
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
  public void consignar (int montoDepositado){
      this.balance = this.balance + montoDepositado;
  }
  public void retirar (int montoretirado){
      System.out.println("su retiro es de:" + this.balance);
      this.balance = this.balance - montoretirado;
  }
}

