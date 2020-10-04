public class ClawMachine {
 
	State soldOutState;
	State noPaymentReceived;
	State paymentReceived;
	State soldState;
	State winnerState;
 
	State state = soldOutState;
	int count = 0;
 
	public ClawMachine(int numberPrizes) {
		soldOutState = new SoldOutState(this);
		noPaymentReceived = new NoPaymentReceived(this);
		paymentReceived = new PaymentReceived(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numberPrizes;
 		if (numberPrizes > 0) {
			state = noPaymentReceived;
		} 
	}
 
	public void insertPayment() {
		state.insertPayment();
	}
 
	public void ejectPayment() {
		state.ejectPayment();
	}
 
	public void dropClaw() {
		state.dropClaw();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void dropPrize() {
		System.out.println("Your prize is dropping... ");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The claw machine was just refilled; its new count is: " + this.count);
		state.refill();
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoPaymentState() {
        return noPaymentReceived;
    }

    public State getHasPaymentState() {
        return paymentReceived;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMega Claw: Can you GRAB IT");
		result.append("\nJava-enabled Standing Claw Machine");
		result.append("\nInventory: " + count + " prize(s)");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}