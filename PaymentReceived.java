import java.util.Random;

public class PaymentReceived implements State {
	private static final long serialVersionUID = 2L;
	Random randomWinner = new Random(System.currentTimeMillis());
	ClawMachine clawMachine;
 
	public PaymentReceived(ClawMachine clawMachine) {
		this.clawMachine = clawMachine;
	}
  
	public void insertPayment() {
		System.out.println("You have already paid");
	}
 
	public void ejectPayment() {
		System.out.println("Payment returned");
		clawMachine.setState(clawMachine.getNoPaymentState());
	}
 
	public void dropClaw() {
		System.out.println("Claw dropped... ");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (clawMachine.getCount() > 1)) {
			clawMachine.setState(clawMachine.getWinnerState());
		} else {
			clawMachine.setState(clawMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("No prize dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for claw to be dropped";
	}
}