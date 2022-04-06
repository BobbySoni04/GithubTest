package atmMachine;

public class Atm {
	
	private double Balance;
	private double DepositAmount;
	private double WithdrawAmount;
	
//	default constructor
	
	public Atm() {
		
		
	}
	
//	getter setter
	
	public double getBalance() {
		return Balance;
	}
	
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	
	public double getDepositAmount() {
		return DepositAmount;
	}
	
	public void setDepositAmount(double DepositAmount) {
		this.DepositAmount = DepositAmount;
	}
	
	public double getWithdrawAmount() {
		return WithdrawAmount;
	}
	
	public void setWithdrawAmount(double WithdramAmount) {
		this.WithdrawAmount = WithdrawAmount;
	}
	
	
	
	
}
