package bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit from axis");
	}
public static void main(String[] args) {
	AxisBank bank = new AxisBank();
	bank.deposit();
	bank.fixed();
	bank.saving();
}
}
