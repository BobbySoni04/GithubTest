package atmMachine;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		AtmOperationInterf obj1 = new AtmOperationImpl();
		
		
		int Number = 12345;
		int Pin = 123;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("********@-: WELCOME TO ATM MACHINE :-@******");
		
		System.out.print("Enter Atm Number:-");
		int atmnumber= in.nextInt();
				
		System.out.print("Enter Pin:-");
		int atmpin = in.nextInt();
		
		System.out.println();
		
		if((Number== atmnumber)&&(Pin == atmpin)) {
			
			while(true) {
				System.out.println("1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Ministatement\n5. Exit");
				
				System.out.println();
				
				System.out.print("Enter Your Operation:- ");
				int operation=in.nextInt();
				System.out.println();
				if(operation == 1) {
					obj1.viewBalance();
				}
				else if(operation == 2) {
					
					System.out.print("Enter Amount To Withdraw:- ");
					double WithdrawAmount=in.nextDouble();
					obj1.WithdrawAmount(WithdrawAmount);
					
				}
				
				else if(operation == 3) {
					System.out.print("Enter Amount To Deposit:- ");
					double DepositAmount=in.nextDouble();
					obj1.DepositAmount(DepositAmount);
				}
				
				else if(operation == 4) {
					
					obj1.ViewMinistatement();
				
				}
				else if(operation == 5) {
					System.out.println("\nCollect Your Atm Card\n\n *************@-:Thank You For Using Atm Machine:-@**************");
					System.exit(0);
				}
				else {
					
					System.out.println("\n\n ****ERROR**** \n\nPlease Make Correct Operation\n\n Try It Again\n\n");
				}
			}
		}
		else {
			System.out.println("Incorrect Atm Number Or Pin");
			System.exit(0);
		}
		
		
	}

}
