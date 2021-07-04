package fr.epita.bank.datamodel;

public class SavingsAccount extends Account {
   private double interestRate;

   public double computeInterest(){
      return interestRate * balance;

   }

   public void withDraw(int moneyAmount){ balance = balance - moneyAmount;
   }

   public  SavingsAccount(double intialBalance, double IntialInterestRate){
      super(intialBalance);
      interestRate = IntialInterestRate;

   }

   public SavingsAccount(){
      super();
   }
}
