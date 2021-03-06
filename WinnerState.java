public class WinnerState implements State {
	private static final long serialVersionUID = 2L;
    transient ClawMachine clawMachine;
 
    public WinnerState(ClawMachine clawMachine) {
        this.clawMachine = clawMachine;
    }
 
	public void insertPayment() {
		System.out.println("Please wait, we are already dispensing your prize!");
	}
 
	public void ejectPayment() {
		System.out.println("Please wait, we are already dispensing your prize!");
	}
 
	public void dropClaw() {
		System.out.println("You cannot make another payment!");
	}
 
	public void dispense() {
		System.out.println("YOU'RE A WINNER! Your prize is coming!");
		clawMachine.dropPrize();
			if (clawMachine.getCount() == 0) {
				clawMachine.setState(clawMachine.getSoldOutState());
			} else {
				clawMachine.dropPrize();
				if (clawMachine.getCount() > 0) {
					clawMachine.setState(clawMachine.getNoPaymentState());
				} else {
            		System.out.println("Sorry! We are all out of prizes!");
					clawMachine.setState(clawMachine.getSoldOutState());
					}
				}
			}
 	
	public String toString() {
		return "WOW! You got THREE prizes!! How'd you do it!?";
	}
}