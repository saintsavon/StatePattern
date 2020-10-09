import java.rmi.*;
import java.rmi.server.*;

public class ClawMachine extends UnicastRemoteObject implements ClawMachineRemote {
 
	private static final long serialVersionUID = 2L;
	State soldOutState;
	State noPaymentReceived;
	State paymentReceived;
	State soldState;
	State winnerState;
 
	State state = soldOutState;
	int count = 0;
	String location;
 
	public ClawMachine(String location, int numberPrizes) throws RemoteException {
		soldOutState = new SoldOutState(this);
		noPaymentReceived = new NoPaymentReceived(this);
		paymentReceived = new PaymentReceived(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numberPrizes;
 		if (count > 0) {
			state = noPaymentReceived;
		}
		this.location = location;
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
		if (count != 0) {
			count = count - 1;
		}
	}
  
	public void refill(int count) {
		this.count = count;
		state = noPaymentReceived;
	}

	public int getCount() {
		return count;
	}

    public State getState() {
        return state;
	}
	
	public String getLocation() {
		return location;
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