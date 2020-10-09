public class SoldOutState implements State {
	private static final long serialVersionUID = 2L;
    ClawMachine clawMachine;
 
    public SoldOutState(ClawMachine clawMachine) {
        this.clawMachine = clawMachine;
    }
 
	public void insertPayment() {
		System.out.println("You can't insert payment, the machine is currently sold out");
	}
 
	public void ejectPayment() {
		System.out.println("You can't eject, you haven't inserted your payment yet");
	}
 
	public void dropClaw() {
		System.out.println("Claw attempted to drop, but there's no payment");
	}
 
	public void dispense() {
		System.out.println("No prize dispensed");
	}
	
	public void refill() { 
		clawMachine.setState(clawMachine.getNoPaymentState());
	}
 
	public String toString() {
		return "sold out";
	}
}
