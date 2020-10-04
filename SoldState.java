public class SoldState implements State {
    ClawMachine clawMachine;
 
    public SoldState(ClawMachine clawMachine) {
        this.clawMachine = clawMachine;
    }
       
	public void insertPayment() {
		System.out.println("Please wait, we're already giving you a prize");
	}
 
	public void ejectPayment() {
		System.out.println("Sorry, you already dropped the claw");
	}
 
	public void dropClaw() {
		System.out.println("You can't make another payment!");
	}
 
	public void dispense() {
		clawMachine.dropPrize();
		if (clawMachine.getCount() > 0) {
			clawMachine.setState(clawMachine.getNoPaymentState());
		} else {
			System.out.println("Sorry, we are out of prizes!");
			clawMachine.setState(clawMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "dispensing your prize";
	}
}