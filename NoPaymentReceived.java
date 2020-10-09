public class NoPaymentReceived implements State {
	private static final long serialVersionUID = 2L;
    ClawMachine clawMachine;
 
    public NoPaymentReceived(ClawMachine clawMachine) {
        this.clawMachine = clawMachine;
    }
 
	public void insertPayment() {
		System.out.println("You inserted your payment");
		clawMachine.setState(clawMachine.getHasPaymentState());
	}
 
	public void ejectPayment() {
		System.out.println("You haven't inserted your payment");
	}
 
	public void dropClaw() {
		System.out.println("Claw attempted to drop, but there's no payment");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for payment";
	}
}