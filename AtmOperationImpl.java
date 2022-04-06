package atmMachine;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
	
	Atm atm=new Atm();
	Map<Double,String> ministmt = new HashMap<>();
	
	
	@Override
	public void viewBalance(){
		System.out.print("Available Balance is :- "+atm.getBalance());
		System.out.println("\n");
	}
	
	@Override
	public void WithdrawAmount(double WithdrawAmount) {
		if(WithdrawAmount%500==0) {
			if(WithdrawAmount<=atm.getBalance()) {
				ministmt.put(WithdrawAmount,"Amount Withdraw");
			
				System.out.println("Collect Your Amount"+WithdrawAmount);
				atm.setBalance(atm.getBalance()-WithdrawAmount);
				viewBalance();
			} else {
				System.out.println("\nInsufficient Balance !!!\n");
				}
		
		}else {
			System.out.println("Amount is Lessthan 500, Amount Should Be 500 Or morethan 500.\n");
		}
	}
	
	@Override
	public void DepositAmount(double DepositAmount) {
		
		ministmt.put(DepositAmount,"Amount Deposited");
		
		System.out.println(DepositAmount+" Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+DepositAmount);
		viewBalance();
		
	}
	@Override
	public void ViewMinistatement() {
		
		for(Map.Entry<Double, String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}
	
}

