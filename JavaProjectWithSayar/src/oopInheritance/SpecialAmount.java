package oopInheritance;

public class SpecialAmount extends Account {
	public SpecialAmount(String name, double withdraw) {
		super(name);
		this.withdraw = withdraw;
	}

	public void getResult() {
		System.out.println("Username: " + this.name);
		System.out.println("Total Amount: " + getAmount());
		System.out.println("Withdraw Amount: " + this.withdraw);
		System.out.println("Remaining Amount: " + (getAmount() - this.withdraw));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialAmount sa = new SpecialAmount("Ag Ag", 500);
		sa.setAmount(1000);
		sa.getResult();
	}

}
